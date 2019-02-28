package com.capgemini;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		context.registerShutdownHook();
		Employee employee=(Employee)context.getBean("employeebean");
		      
		  
        employee.displayInfo();  
      
	}

}
