package com.springcore.ref;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		//Refernce Type Injection
		
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");

	A a1 = (A) context.getBean("aref1");
	
	System.out.println(a1.getX());
	
	System.out.println(a1.getOb().getY());
	
	System.out.println(a1);
	
	}

}
