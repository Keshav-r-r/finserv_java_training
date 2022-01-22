package com.bajaj.day2;
class M
{
   public void dispM()
   {
	System.out.println("M");
   }
}

class N extends M
{
   public void dispN()
   {
	System.out.println("N");
   }
}

class O extends M
{
   public void dispO()
   {
	System.out.println("O");
   }
	
}

class P extends N
{
   public void dispP()
   {
	   System.out.println("P");
   }
}

public class HybridInheritance {

	public static void main(String[] args) {
		M p = new P();
		p.dispM();
	}

}
