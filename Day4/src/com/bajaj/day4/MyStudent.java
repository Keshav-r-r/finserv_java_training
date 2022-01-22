package com.bajaj.day4;
import java.util.*;


class Student {
	private int id;
	private String name;
	private int fees;
	public Student(int id, String name, int fees) {
		super();
		this.id = id;
		this.name = name;
		this.fees = fees;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
//	@Override
//	public int compareTo(Student o) {
//		return this.name.compareTo(o.getName());
//	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fees=" + fees + "]";
	}
	
}

public class MyStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(3,"Pooja",2000));
		students.add(new Student(5,"Mayank",5000));
		students.add(new Student(1,"Ameesh",1500));
		students.add(new Student(12,"Harsh",4000));
		students.add(new Student(30,"Priya",8000));
		System.out.println("Before sorting: ");
		for(Student s: students) {
			System.out.println(s.getId()+" "+s.getName());
		}
		// Call the collections.sort method
		// Pass the students list to sort method
		// Implement the comparable interface
		// Pass the key for sorting
		// If E1 > E2 return 1
		// If E1 < E2 return -1
		// E1==E2 return 0
		// or just return E1-E2 for all of the cases to work.
		System.out.println("Press 1 to sort according to id, 2 for names and 3 for fees");
		int ch = sc.nextInt();
		switch(ch) {
		case 1: 
			Collections.sort(students, new Comparator<Student>() {
				public int compare(Student s1, Student s2) {
					return s1.getId()-s2.getId();
				}
			});
			System.out.println("Sorted according to ids: ");
			System.out.println("Id\tName\tFees");
			for(Student s: students) {
				System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getFees());
			}
			break;
		case 2:
			Collections.sort(students, new Comparator<Student>() {
				public int compare(Student s1, Student s2) {
					return s1.getName().compareTo(s2.getName());
				}
			});
			System.out.println("Sorted according to names: ");
			System.out.println("Id\tName\tFees");
			for(Student s: students) {
				System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getFees());
			}
			break;
		case 3:
			Collections.sort(students, new Comparator<Student>() {
				public int compare(Student s1, Student s2) {
					return s1.getFees()-s2.getFees();
				}
			});
			System.out.println("Sorted according to fees: ");
			System.out.println("Id\tName\tFees");
			for(Student s: students) {
				System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getFees());
			}
			break;
		}
	}
}
