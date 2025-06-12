package com.springcore.sterotype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
	 ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/sterotype/stereoconfig.xml");

	 Student student = context.getBean("student", Student.class);
	 
	 System.out.println(student);
	 System.out.println("-----------------------------------------------------");
	 //System.out.println(student.getPhoneNumber());
	 System.out.println(student.getPhoneNumber().getClass().getName());
	 
	 System.out.println("----------------------------------------");
	 
	 System.out.println(student.hashCode());
	 
	 Student student2 = context.getBean("student", Student.class);
	 
	 System.out.println(student2.hashCode());
	 
	 
	 System.out.println("----------------------------------------------");
	 Teacher t1 = context.getBean("teacher", Teacher.class);
	 Teacher t2 = context.getBean("teacher", Teacher.class);
	 
	 
	 System.out.println(t1.hashCode());
	 System.out.println(t2.hashCode());
	}

	
}
