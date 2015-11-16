package com.tutorialspoint;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
		Profile profile = (Profile)applicationContext.getBean("profile");

		System.out.println();
		profile.printName();
		profile.printAge();

		HelloWorld helloWorld = (HelloWorld)applicationContext.getBean("helloWorld");
		helloWorld.getMessage();

		((AbstractApplicationContext)applicationContext).registerShutdownHook();
		((AbstractApplicationContext)applicationContext).close();
	}

}
