package com.kiun.poiexcore.uilts;

import com.fel.Expression;
import com.fel.FelEngine;
import com.fel.FelEngineImpl;
import com.fel.context.FelContext;
import com.fel.context.MapContext;
import com.fel.parser.FelNode;

import java.util.HashMap;
import java.util.Map;

public class FelUtil {
    static FelEngine felEngine = new FelEngineImpl();

    private static Map<String, Expression> allExpression = new HashMap<>();

    public static Object exec(String exp, Map<String, Object> map) {

        if (exp == null) {
            return null;
        }

        Expression e;
        if (allExpression.containsKey(exp)){
            e = allExpression.get(exp);
        }else{
            e = felEngine.parse(exp);
            allExpression.put(exp, e);
        }

        FelContext context = new MapContext(map);
        try{
            return e.eval(context);
        }catch (Throwable ex){
            return null;
        }
    }

    public static FelNode parse(String exp){
        return felEngine.parse(exp);
    }
}
