package com.bajaj.day2;

/*
 *  Final class cannot be extended.
 *  Final variable cannot be changed.
 *  Final method cannot be overridden.
 */

/*
 * Overriding
 * Condition - class should be extended by another class.
 * Both child and parent class should have the same method(Name, signature, everything)
 */

/*
 * Overloading
 * Methods having same name but different parameters.
 * Within same class only.
 */

class Persons{
	int a = 10;
	public void print() {
		System.out.println("Class person");
	}
	public void print(int a) {
		System.out.println("Function with 1 parameter "+a);
	}
	public void print(int a, int b) {
		System.out.println("Function with 2 parameters "+a+" "+b);
	}
}

class Employee extends Persons{
	@Override
	public void print() {
		System.out.println("Class employee");
	}
}

public class MyFinal {
	public static void main(String args[]) {
		Employee e = new Employee();
		e.print();
		e.print(10);
		e.print(29,39);
	}
}
