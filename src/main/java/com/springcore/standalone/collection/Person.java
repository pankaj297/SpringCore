package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.*;

public class Person {
  private List<String> friends;
  private Map<String, Integer> fees;
  private Properties properties;
  

//setter and getter
  

public List<String> getFriends() {
	return friends;
}

public void setFriends(List<String> friends) {
	this.friends = friends;
}

public Map<String, Integer> getFees() {
	return fees;
}

public void setFees(Map<String, Integer> fees) {
	this.fees = fees;
}


public Properties getProperties() {
	return properties;
}

public void setProperties(Properties properties) {
	this.properties = properties;
}


@Override
public String toString() {
	return "Person [friends=" + friends + ", fees=" + fees + ", properties=" + properties + "]";
}


  
}
