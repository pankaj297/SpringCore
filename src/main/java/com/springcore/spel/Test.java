package com.springcore.spel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
	  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/spelconfig.xml");

	  Student d1 = context.getBean("student", Student.class);
	  
	  System.out.println(d1);
	}

}
