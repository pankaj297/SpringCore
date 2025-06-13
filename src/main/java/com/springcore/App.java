
package com.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	@SuppressWarnings("resource")
    public static void main(String[] args){
        System.out.println( "Hello World!" );
        // Instantianting a container - on 69 page 
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student1 = (Student) context.getBean("student1"); //Type cast
        System.out.println(student1);
        Student student2 = (Student) context.getBean("student2"); //Type cast
        System.out.println(student2);
        
    }
}

