package com.springcore.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	  ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifeconfig.xml");
		          //Type Casting
	  Samosa s1 = (Samosa) context.getBean("samosa1");
	  
	  System.out.println(s1);
	  
	  
	  // registering shutdown hook
	  context.registerShutdownHook();
	  
	  
	  System.out.println("-----------------------------------------------------------------");
	  
	 Pepsi p1 = (Pepsi) context.getBean("p1");
	 
	 System.out.println(p1);
	 
	 System.out.println("-------------------------------------------------------------------");
	 
	 Water w = (Water) context.getBean("water");
	
	 System.out.println(w);
	
	
	 
	
	}

}

