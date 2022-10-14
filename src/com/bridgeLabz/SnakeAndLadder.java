package com.bridgeLabz;

import java.util.Random;

public class SnakeAndLadder {

	public static void main(String[] args) {
		 int pos1 = 0;
		 int pos2 = 0;
		 int dice;
		 int temp;
		 int countDice1 = 0;
		 int countPos1 = 0;
		 int countDice2 = 0;
		 int countPos2 = 0;
		System.out.println("Welcome to Snake and ladder Program");
        System.out.println("Player1 at start position "+ pos1);
        
     
       while (pos1 <= 100 || pos2>=100){
    	   Random random = new Random();
    	   int play = random.nextInt(2);
    	   play = play + 1;
    	   if  (play == 1) {
           dice = RollDice();
           countDice1++;
           int t = pos1;
           pos1 = mapTo(dice,pos1);
           if (pos1 > t)
        	   countPos1++;
           if (pos1 >= 100)
        	   break;
        	   
       }else {
    	   dice = RollDice();
    	   countDice2++;
    	   int t = pos2;
    	   pos2 = mapTo(dice,pos2);
    	   if (pos2 > t)
    		   countPos2++;
    	   if (pos1 >= 100)
    		   break;
    	   
       }
       
       if(pos1 > 100 || pos2 > 100) {
    	   temp = pos1 - 100;
    	   pos1 = pos1 - temp;
    	   int temp2 = pos2 - 100;
    	   pos2 = pos2 -temp2;
    	   
    	   if(pos1 == 100){
               System.out.println("Win the game Player1 pos is : "+ pos1);
               System.out.println("No of Count Player1 Dice : "+ countDice1);
               System.out.println("No of Count Player1 Pos : "+ countPos1);

           }else if(pos2 == 100){
               System.out.println("Win the game Player2 pos is : "+ pos2);
               System.out.println("No of Count Player2 Dice : "+ countDice2);
               System.out.println("No of Count Player2 Pos : "+ countPos2);
           }
    	  
       }
       else
    	   if (pos1 == 100) {
               System.out.println("Win the game Player1 pos is : " + pos1);
               System.out.println("No of Count Player1 Dice : " + countDice1);
               System.out.println("No of Count Player1 Pos : " + countPos1);
           } else {
               System.out.println("Win the game Player2 pos is : " + pos2);
               System.out.println("No of Count Player2 Dice : " + countDice2);
               System.out.println("No of Count Player2 Pos : " + countPos2);
           }
       }
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
