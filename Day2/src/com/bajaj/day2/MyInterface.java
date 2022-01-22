package com.bajaj.day2;

interface mobileFeatures{
	public void calling();
	public void sendSMS();
	public void playGame();
}

abstract class SimCardHolder{
	public void simCard() {
		System.out.println("Normal sim card");
	}
	abstract void hybridSimCard();
}

class SmartPhone extends SimCardHolder implements mobileFeatures{
	public void OS(){
		System.out.println("Android");
	}
	
	public void calling() {
		System.out.println("Calling");
	}
	
	public void sendSMS() {
		System.out.println("Send SMS");
	}
	
	public void playGame() {
		System.out.println("Play game");
	}

	@Override
	void hybridSimCard() {
		// TODO Auto-generated method stub
		
	}
	
}

public class MyInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimCardHolder sim = new SimCardHolder() {
			@Override
			void hybridSimCard() {
				// TODO Auto-generated method stub
				System.out.println("Hybrid sim card");
			}
		};
		sim.hybridSimCard();
		sim.simCard();
		
		// Object of interface is created and is used to access the methods of the interface.
		mobileFeatures m = new SmartPhone();
		m.calling();
	}

}
