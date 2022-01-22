package com.bajaj.day2;

/*
 * Abstraction can be achieved in java by using abstract classes and interface.
 * Abstract method - which do not have body.
 */


class camera{
	public void printCamera() {
		System.out.println("64 MP");
	}
}

// Every method in an interface is "abstract" by default.
interface processor{
	public void printProcessor();
}

class mobile extends camera implements processor{
	public void printProcessor() {
		System.out.println("Snapdragon 778");
	}
}

public class MyAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
