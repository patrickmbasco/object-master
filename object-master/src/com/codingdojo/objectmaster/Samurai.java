package com.codingdojo.objectmaster;

public class Samurai extends Human {
	
	public static int number;	// number of samurai
	
	public Samurai() {
		super();
		setHealth(200);
		number++;
	}
	
	public void deathBlow(Human someone) {
		someone.setHealth(0);
		this.setHealth(this.getHealth()/2);
	}
	
	public void meditate(Human someone) {
		this.setHealth(this.getHealth() * (3/2));
	}
	
	public static int howMany() {		
		// can only access static method/variable
		// inside static method
		return number;
	}
}
