package com.bajaj.day2;

// POJO Class - Plain Old Java Object.
class Person{
	private String name, address;
	private int age, salary;

	public Person(String name, String address, int age, int salary) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String toString() {
		return "Person [name = "+name+", age = "+age+", salary = "+salary+", address = "+address+"]";
	}
}

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Mayank", "Chennai", 22, 10000);
		System.out.println(p.toString());
		Student s = new Student("Ameesh", 1005);
		System.out.println(s.toString());
		Car c = new Car("Hyundai", "Creta",2000000);
		System.out.println(c.toString());
		Teacher t = new Teacher("Ansar","Java");
		System.out.println(t.toString());
		CEO bajaj = new CEO("Rajeev Jain", "Bajaj Finance Ltd.");
		System.out.println(bajaj.toString());
		
	}
}
