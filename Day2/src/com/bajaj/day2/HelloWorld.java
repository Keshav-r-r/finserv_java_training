package com.bajaj.day2;
/*
 * Class - It is a blueprint for objects.
 * Member variable - hold the data.
 * Member method - which operate on given data.
 * 
 */

public class HelloWorld {
	// Member variables
	int a;
	int b;
	static String schoolName = "St. Francis' College";
	
	HelloWorld(int a, int b){
		this.a = a;
		this.b = b;
	}
	
	public void setA(int a) {
		this.a = a;
	}
	
	public void setB(int b) {
		this.b = b;
	}
	
	// Static methods have can't access non-static variables without object.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld ob = new HelloWorld(10,20);
		ob.printValue();
		schoolName = "Java school";
		HelloWorld obj2 = new HelloWorld(1,2);
		obj2.printValue();
		obj2.testFunction();
	}
	
	public void testFunction() {
		System.out.println(Integer.SIZE);
	}
	
	// Non-static methods have access to static and non-static member variables. 
	public void printValue() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(schoolName);
	}

}
