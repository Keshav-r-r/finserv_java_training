package com.bajaj.day3;

import java.util.*;

/*
 *  CLI based application
 *  Menu base
 */

class Employee3{
	private String name;
	private int employeeId;
	private List arr;
	public Employee3() {
		arr = new ArrayList<Employee3>();
	}
	public Employee3(String name, int employeeId) {
		super();
		this.name = name;
		this.employeeId = employeeId;
	}
	public void insert(Employee3 emp) {
		arr.add(emp);
	}
	
	public void update(int index, Employee3 emp) {
		arr.remove(index);
		arr.add(index, emp);
	}
	
	public void delete(int index) {
		arr.remove(index);
	}
	
	public void sortAscending() {
		Collections.sort(arr, new Comparator<Employee3>() {
			public int compare(Employee3 e1, Employee3 e2) {
				return e1.employeeId-e2.employeeId;
			}
		});
		System.out.println("Sorted by id:");
		printAllEmployee3s();
	}
	
	public void sortDescending() {
		Collections.sort(arr, new Comparator<Employee3>() {
			public int compare(Employee3 e1, Employee3 e2) {
				return e2.employeeId-e1.employeeId;
			}
		});
		System.out.println("Sorted by id (desc):");
		printAllEmployee3s();
	}
	
	public String toString(int index) {
		return "Employee3 [name=" + ((Employee3)arr.get(index)).name + ", Employee3Id=" + ((Employee3)arr.get(index)).employeeId + "]";
	}
	
	public int searchEmployee3ById(int id) {
		for(int i=0; i<arr.size();i++) {
			if(((Employee3)arr.get(i)).employeeId==id)
				return i;
		}
		return -1;
	}
	
	public void printAllEmployee3s() {
		for(int i=0; i<arr.size();i++) {
			System.out.println(toString(i));
		}
	}
	
}

public class BankApplicationCollection {

	public static void main(String[] args) {
		/*
		 * Array
		 */
		Scanner sc = new Scanner(System.in);
		Employee3 e = new Employee3();
		int id;
		int doesEmployee3Exist;
		Employee3 emp;
		while(true) {
			System.out.println("Select your choice");
			System.out.println("Enter 1 to add a new Employee3");
			System.out.println("Enter 2 to search for an Employee3");
			System.out.println("Enter 3 to update an Employee3");
			System.out.println("Enter 4 to sort the Employee3s by ASC order of id");
			System.out.println("Enter 5 to sort the Employee3s by DESC order of id");
			System.out.println("Enter 6 to delete an Employee3");
			System.out.println("Enter 7 to display all Employee3s");
			System.out.println("Enter -1 to exit");
			int choice = sc.nextInt();
			if(choice==-1)
				break;
			switch(choice) {
			case 1:
				System.out.println("Enter id and name");
				id = sc.nextInt();
				String name = sc.next();
				doesEmployee3Exist = e.searchEmployee3ById(id);
				if(doesEmployee3Exist!=-1) {
					System.out.println("Employee3 id already exists");
					break;
				}
				emp = new Employee3(name, id);
				e.insert(emp);
				break;
			case 2:
				System.out.println("Enter id to search");
				id = sc.nextInt();
				doesEmployee3Exist = e.searchEmployee3ById(id);
				if(doesEmployee3Exist!=-1) {
					System.out.println("Employee3 found!");
					System.out.println(e.toString(doesEmployee3Exist));
					break;
				}
				System.out.println("Employee3 not found");
				break;
			case 3:
				System.out.println("Enter id of Employee3 which is to be updated");
				id = sc.nextInt();
				doesEmployee3Exist = e.searchEmployee3ById(id);
				if(doesEmployee3Exist!=-1) {
					System.out.println("Enter new name and id");
					String newName = sc.next();
					int newId = sc.nextInt();
					emp = new Employee3(newName, newId);
					e.update(doesEmployee3Exist,emp);
					break;
				}
				System.out.println("Employee3 id not found");
				break;
			case 4:
				e.sortAscending();
				break;
			case 5:
				e.sortDescending();
				break;
			case 6:
				System.out.println("Enter id of Employee3 which is to be deleted");
				id = sc.nextInt();
				doesEmployee3Exist = e.searchEmployee3ById(id);
				if(doesEmployee3Exist!=-1) {
					e.delete(doesEmployee3Exist);
					break;
				}
				System.out.println("Employee3 id not found");
				break;
			case 7:
				e.printAllEmployee3s();
				break;
			}
		}
	}
}
