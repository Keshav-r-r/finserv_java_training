package com.bajaj.day5;

import java.util.stream.Collectors;
import java.util.stream.Stream;


import java.util.*;

/*
 * StreamAPI is class in java which is used to filter and map the data
 * 
 */

class Student{
	private int rollNo;
	private String name;
	private int fees;
	
	public Student(int rollNo, String name, int fees) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", fees=" + fees + "]";
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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
	
}

public class MyStreamAPI {

	public static void main(String[] args) {
		/*
		 * Stream is created with null or empty list
		 * data
		 * from source to destination
		 * think of stream as flowing water
		 * in between you can perform intermediate operations.
		 * 
		 */
		Stream<String> stream = Stream.empty();
		Collection<Integer> collection = Arrays.asList(100,200,5000,200,1150);
//		collection.forEach(str->System.out.println(str));
		Stream<Integer> streamOfCollection = collection.stream();
//		streamOfCollection.forEach(str->System.out.println(str));
//		long count = streamOfCollection.filter(s->s==200).count();
//		System.out.println(count);
		// Stream can be used only for 1 operation. Doing a second operation will result in IllegalStateException.
//		streamOfCollection.filter(s->s==200).forEach(s1->System.out.println(s1));		
		Collection<Integer> c = streamOfCollection.filter(s->s==200).collect(Collectors.toList());
		System.out.println(c);
		List<Student> l = new ArrayList<Student>();
		l.add(new Student(3,"Pooja",2000));
		l.add(new Student(5,"Mayank",5000));
		l.add(new Student(1,"Ameesh",1500));
		l.add(new Student(12,"Harsh",4000));
		l.add(new Student(30,"Priya",8000));
		l.stream().filter(st->st.getFees()>2000).forEach(st->System.out.println(st));
		List<Student> lCollect = l.stream().filter(st->{System.out.println("Inside filter"); return st.getFees()<4000;}).collect(Collectors.toList());
		lCollect.forEach(st->System.out.println(st));
		List<String> ls = l.stream().filter(st->st.getFees()>4000).map(s->s.getName()).collect(Collectors.toList());
		ls.forEach(s->System.out.println(s));
		System.out.println();
		ls.stream().distinct().forEach(s->System.out.println(s));
		System.out.println(ls.stream().equals(ls.stream()));
		Optional<Integer> minX = collection.stream().min((i,j)->i.compareTo(j));
		System.out.println(minX);
		// Count, Min, Max, Filter, Map, Collectors, Distinct
	}
}
