package com.capgemini;

public class Employee {
private String name;
private int id;
private Address address;
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

public void displayInfo(){  
    System.out.println("Hello: "+name);  
    System.out.println("Id: "+id);
}  
}
