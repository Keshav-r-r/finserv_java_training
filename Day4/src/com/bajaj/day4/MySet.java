package com.bajaj.day4;
import java.util.*;

/*
 * List maintains the insertion order
 * Set does not.
 * HashSet - Does not maintain the order
 * LinkedHashSet - Maintains the insertion order
 * TreeSet - Which will insert and sort the data (Data is stored in sorted order)
 */

public class MySet {

	public static void main(String[] args) {
		// Need to add comparator for tree set because we are storing objects.
		// For primitive data types TreeSet will sort on its own.
		Set<Student> studentSet = new TreeSet<Student>(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getId()-s2.getId();
			}
		});
		studentSet.add(new Student(3,"Pooja",2000));
		studentSet.add(new Student(5,"Mayank",5000));
		studentSet.add(new Student(1,"Ameesh",1500));
		studentSet.add(new Student(12,"Harsh",4000));
		studentSet.add(new Student(30,"Priya",8000));
//		for(Student s: studentSet) {
//			System.out.println(s);
//		}
		studentSet.forEach((str)->System.out.println(str));
		Set<Integer> s1 = new HashSet<Integer>();
		s1.add(10); s1.add(20); s1.add(5); s1.add(12);
		s1.add(10); // Duplicate values will not be inserted. 
		Set<Double> s2 = new TreeSet<Double>();
		s2.add(10.5); s2.add(15.9); s2.add(1.05);
		for(double x:s2)
			System.out.println(x);
		Set<Integer> s3 = new HashSet<Integer>();
		s3.add(25); s3.add(50);
		s1.addAll(s3);
		for(int x:s1)
			System.out.println(x);
		boolean b = s1.equals(s3);
		String l = s1.toString();
		System.out.println(l+" "+l.charAt(3));
		System.out.println(b);
		Set<String> sSet = new LinkedHashSet<String>();
		
	}
}
