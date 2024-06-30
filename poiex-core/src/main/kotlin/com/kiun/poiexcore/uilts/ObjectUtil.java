package com.kiun.poiexcore.uilts;

import java.lang.reflect.*;
import java.util.Map;

public class ObjectUtil {

    public static class InvokeHandler{

        private Method method = null;

        private InvokeHandler(Class<?> clz, String name, Class<?> ... classes){
            try {
                method = clz.getDeclaredMethod(name, classes);
                method.setAccessible(true);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        public void invoke(Object object, Object... params){

            if (method != null) {
                try {
                    method.invoke(object, params);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 寻找公私有方法.
     * @param clz
     * @param name
     * @param classes
     * @return
     */
    public static InvokeHandler findMethod(Class<?> clz, String name, Class<?> ... classes){
        return new InvokeHandler(clz, name, classes);
    }

    public static Class getGenericClass(ParameterizedType parameterizedType, int i) {
        Object genericClass = parameterizedType.getActualTypeArguments()[i];
        if (genericClass instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) genericClass).getRawType();
        } else if (genericClass instanceof GenericArrayType) {
            return (Class) ((GenericArrayType) genericClass).getGenericComponentType();
        } else if (genericClass instanceof TypeVariable) {
            return getClass(((TypeVariable) genericClass).getBounds()[0], 0);
        } else {
            return (Class) genericClass;
        }
    }

    public static Class getClass(Type type, int i) {
        if (type instanceof ParameterizedType) {
            return getGenericClass((ParameterizedType) type, i);
        } else if (type instanceof TypeVariable) {
            return getClass(((TypeVariable) type).getBounds()[0], 0);
        } else {
            return (Class) type;
        }
    }

    public static <T> Class getTClass(T t) {

        Type[] params = t.getClass().getGenericInterfaces();
        Type type = params[0];
        Type finalNeedType;
        if (params.length > 1) {
            if (!(type instanceof ParameterizedType)) throw new IllegalStateException("没有填写泛型参数");
            finalNeedType = ((ParameterizedType) type).getActualTypeArguments()[0];
        } else {
            finalNeedType = type;
        }
        final Class clazz = getClass(finalNeedType, 0);
        return clazz;
    }

    private static Class<?>[] getObjectClass(Object... values){

        Class<?>[] classes = new Class[values.length];

        for (int i = 0; i < values.length; i++) {
            classes[i] = values[i].getClass();
        }
        return classes;
    }

    public static boolean isEmpty(Object object){

        for (Field field : object.getClass().getDeclaredFields()){
            try {
                field.setAccessible(true);
                if (!Modifier.isStatic(field.getModifiers()) && field.get(object) != null){
                    return false;
                }
            } catch (IllegalAccessException e) {
            }
        }
        return true;
    }

    public static<T> T getValue(Object object, String fieldName, Class<T> clz){

        if (object instanceof Map){
            return (T) ((Map<?, ?>) object).get(fieldName);
        }
        try {
            Field field = object.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            Object value = field.get(object);

            if (clz == null){
                return (T) value;
            }

            if (value != null && clz.isAssignableFrom(value.getClass())){
                return (T) value;
            }
        } catch (NoSuchFieldException | IllegalAccessException e) {
        }
        return null;
    }

    public static Field getField(Class clz, String fieldName){

        try {
            Field field = clz.getDeclaredField(fieldName);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException e) {
        }
        return null;
    }

    /**
     * 尝试多个赋值，任意值可填充均返回成功
     * @param object
     * @param fieldName
     * @param values
     * @return
     */
    public static boolean setValue(Object object, String fieldName, Object[] values){

        for (Object value : values) {
            if (setValue(object, fieldName, value, false)){
                return true;
            }
        }
        return false;
    }

    public static boolean setValue(Object object, String fieldName, Object value, boolean noCover){
        try {
            //不覆盖原有值
            if (noCover && getValue(object, fieldName, Object.class) != null){
                return false;
            }

            Field field = object.getClass().getDeclaredField(fieldName);
            if(value == null || !field.getType().equals(value.getClass()) || !field.getType().isAssignableFrom(value.getClass())){
                return false;
            }
            field.setAccessible(true);
            field.set(object, value);
        } catch (NoSuchFieldException | IllegalAccessException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return true;
    }

    public static boolean setValue(Object object, String fieldName, Object value){
        return setValue(object, fieldName, value, false);
    }

    public static <T> T get(Object object, String methodName, Class<T> clz){

        try {
            Method method = object.getClass().getMethod(methodName);
            Object value = method.invoke(object);
            if (value != null && clz.isAssignableFrom(value.getClass())){
                return (T) value;
            }
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
