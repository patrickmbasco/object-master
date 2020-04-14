package com.codingdojo.objectmaster;

public class Wizard extends Human {
	public Wizard() {
		super();
		setHealth(50);
		setIntelligence(8);
	}
	
	public void heal(Human someone) {
		someone.setHealth(someone.getHealth() + this.getIntelligence());
	}
	
	public void fireball(Human someone) {
		someone.setHealth(someone.getHealth() - (this.getIntelligence() * 3));
	}
}
