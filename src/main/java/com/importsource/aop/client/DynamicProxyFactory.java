package com.importsource.aop.client;

import java.lang.reflect.Proxy;

import com.importsource.aop.core.SimpleInvocationHandler;

/**
 * 客户端需要使用这个工厂类来生成逻辑实例，然后做下一步操作。
 * 
 * @author Hezf
 */
public class DynamicProxyFactory {
	
	/**
	 * 私有构造方法
	 */
	private DynamicProxyFactory() {}
	
	
	/**
	 * 工厂方法
	 * 
	 * @param instance 代理目标类实例对象
	 */
	public static Object newInstance(Object instance) {
		SimpleInvocationHandler hander = new SimpleInvocationHandler();
		hander.setSource(instance);
		return Proxy.newProxyInstance(instance.getClass().getClassLoader(), 
									  instance.getClass().getInterfaces(), 
									  hander);
	}
}