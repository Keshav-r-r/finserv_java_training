package com.bajaj.day4;

import java.util.*;

public class MyMap {

	public static void main(String[] args) {
		Map<Integer, String> map =  new Hashtable<Integer, String>();
		// LinkedHashMap - maintains insertion order.
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "c");
		map.put(4, "d");
		map.put(4, "e"); // This will over write 4->d with 4->e.
		System.out.println(map);
		Set<Integer> mapKeys = map.keySet();
		for(int x: mapKeys) {
			System.out.println("Key = "+x+" Value = "+map.get(x));
		}
		Map<Student, Integer> stMap = new LinkedHashMap<Student, Integer>();
		Student stu1 = new Student(1,"Mayank",1000);
		stMap.put(stu1,101);
		Student stu2 = new Student(1,"Mayank",1000);
		stu2 = stu1;
		stMap.put(stu2,102);
		System.out.println(stMap);
		boolean flag = map.containsKey(2);
		System.out.println(map.toString());
		System.out.println(flag);
		
	}
}
