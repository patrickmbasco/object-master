package com.codingdojo.objectmaster;

public class HumanTest {
	public static void main(String[] args) {
		Human player = new Human();
		Human someone = new Human();
		player.attack(someone);
		System.out.println(someone.getHealth());;
	}
}
