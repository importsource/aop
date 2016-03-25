package com.importsource.aop;

/**
 * 切面接口
 */
public interface Aspect {
	
	/**
	 * 事先执行
	 */
	public void doBefore();
	
	/**
	 * 事后执行
	 */
	public void doAfter();
}