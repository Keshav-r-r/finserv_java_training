package com.bajaj.day2;

import java.util.Scanner;

/*
 *  CLI based application
 *  Menu base
 */

class Employee3{
	private String name;
	private int employeeId;
	private Employee3 arr[];
	private int count;
	public Employee3(int length) {
		count = 0;
		arr = new Employee3[length];
	}
	public Employee3(String name, int employeeId) {
		super();
		this.name = name;
		this.employeeId = employeeId;
	}
	public void insert(Employee3 emp) {
		if(arr.length == count) {
			Employee3 newArr[] = new Employee3[2*count];
			for(int i=0;i<count;i++)
				newArr[i] = arr[i];
			arr = newArr;
		}
		arr[count++] = emp;
	}
	
	public void update(int index, Employee3 emp) {
		arr[index] = emp;
	}
	
	public void delete(int index) {
		for(int i=index;i<count-1;i++) {
			arr[i] = arr[i+1];
		}
		count--;
	}
	
	public void sortAscending() {
		int i,j;
		for(i=0;i<count-1;i++) {
			for(j=0;j<count-i-1;j++) {
				if(arr[j].employeeId>arr[j+1].employeeId) {
					Employee3 temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted by id:");
		printAllEmployees();
	}
	
	public void sortDescending() {
		int i,j;
		for(i=0;i<count-1;i++) {
			for(j=0;j<count-i-1;j++) {
				if(arr[j].employeeId<arr[j+1].employeeId) {
					Employee3 temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted by id (desc):");
		printAllEmployees();
	}
	
	public String toString(int index) {
		return "Employee [name=" + arr[index].name + ", employeeId=" + arr[index].employeeId + "]";
	}
	
	public int searchEmployeeById(int id) {
		for(int i=0; i<count;i++) {
			if(arr[i].employeeId==id)
				return i;
		}
		return -1;
	}
	
	public void printAllEmployees() {
		for(int i=0; i<count;i++) {
			System.out.println(toString(i));
		}
	}
	
}

public class BankApplication {

	public static void main(String[] args) {
		/*
		 * Array
		 */
		Scanner sc = new Scanner(System.in);
		Employee3 e = new Employee3(1);
		int id;
		int doesEmployeeExist;
		Employee3 emp;
		while(true) {
			System.out.println("Select your choice");
			System.out.println("Enter 1 to add a new employee");
			System.out.println("Enter 2 to search for an employee");
			System.out.println("Enter 3 to update an employee");
			System.out.println("Enter 4 to sort the employees by ASC order of id");
			System.out.println("Enter 5 to sort the employees by DESC order of id");
			System.out.println("Enter 6 to delete an employee");
			System.out.println("Enter 7 to display all employees");
			System.out.println("Enter -1 to exit");
			int choice = sc.nextInt();
			if(choice==-1)
				break;
			switch(choice) {
			case 1:
				System.out.println("Enter id and name");
				id = sc.nextInt();
				String name = sc.next();
				doesEmployeeExist = e.searchEmployeeById(id);
				if(doesEmployeeExist!=-1) {
					System.out.println("Employee id already exists");
					break;
				}
				emp = new Employee3(name, id);
				e.insert(emp);
				break;
			case 2:
				System.out.println("Enter id to search");
				id = sc.nextInt();
				doesEmployeeExist = e.searchEmployeeById(id);
				if(doesEmployeeExist!=-1) {
					System.out.println("Employee found!");
					System.out.println(e.toString(doesEmployeeExist));
					break;
				}
				System.out.println("Employee not found");
				break;
			case 3:
				System.out.println("Enter id of employee which is to be updated");
				id = sc.nextInt();
				doesEmployeeExist = e.searchEmployeeById(id);
				if(doesEmployeeExist!=-1) {
					System.out.println("Enter new name and id");
					String newName = sc.next();
					int newId = sc.nextInt();
					emp = new Employee3(newName, newId);
					e.update(doesEmployeeExist,emp);
					break;
				}
				System.out.println("Employee id not found");
				break;
			case 4:
				e.sortAscending();
				break;
			case 5:
				e.sortDescending();
				break;
			case 6:
				System.out.println("Enter id of employee which is to be deleted");
				id = sc.nextInt();
				doesEmployeeExist = e.searchEmployeeById(id);
				if(doesEmployeeExist!=-1) {
					e.delete(doesEmployeeExist);
					break;
				}
				System.out.println("Employee id not found");
				break;
			case 7:
				e.printAllEmployees();
				break;
			}
		}
	}
}
