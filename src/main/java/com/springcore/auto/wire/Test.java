package com.springcore.auto.wire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {


	  ClassPathXmlApplicationContext context =	new ClassPathXmlApplicationContext("com/springcore/auto/wire/autoconfig.xml");

	  Emp e1 = (Emp) context.getBean("emp1", Emp.class);
	  
	  System.out.println(e1);
	  
	}

}
 