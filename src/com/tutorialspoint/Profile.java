package com.tutorialspoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
	@Autowired
	@Qualifier("student2")
	private Student student;

	/**
	 * The default constructor 
	 */
	public Profile() {
		System.out.println("Inside Profile constructor.");
	}
	
	public void printAge(){
		System.out.println("Age : " + this.student.getAge());
	}
	
	public void printName(){
		System.out.println("Name : " + this.student.getName());
	}
	
}