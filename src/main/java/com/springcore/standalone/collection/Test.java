package com.springcore.standalone.collection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
   public static void main(String[] args) {
	   
	
	   ClassPathXmlApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/standalone/collection/alonconfig.xml");
   
	   Person p1 = (Person) context.getBean("person1", Person.class);
	   
	   System.out.println(p1);
	   System.out.println(p1.getFriends().getClass().getName());
	   System.out.println("------------------------------------");
	   System.out.println(p1.getFees());
	   System.out.println(p1.getFees().getClass().getName());
	   System.out.println("-----------------------");
	   System.out.println(p1.getProperties());
	   
	   
	   
   }
}
