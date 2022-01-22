package com.bajaj.day2;

abstract class Diagram {
   double dim1;
   double dim2;
   Diagram(double a, double b) {
      dim1 = a;
      dim2 = b;
   }
      // area is now an abstract method
      abstract double area();
}
class Rectangle extends Diagram {
   Rectangle(double a, double b) {
      super(a, b);
   }
   // override area for rectangle
   double area() {
      System.out.println("Inside Area for Rectangle.");
      return dim1 * dim2;
   }
}
class Triangle extends Diagram {
   Triangle(double a, double b) {
      super(a, b);
   }
   // override area for triangle
   double area() {
      System.out.println("Inside Area for Triangle.");
      return dim1 * dim2 / 2;
   }
}

public class TestAbstraction {
   public static void main(String args[]) {
      // Diagram d = new Diagram(10, 10); // illegal now
      Rectangle r = new Rectangle(9, 5);
      Triangle t = new Triangle(10, 8);
      Diagram diagRef; // This is OK, no object is created
      diagRef = r;
      System.out.println("DiagRef equals r? "+diagRef.equals(r));
      System.out.println("Area of Rectangle is: " + diagRef.area());
      diagRef = t;
      System.out.println("Area of Triangle is:" + diagRef.area());
      System.out.println("DiagRef equals t? "+diagRef.equals(t));
   }
}