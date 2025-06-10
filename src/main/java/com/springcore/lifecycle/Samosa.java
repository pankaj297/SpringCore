package com.springcore.lifecycle;

public class Samosa {
    private double price;

    //getter and setter
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}
	

	//constructor empty
	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "Samosa price = " + price + "₹" ;
	}
	
	// This Method for Initialization 
	public void init() {
		System.out.println("Inside Init Method...!");
	}
    
	public void destroy() {
		System.out.println("Inside destroy Method...!");
	}
}
