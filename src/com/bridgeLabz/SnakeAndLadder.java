package com.bridgeLabz;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
		 int pos = 0;
		 int dice;
		System.out.println("Welcome to Snake and ladder Program");
        System.out.println("Single player at start position "+ pos);
     
       while (pos <= 100){
           dice = RollDice();
           pos = mapTo(dice, pos);
       }
       System.out.println("Win the game pos is : "+ pos);

	}

	public static int RollDice() {
		 Random random = new Random();
	        int dice = random.nextInt(6);
	        dice = dice+1;
	       // System.out.println("Dice Num : "+ dice);
	        return dice;

	}
	public static int mapTo(int dice , int pos) {
		Random random = new Random();
		int map = random.nextInt(2);
		map = map =1;
		//System.out.println("maping method : "+map);
		
		switch (map) {
		
		case 1:
			//System.out.println("No play you are int the same position");
			break;
		case 2:
			pos = pos +dice;
			//System.out.println("your position after ladder is :"+ pos);
			break;
		case 3:
			if (pos >= 0)
                pos = pos - dice;
			
			//System.out.println("your position after snake is :"+ pos);
			break;
			
		default:
			
		}
		return pos;
		
	}

}
