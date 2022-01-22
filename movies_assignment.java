package com.bajaj.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class movie
{
public movie(int id, String name, int rating) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
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
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
@Override
	public String toString() {
		return "Movie [ID=" + id + ", name=" + name + ", Rating=" + rating + "]";
	}
private int id;
private String name;
private int rating;

}


public class movies_assignment {

	public static void main(String args[])
	{


		  List<movie> ls=new ArrayList<movie>();

		  ls.add(new movie(1, "Avatar", 5)); 
		  ls.add(new movie(2, "Lego movie",3));
		  ls.add(new movie(3, "Free guy", 1));
		  ls.add(new movie(4, "Not Free guy", 1));
		  ls.add(new movie(4, "bad movie", 5));
		  ls.add(new movie(4, "Good teacher", 4));


		  List<String> ls1=ls.stream() 
		  .filter(mrating->mrating.getRating()>5)
		  .map(s->s.getName()) 
		  .collect(Collectors.toList());

		  ls1.forEach(s->System.out.println(s));

		  List<String> ls2=ls.stream()
		  .filter(student->student.getRating()>3)
		  .map(s->s.getName()) 
		  .collect(Collectors.toList());

		  ls2.forEach(s->System.out.println(s));


		

	}



}