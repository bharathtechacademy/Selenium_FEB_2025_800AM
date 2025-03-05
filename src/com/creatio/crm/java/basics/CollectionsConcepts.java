package com.creatio.crm.java.basics;

public class CollectionsConcepts {
	
	//Array Can Store Multiple Values With Same Data Type together at Same memory Location
	
	//Challenges with Array
	
	// 1. Arrays are fixed in length
	// 2. Array follows static memory allocation
	// 3. Arrays won't allow modifications
	// 4. Array allows only similar data types
	
	
	//Collections Framework ==> can solve all the above challenges of arrays
	
	// List ==> ArrayList, LinkedList	
	// 1. List can store multiple values with similar data type together at same memory location by allocating memory dynamically
	// 2. List allows duplicate values
	// 3. List can follow dynamic memory allocation
	// 4. List allows modifications
	
	// Set ==> HashSet, LinkedHashSet and TreeSet
	// 1. Set can store multiple values with similar data type together at one place by allocating memory dynamically
	// 2. Set won't allows duplicate values
	// 3. Set can follow dynamic memory allocation
	// 4. Set allows modifications
	
	// Map ==> HashMap, LinkedHashMap, TreeMap and Hashtable
	

	public static void main(String[] args) {
		
		int [] empIds = new int [3];
		empIds[0] = 1234;
		empIds[1] = 1235;
		empIds[2] = 1236;
		empIds[3] = 1237;
		

	}

}
