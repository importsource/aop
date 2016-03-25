package com.importsource.aop;

import com.importsource.aop.core.annotation.AOP;

public interface Student {
	@AOP(value="com.importsource.aop.StudentAspectTwo")
	public void sayHello();
	@AOP(value="com.importsource.aop.StudentAspectTwo")
	public void sayHi();
}
