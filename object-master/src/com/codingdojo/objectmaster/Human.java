package com.codingdojo.objectmaster;

public class Human {
	private int strength;
	private int health;
	private int intelligence;
	private int stealth;
	
	public Human() {
		this.strength = 3;
		this.intelligence = 3;
		this.stealth = 3;
		this.health = 100;
	}
	
	public void attack(Human someone) {
		someone.setHealth(someone.getHealth() - this.getStrength());
	}
	
	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}
	
	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}
	
	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}
	
	public int getHealth() {
		System.out.println(String.format("Current health: %d.", health));
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}
}
