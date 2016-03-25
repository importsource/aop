package com.importsource.aop.client;

/**
 * 切面接口。客户端定制化切面逻辑，需要实现该接口。
 * @author Hezf
 */
public interface Aspect {
	
	/**
	 * 逻辑方法执行之前执行
	 */
	public void doBefore();
	
	/**
	 * 逻辑方法执行之后执行
	 */
	public void doAfter();
}