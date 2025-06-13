package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


//@Configuration
//@ComponentScan(basePackages="com.springcore.javaconfig")

@Configuration
public class JavaConfig {
  
	@Bean
	public Samosa getSamosa() {
//		Samosa s1 = new Samosa();
//		return s1;
		
		return new Samosa();
		
	}
	
	//object name
	@Bean(name = {"student", "std"})
	public Student getStudent() {
		
		//creatin new object
		Student student = new Student(getSamosa());
		
		return student;
				
	}
	
}
