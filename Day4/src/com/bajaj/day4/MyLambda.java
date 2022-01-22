package com.bajaj.day4;

// Object oriented language 
// Java 1.8 force us to do the functional programming. 

class Calc{
	int a,b;
	
	public void sum(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}
	
	public void subtraction(int a, int b) {
		int c = a-b;
		System.out.println(c);
	}
	
}

interface FunctionType{
	public void execute();
}

interface MyCode{
	public void calc(String name);
}

interface EvenOdd{
	public void calcEvenOdd(int n);
}

interface PositiveNegative{
	public void calcPositiveNegative(int n);
}

interface StringUpperCase{
	public void convertStringUpperCase(String s);
}

public class MyLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc cal = new Calc();
		cal.sum(10, 20);
		cal.subtraction(25, 8);
		FunctionType code = ()->System.out.println("Hello World!");
		code.execute();
		MyCode co = name->{
			int a = 5;
			int b = 10;
			System.out.println(name+" "+a+b);
		};
		co.calc("HI");
		// Do the following using lambda expressions
		// even odd with lambda
		// given number is positive or negative
		// take the string and print in upper case
		EvenOdd evenOdd = (int n)->{
			if(n%2==0)
				System.out.println("Even");
			else
				System.out.println("Odd");
		};
		evenOdd.calcEvenOdd(5);
		
		PositiveNegative posNeg = (int n)->{
			if(n<0)
				System.out.println("Negative");
			else if(n>0)
				System.out.println("Positive");
			else
				System.out.println("Number is neither positive nor negative");
		};
		posNeg.calcPositiveNegative(-1);
		
		StringUpperCase sUpCase = (String s)->{
			s = s.toUpperCase();
			System.out.println(s);
		};
		sUpCase.convertStringUpperCase("Mayank");
	}
}
