package com.springcore.javaconfig;

//import org.springframework.stereotype.Component;

//@Component
public class Student {
	
	private Samosa samosa;
	
	
    //setter and getter
	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	//constructor
	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	
	

	public void study() {
		this.samosa.display();
		System.out.println("Student Read Book...!");
	}
	
}
