package com.creatio.crm.java.basics;

public class CommentsInJava {
	
	// Comments in java are 3 categories
	
	// 1. Single line comments ==> Starts with // ==> Used for short and specific notes about logic or functionality (Control +/)
	// 2. Multi-line comments ==>Starts with /*... ends with...*/ ==> detailed explanation about some functionality or logic
	// 3. Documentation Comments ==> Starts with /**... ends with...*/  ==> To generate detailed documentation about specific functionality or module
	

	/*
	 * This is main method 
	 * Always JVM execution will begin from this main method
	 * Without main method we cannot run the program  (Control+Shift+/)
	 */
	
	/**
	 * 
	 * This is main method and Always JVM execution will begin from this main method
	 * Without main method we cannot run the program  (Control+Shift+/)
	 * 
	 * @author Bharath (BharathTechAcademy@Gmail.com)
	 * 
	 * @version 0.1
	 * 
	 * @param what is the input value or parameters we need to provide to run the logic
	 * 
	 * @return what is the outcome of this logic
	 * 
	 * @throws What are all the possible errors we may get during the execution
	 * 
	 * @deprecated this code is out dated , we do not use this code
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println("Hello World");
	}

}
