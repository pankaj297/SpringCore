package com.springcore.sterotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//Automatic object create using @component
@Component
@Scope("prototype")
public class Student {
	@Value("Pankaj Naik")
    private String studentName;
    @Value("pune")
    private String city;
    @Value("#{numlist}")
    private List<Long> phoneNumber;
    
    //setter and getter
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public List<Long> getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(List<Long> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	@Override
	public String toString() {
		return "Student [studentName = " + studentName + ", city = " + city + ",\n phoneNumber = " + phoneNumber + "]";
	}
	
	
	
    
}
