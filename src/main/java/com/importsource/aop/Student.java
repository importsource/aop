package com.importsource.aop;
public interface Student {
	@AOP(value="com.importsource.aop.StudentAspectTwo")
	public void sayHello();
	@AOP(value="com.importsource.aop.StudentAspectTwo")
	public void sayHi();
}
