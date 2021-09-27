package com.java.thisKeyword;

public class Main { 
	
	  int x; 
	  {
		  System.out.println(x);
		  }
	  
	  // Constructor with a parameter
	  public Main(int x)
	  { 
	    this.x = x; 
	    System.out.println(x);
	  } 
	  
	  // Call the constructor
	  public static void main(String[] args)  { 
	    Main myObj = new Main(5); 
	    System.out.println("Value of x = " + myObj.x);
	  } 
	} 
