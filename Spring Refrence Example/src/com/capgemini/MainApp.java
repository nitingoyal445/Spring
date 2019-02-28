package com.capgemini;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		    Employee employee=(Employee)context.getBean("employeebean");
		      
		  
		    employee.displayInfo();  
            System.out.println(employee.getAddress().getCity());
	}

}
