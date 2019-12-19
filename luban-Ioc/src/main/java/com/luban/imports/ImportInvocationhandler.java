package com.luban.imports;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Auther: tianchao
 * @Date: 2019/12/8 22:37
 * @Description:
 */
public class ImportInvocationhandler implements InvocationHandler {
	private Object target;
	public ImportInvocationhandler(Object target){
		this.target = target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("我是代理对象");
		return method.invoke(target,args);
	}
}
