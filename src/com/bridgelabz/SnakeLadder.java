package com.bridgelabz;

public class SnakeLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Welcome to Snake ladder Game");
      
      System.out.println("Welcome to Snake and Ladder simulator");
		int playerPosition = 0;	
		System.out.println("Starting position is " + playerPosition );
		
		int playerPosition1 = 0;
		int die = (int) (Math.floor(Math.random() * 10) % 6 + 1);
		System.out.println("Dice roll: " + die);
	}

}
