package com.fel.parser;

import com.fel.common.ArrayUtils;
import com.fel.common.Null;
import com.fel.common.ReflectUtil;
import com.fel.compile.FelMethod;
import com.fel.compile.InterpreterSourceBuilder;
import com.fel.compile.SourceBuilder;
import com.fel.context.FelContext;
import com.fel.exception.EvalException;
import com.fel.function.CommonFunction;
import com.fel.function.FunMgr;
import com.fel.function.Function;
import com.fel.function.operator.Dot;
import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/**
 * 函数节点
 *
 * @author yqs
 *
 */
public class FunNode extends AbstFelNode {
	private Function fun;

	private Integer lastHash;

	private Method methodCache;

	private HashMap<Integer, Method> allCaches = new HashMap<>();

	public Function getFun() {
		return fun;
	}

	private static final Function NOT_FOUND_FUN = new Function() {

		@Override
		public String getName() {
			return "未知函数";
		}

		@Override
		public Object call(FelNode node, FelContext context) {
			throw new EvalException("找不到函数[" + node.getText() + "]", null);
		}

		@Override
		public FelMethod toMethod(FelNode node, FelContext ctx) {
			return null;
		}
	};

	public FunNode(CommonTree node) {
		super(node);
	}

	public FunNode(Token token) {
		super(token);
	}

//	{
//		initFun();
//	}

	@Override
	public Object interpret(FelContext context, FelNode node) {
		return fun.call(this, context);
	}


	public void initFun(FunMgr funMgr) {
		fun = funMgr.getFun(getText());
		if (fun == null) {
			fun = NOT_FOUND_FUN;
		}
	}

	@Override
	public SourceBuilder toMethod(FelContext ctx) {
		if(this.builder!=null){
			return builder;
		}
		if(!this.isDefaultInterpreter()){
			return InterpreterSourceBuilder.getInstance();
		}
		return this.fun.toMethod(this, ctx);
	}

	@Override
	public Object invoke(Object obj, Class<?> contextClass, FelContext context) {

		Class<?>[] argsType = new Class<?>[0];
		Object[] args = CommonFunction.evalArgs(this, context);

		if (!ArrayUtils.isEmpty(args)) {
			argsType = new Class[args.length];
			for (int i = 0; i < args.length; i++) {
				if (args[i] == null) {
					argsType[i] = Null.class;
					continue;
				}
				argsType[i] = args[i].getClass();
			}
		}

		int hash = toHash(contextClass, argsType);

		Method method = (lastHash != null && hash == lastHash) ? methodCache : null;

		if (lastHash != null && methodCache == null){
			//方法找不到，下次直接跳过
			return null;
		}

		if (method == null && allCaches.containsKey(hash)){
			method = allCaches.get(hash);
			lastHash = hash;
			methodCache = method;
		}

		if (method == null){
			String methodName = this.getText();
			method = findMethod(contextClass, methodName, argsType);
			lastHash = hash;
			methodCache = method;
			allCaches.put(lastHash, methodCache);
		}

		if (method != null){
			return Dot.invoke(obj, method, args);
		}
		return null;
	}

	private int toHash(Class<?> clz, Class<?>[] argsType){
		return Objects.hash(clz, Arrays.hashCode(argsType));
	}

	private Method findMethod(Class<?> cls, String methodName, Class<?>[] argsType) {
		return ReflectUtil.findMethod(cls, methodName, argsType);
	}

	private Method getMethod(Class<?> cls, String methodName, Class<?>[] argsType) {
		return ReflectUtil.getMethod(cls, methodName, argsType);
	}

	@Override
	public boolean stable() {
		if(this.fun instanceof Stable){
			// 函数是稳定的，并且参数是稳定的
			return ((Stable)fun).stable()&&this.isChildrenStable();
		}
		return false;
	}
}
