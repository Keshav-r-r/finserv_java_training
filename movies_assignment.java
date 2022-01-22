package com.bajaj.day4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class movie
{
public movie(int id, String name, int rating, int numreviews) {
		super();
		this.id = id;
		this.name = name;
		this.rating = rating;
		this.numreviews = numreviews;
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
	public int getReviews() {
		return numreviews;
	}
@Override
	public String toString() {
		return "Movie [ID=" + id + ", name=" + name + ", Rating=" + rating +", No. of reviews="+ numreviews+ "]";
	}
	public int compareTo(movie val2) {
		
		return Integer.compare(this.numreviews, val2.numreviews);
	}
private int id;
private String name;
private int rating;
private int numreviews;
}


public class movies_assignment {

	public static void main(String args[])
	{


		  List<movie> ls=new ArrayList<movie>();

		  ls.add(new movie(4, "Avatar", 5,25)); 
		  ls.add(new movie(6, "Lego movie",3,38));
		  ls.add(new movie(5, "Free guy", 1,47));
		  ls.add(new movie(1, "Not Free guy", 1,52));
		  ls.add(new movie(3, "bad movie", 5,36));
		  ls.add(new movie(2, "Good teacher", 4,89));

		  //1. count all movies above average
		  long count=ls.stream()
					.filter(m->m.getRating()>3)
					.count();
		  System.out.println("no.of above average movies: "+count);
		  
		  //2. 
          Optional<movie> min = ls.stream()
                                  .min((val1,val2)->val1.compareTo(val2));
			  
          System.out.println("Movie with least number of reviews:"+min.get());
		  
		  //3.
		  Optional<movie> max = ls.stream()
								.max((val1,val2)->val1.compareTo(val2));
			  
		  System.out.println("Movie with most number of reviews:"+max.get());
		  
		  //4. filter
		  //5. map
	      //6. collectors	
		  List<String> ls1=ls.stream() 
		  .filter(mrating->mrating.getRating()>=4)
		  .map(s->s.getName().toUpperCase()) 
		  .collect(Collectors.toList());
		  System.out.println("Announcement of all above average movies:");
		  ls1.forEach(s->System.out.println(s));

		  //7. distinct 
		  ls.stream()
			.distinct()
			.forEach(s->System.out.println(s));
			
			System.out.println();

		  //8. sort
			System.out.println("ascending order of id");
			ls.stream()
			.sorted(Comparator.comparingInt(movie::getId))
			.distinct()
			.forEach(s->System.out.println(s));
			System.out.println();
			System.out.println("decending order of id");
			ls.stream()
			.sorted(Comparator.comparingInt(movie::getId).reversed())
			.forEach(s->System.out.println(s));
		

	}



}
