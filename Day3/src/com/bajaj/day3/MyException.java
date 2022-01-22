package com.bajaj.day3;

public class MyException {

	public static void main(String[] args) {
		/*
		 * Exception - A special condition which breaks the flow of the program.
		 * Occurs at runtime.
		 * Exception class - Parent to every other class in java.
		 * throw - to throw new exception created by user.
		 * throws - whenever you want to throw exception at method level.
		 * try - handle the code block which has error.
		 * catch - code block which implements handling part of the exception.
		 *   
		 */
		try {
			int a[] = new int[2];
			a[0] = 1;
			a[1] = 2;
			System.out.println(a[0]+ " " +a[1]);
			a[2] = 3;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
