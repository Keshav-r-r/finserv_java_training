package com.bajaj.day3;

// Generic class - pass data type as parameter to class.

class Employee<T, V, Z>{
	private T id;
	private V name;
	private Z salary;
	
	Employee(T id, V name, Z salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
public class GenericClass {

	public static void main(String[] args) {
		// Wrapper classes needs to be passed
		Employee<Long, String, Long> e1 = new Employee(1001, "Mayank", 10000);
		Employee<Double,String,Long> e2 = new Employee(100.00, "Mak",15000);
		System.out.println(e1.toString());
		System.out.println(e2.toString());
	}
}
