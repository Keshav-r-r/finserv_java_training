package com.bajaj.day2;

public class Student {
	private String name;
	private int rollNo;
	Student(String name, int rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String toString() {
		return "Student [name = "+name+", rollNo = "+rollNo+"]";
	}
}
