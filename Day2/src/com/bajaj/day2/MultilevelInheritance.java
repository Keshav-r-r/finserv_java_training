package com.bajaj.day2;

class X{
	X(){
		
	}
	void printX() {
		System.out.println("X's print function");
	}
}

class Y extends X{
	Y(){
		
	}
	
	void printY() {
		System.out.println("Y's print function");
	}
}

class Z extends Y{
	Z(){
		
	}
	void printZ() {
		System.out.println("Z's print function");
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		X c = new Z();
		c.printX();
	}

}
