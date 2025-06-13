package com.springcore.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
   ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/collections/empconfig.xml");
	  
	  Emp emp1 =  (Emp) context.getBean("emp1"); //Type cast
	  
	  //Wtihout toString 
//	  System.out.println(emp1.getName());
//	  System.out.println(emp1.getPhones());
//	  System.out.println(emp1.getAddresses());
//	  System.out.println(emp1.getCourses());
//	  System.out.println(emp1.getProp());
	  System.out.println(emp1.getPhones().getClass().getName());
	  
	  //With toString 
	  System.out.println(emp1);
	  

	}

}
