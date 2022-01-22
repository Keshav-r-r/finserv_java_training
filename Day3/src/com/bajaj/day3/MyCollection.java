package com.bajaj.day3;

import java.util.*;

// Collection - It is a framework which helps to create, update, delete
// sort, insert many type of data - int, string, long, object.

public class MyCollection {

	public static void main(String[] args) {
		
		// List can store the reference of ArrayList, Vector, LinkedList and any other child class.
		List ls = new ArrayList();
		// List can store any data type unless specified.
		ls.add("Mayank");
		ls.add(1);
		ls.add(10.2f);
		ls.remove("1");
		List<Integer> ls1 = new ArrayList<Integer>();
		ls1.add(2);
		ls1.add(5);
		ls1.add(1);
		System.out.println(ls.get(2));
		Collections.sort(ls1); // Ascending order
		Collections.sort(ls1,Collections.reverseOrder()); // Descending order.
		//ls1.add("String"); // Gives error as ls1 accepts only integers.
		System.out.println(ls1);
		List<Integer> st = new Stack<Integer>();
		for(int i=0;i<10;i++) {
			st.add(i);
		}
		System.out.println(st);
		System.out.println(st.get(2));
	}
}
