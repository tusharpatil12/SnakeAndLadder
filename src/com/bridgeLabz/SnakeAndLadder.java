package com.bridgeLabz;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
		 int pos = 0;	 
		System.out.println("Welcome to Snake and ladder Program");
        System.out.println("Single player at start position "+ pos);
       RollDisk();
	}

	 public static void RollDisk() {
		 Random random = new Random();
	        int dice = random.nextInt(6);
	        dice = dice+1;
	        System.out.println("Dice Num : "+ dice);

	}

}
