package com.springcore.auto.wire.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {


	  ClassPathXmlApplicationContext context =	new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/annoconfig.xml");

	  Emp e1 = (Emp) context.getBean("emp1", Emp.class);
	  
	  System.out.println(e1);
	  
	}

}
 