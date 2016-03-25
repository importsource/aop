package com.importsource.aop.sample;

import com.importsource.aop.client.Aspect;

public class StudentAspectTwo implements Aspect{
	public void doAfter() {
		System.out.println("do After Two");
		
	}

	public void doBefore() {
		System.out.println("do Before Two");
		
	}
}

