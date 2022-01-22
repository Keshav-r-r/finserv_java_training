package com.bajaj.day2;

class D{
	D(){}
	void printD() {
		System.out.println("D's print function");
	}
}

class E extends D{
	E(){}
	
	void printD() {
		System.out.println("printD function of E");
	}
	void printE() {
		System.out.println("printE function of E");
	}
}

class F extends D{
	F(){}
	void printF() {
		System.out.println("F's print function");
	}
}

public class HierarchicalInheritance {
	public static void main(String args[]) {
		F f = new F();
//		f.printD();
		D e = new E();
		e.printD();
	}
}
