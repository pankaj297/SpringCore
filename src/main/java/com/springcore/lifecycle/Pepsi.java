package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
    private double price;

    //setter and getter
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	//default constructor
	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		return "Pepsi Price = " + price + "₹";
	}
	

	@Override
	public void afterPropertiesSet() throws Exception {
		// init
		
		System.out.println("Taking Pepsi..!");	
	}
	
	@Override
	public void destroy() throws Exception {
		// destroy
		System.out.println("Going to put bottle back to shop : destroy...!");
		
	}
	
	
    
	
	
    
	
}
