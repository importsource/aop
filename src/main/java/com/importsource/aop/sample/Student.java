package com.importsource.aop.sample;

import com.importsource.aop.core.annotation.AOP;

public interface Student {
	@AOP(value = "com.importsource.aop.sample.StudentAspectTwo")
	public void sayHello();

	@AOP(value = "com.importsource.aop.sample.StudentAspectTwo")
	public void sayHi();
}
