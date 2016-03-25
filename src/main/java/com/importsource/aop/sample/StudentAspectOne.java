package com.importsource.aop.sample;

import com.importsource.aop.client.Aspect;

public class StudentAspectOne implements Aspect {

	public void doAfter() {
		System.out.println("do After One");
		
	}

	public void doBefore() {
		System.out.println("do Before One");
		
	}

}
