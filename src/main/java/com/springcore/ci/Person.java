package com.springcore.ci;

public class Person {
    private String name;
    private int personId;
	private Certification certification;
    
	public Person(String name, int personId, Certification certification) {
//		super();
		this.name = name;
		this.personId = personId;
		this.certification = certification;
	}

	@Override
	public String toString() {
		return "Person Name =  " + name + ",\npersonId = " + personId + ",\n{ certification = " + certification + "} ";
		
	}
	
	
}
