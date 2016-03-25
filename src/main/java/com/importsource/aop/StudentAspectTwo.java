package com.importsource.aop;

public class StudentAspectTwo implements Aspect{
	public void doAfter() {
		System.out.println("do After Two");
		
	}

	public void doBefore() {
		System.out.println("do Before Two");
		
	}
}

