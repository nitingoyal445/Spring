package com.capgemini;

import javax.security.auth.Destroyable;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean,DisposableBean {
private String name;
private int id;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
/**
 * @param name
 * @param id
 */
public Employee(String name, int id) {
	super();
	this.name = name;
	this.id = id;
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
@Override
public void afterPropertiesSet() throws Exception {
	System.out.println("initial");
}
@Override
public void destroy() throws Exception {
	System.out.println("destroy");
	
}  
}
