package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Water {
     private String type;

     //setter and getter

 	public String getType() {
 		return type;
 	}

 	public void setType(String type) {
 		this.type = type;
 	}

	//default constructor
	public Water() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Water Type = " + type;
	}

	@PostConstruct
    public void start() {
    	System.out.println("Starting Method...!");
    }
    
	@PreDestroy
    public void end() {
    	System.out.println("Ending Method...!");
    }
     
}

