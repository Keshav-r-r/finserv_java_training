package com.bajaj.day2;

// Private variables are accessed by class only.
class Student2{
	private String name;
	private int rollNo;
}

class Employee2{
	private String username;
	private String password;
	public void login(String username, String password) {
		System.out.println("Logged in successfully");
	}
}

public class MyEncapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 s1 = new Employee2();
		s1.login("root", "admin");
	}
}
