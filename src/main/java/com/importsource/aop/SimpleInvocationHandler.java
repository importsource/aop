package com.importsource.aop;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.importsource.aop.core.annotation.AOP;


/**
 * 
 * 
 * @author Hezf
 */
public class SimpleInvocationHandler implements InvocationHandler {

	private Object source = null;


	public Object getSource() {
		return source;
	}

	public void setSource(Object source) {
		this.source = source;
	}


	/**
	 * 委托方法
	 * 
	 * @param proxy
	 *            代理对象
	 * @param method
	 *            代理方法
	 * @param args
	 *            方法参数
	 */
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Annotation[] annotations = method.getDeclaredAnnotations();
		for (int j = 0; j < annotations.length; j++) {
			String val = ((AOP) annotations[j]).value();
			Aspect aspect = (Aspect) this.getClass().forName(val).newInstance();
			aspect.doBefore();
		}

		Object retObj = method.invoke(getSource(), args);

		for (int index = annotations.length - 1; index >= 0; index--) {
			String val = ((AOP) annotations[index]).value();
			Aspect aspect = (Aspect) this.getClass().forName(val).newInstance();
			aspect.doAfter();
		}

		return retObj;
	}


}