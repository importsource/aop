package com.importsource.aop;

public class StudentAspectOne implements Aspect {

	public void doAfter() {
		System.out.println("do After One");
		
	}

	public void doBefore() {
		System.out.println("do Before One");
		
	}

}
