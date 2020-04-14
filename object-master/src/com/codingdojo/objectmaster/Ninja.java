package com.codingdojo.objectmaster;

public class Ninja extends Human {
	public Ninja() {
		super();
		setStealth(10);
	}
	
	public void steal(Human someone) {
		int amount = this.getStealth();
		someone.setHealth(someone.getHealth() - amount);
		this.setHealth(this.getHealth() + amount);
	}
	
	public void runAway() {
		this.setHealth(this.getHealth() - 10);
	}
}
