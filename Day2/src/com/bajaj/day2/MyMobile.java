package com.bajaj.day2;

//component 
interface FeaturesMobile
{
	
public void calling(); //calling 2g
public void sendSMS();
public void playGame();
	
}

abstract class SimCardHolder2
{

	//non abstract method
	public void simCard()
	{
		System.out.println("Normal Sim card");
	}
	// abstract method
	abstract void hybridSimCard();
	
}

class SmartMobile extends SimCardHolder2 implements FeaturesMobile
{
	@Override
	void hybridSimCard()
	{
		System.out.println("Hybrid sim card");
	}

	public void OS()
	{
		System.out.println("Android ");
	}
	
	public void vidoCalling()
	{
		System.out.println("video calling");
	}
	
	
	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("5 calling ");
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("send sms");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("Play games");
	}
	
}

class Nokia implements FeaturesMobile
{
  
	public void brand() {
		System.out.println("Nokia");
	}
	
	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("Calling nokia");
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("SMS nokia");
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("Game nokia");
	}
	
}

class Sumsung implements FeaturesMobile
{
	
	public void brand() {
		System.out.println("sumsung");
	}
	

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("Calling samsung");
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("SMS Samsung");
		
	}

	@Override
	public void playGame() {
		// TODO Auto-generated method stub
		System.out.println("Game samsung");
		
	}
	
}



public class MyMobile {
	
	public static void main(String args[])
	{
	
		//child class reference to parent
		FeaturesMobile mobile=new Nokia();
		mobile.calling();
		mobile.sendSMS();
		
		
		FeaturesMobile mobile2=new Sumsung();
		mobile2.calling();
		mobile2.sendSMS();
		//mobile2.
		
		//abstract class
		SimCardHolder2 sim=new SimCardHolder2() {
				@Override
				void hybridSimCard() {
					System.out.println("Hybrid sim card");
			}
		};
		
		sim.hybridSimCard();
		sim.simCard();
		//interface 
		FeaturesMobile featuresMobile=new FeaturesMobile() {

			@Override
			public void calling() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void sendSMS() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void playGame() {
				// TODO Auto-generated method stub
				
			}
		};
	}

}
