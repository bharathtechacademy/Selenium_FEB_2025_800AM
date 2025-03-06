package com.creatio.crm.java.basics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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
//	1. Map can store multiple datatypes together in the form of Key and Values
//	2. Map can store duplicate values but, duplicate keys are not allowed
//	3. Map can follow dynamic memory allocation
//	4. Map can allow modifications


	public static void main(String[] args) {
		
		int [] empIds = new int [3];
		empIds[0] = 1234;
		empIds[1] = 1235;
		empIds[2] = 1236;
		
		System.out.println(empIds.length);
		
		/*********************ArrayList*************************/
		System.out.println("*********************ArrayList*************************");
		
		//Syntax to Initialize: Collection <DataType> variable = new Collection<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to get the data: variable.get(index);
		//Syntax to remove the data:variable.remove(value);
		//Syntax to get the total value : variable.size();
		
		//ArrayList follows contiguous memory allocation
		//ArrayList follows Insertion order
		//ArrayList allow null values
		
		List<Integer> empIdsArrayList = new ArrayList<Integer>();
		List<String> empNamesArrayList = new ArrayList<String>();
		empNamesArrayList.add("Ashok");
		empNamesArrayList.add("Maha");
		empNamesArrayList.add("Afreen");
		empNamesArrayList.add("Ajay");
		empNamesArrayList.add("Bharath");
		empNamesArrayList.add("Ashok");
		empNamesArrayList.add(null);
		empNamesArrayList.remove("Bharath");
		
		System.out.println(empNamesArrayList.get(1)); //get 2nd value
		System.out.println("Size of ArrayList is :"+empNamesArrayList.size());
		System.out.println(empNamesArrayList);
		
		/*********************LinkedList*************************/
		System.out.println("*********************LinkedList*************************");
		
		//Syntax to Initialize: Collection <DataType> variable = new Collection<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to get the data: variable.get(index);
		//Syntax to remove the data:variable.remove(value);
		//Syntax to get the total value : variable.size();
		
		//LinkedList won't follow contiguous memory allocation
		//LinkedList follows Insertion order
		//LinkedList allow null values
		
		List<String> empNamesLinkedList = new LinkedList<String>();
		empNamesLinkedList.add("Ashok");
		empNamesLinkedList.add("Maha");
		empNamesLinkedList.add("Afreen");
		empNamesLinkedList.add("Ajay");
		empNamesLinkedList.add("Bharath");
		empNamesLinkedList.add("Ashok");
		empNamesLinkedList.add(null);
		empNamesLinkedList.remove("Bharath");
		
		System.out.println(empNamesLinkedList.get(1)); //get 2nd value
		System.out.println("Size of LinkedList is :"+empNamesLinkedList.size());
		System.out.println(empNamesLinkedList);
		
		/*********************HashSet*************************/
		System.out.println("*********************HashSet*************************");
		
		//Syntax to Initialize: Collection <DataType> variable = new Collection<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to remove the data:variable.remove(value);
		//Syntax to get the total value : variable.size();
		
		//HashSet won't follow contiguous memory allocation
		//Order of Storing : Random Order
		//Null Values : Allowed
		
		Set<String> empNamesHashSet = new HashSet<String>();
		empNamesHashSet.add("Ashok");
		empNamesHashSet.add("Maha");
		empNamesHashSet.add("Afreen");
		empNamesHashSet.add("Ajay");
		empNamesHashSet.add("Bharath");
		empNamesHashSet.add("Ashok");
		empNamesHashSet.add(null);
		empNamesHashSet.remove("Bharath");
		
		System.out.println("Size of HashSet is :"+empNamesHashSet.size());
		System.out.println(empNamesHashSet);
		
		/*********************LinkedHashSet*************************/
		System.out.println("*********************LinkedHashSet*************************");
		
		//Syntax to Initialize: Collection <DataType> variable = new Collection<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to remove the data:variable.remove(value);
		//Syntax to get the total value : variable.size();
		
		//LinkedHashSet won't follow contiguous memory allocation
		//Order of Storing : Insertion Order
		//Null Values : Allowed
		
		Set<String> empNamesLinkedHashSet = new LinkedHashSet<String>();
		empNamesLinkedHashSet.add("Ashok");
		empNamesLinkedHashSet.add("Maha");
		empNamesLinkedHashSet.add("Afreen");
		empNamesLinkedHashSet.add("Ajay");
		empNamesLinkedHashSet.add("Bharath");
		empNamesLinkedHashSet.add("Ashok");
		empNamesLinkedHashSet.add(null);
		empNamesLinkedHashSet.remove("Bharath");
		
		System.out.println("Size of LinkedHashSet is :"+empNamesLinkedHashSet.size());
		System.out.println(empNamesLinkedHashSet);
		
		/*********************TreeSet*************************/
		System.out.println("*********************TreeSet*************************");
		
		//Syntax to Initialize: Collection <DataType> variable = new Collection<DataType>();
		//Syntax to add data: variable.add(value);
		//Syntax to remove the data:variable.remove(value);
		//Syntax to get the total value : variable.size();
		
		//TreeSet won't follow contiguous memory allocation
		//Order of Storing : Ascending Order
		//Null Values : Not Allowed
		
		Set<String> empNamesTreeSet = new TreeSet<String>();
		empNamesTreeSet.add("Ashok");
		empNamesTreeSet.add("Maha");
		empNamesTreeSet.add("Afreen");
		empNamesTreeSet.add("Ajay");
		empNamesTreeSet.add("Bharath");
		empNamesTreeSet.add("Ashok");
//		empNamesTreeSet.add(null);
		empNamesTreeSet.remove("Bharath");
		
		System.out.println("Size of TreeSet is :"+empNamesTreeSet.size());
		System.out.println(empNamesTreeSet);
		

	}

}
