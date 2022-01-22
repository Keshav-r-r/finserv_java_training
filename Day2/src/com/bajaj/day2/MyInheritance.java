package com.bajaj.day2;

/*
 * Classes
 * Objects
 * Inheritance - Extending the properties of another class.
 * 1st rule - We always have two or more classes to implement inheritance.
 */

// When program is compiled we get .class files for all of the classes present in that java file.
// The inheritance implemented here is single level.
class A{
	protected int a;
	protected int b;
	A(int a){
		this.a = a;
	}
	A(){
		a = 100;
	}
	A(int a, int b){
		this.a = a;
		this.b = b;
	}
	public void printA() {
		System.out.println("A Class");
	}
}


class B extends A{
	int a;
	B(int a){
		// super - is used to call the constructor of the parent class.
		super(a);
	}
	public void printB() {
		System.out.println("B Class");
		System.out.println("A = "+super.a);
	}
}

public class MyInheritance {
	public static void main(String args[]) {
		B obj = new B(15);
		// With B class' object we will be able to access both class A and class B functions.
		obj.printA();
		obj.printB();
	}
}
