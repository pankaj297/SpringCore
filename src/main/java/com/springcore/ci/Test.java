package com.springcore.ci;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
 
	             
	 Person p1 = (Person) context.getBean("person"); //Type cast
	 
	 System.out.println(p1);
	 
	  Addition add = (Addition) context.getBean("add");
	  
	  add.doSum();
	 
	}

}
