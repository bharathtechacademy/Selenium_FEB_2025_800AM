package com.creatio.crm.java.basics;

public class ArrayConcepts {

	public static void main(String[] args) {
		
		//Array Can Store Multiple Values With Same Data Type together at Same memory Location
		
		//1 D Array
		String [] empNames = {"Ashok","Charan","Mahesh"};
		
		int [] empIds = new int [3];
		empIds[0] = 1234;
		empIds[1] = 1235;
		empIds[2] = 1236;
		
		System.out.println(empNames[0]);
		System.out.println(empIds[0]);
		
		System.out.println(empNames);
		
		//Multi-dimentional Arrays
		
		//2D Array
		
		String [] project1 = {"Ashok","Mahesh","Charan"};
		String [] project2 = {"Amit","Basava","Gogu"};
		
		String [] [] Projects = {{"Ashok","Mahesh","Charan"} , {"Amit","Basava","Gogu"}};
		
		String [] [] resources = new String [2] [3];
		
		resources[0][0] ="Ashok";
		resources[0][2] ="Charan";
		resources[1][1] ="Basava";
		
		System.out.println(Projects[1][2]);
		
		
		//3D Array
		String [] [] [] Employees ={ {{"Ashok","Mahesh","Charan"} , {"Amit","Basava","Gogu"}} , {{"Ajay","Bhagy","mahalakshmi"} , {"Mayuri","Prateek","Gogu"}}};

		
		//get value Mayuri from above array
		System.out.println(Employees [1][1][0]); 
	
	}

}
