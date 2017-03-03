//Assess1G1OOP1.java
/**/

import javax.swing.JOptionPane;

public class Assess1G1OOP1 {
  public static void main(String args[])
  {
  	
  String choice;
  char result;
  int gamesPlayed = 0,compWins = 0,playerWins = 0,draws = 0;	
  	
  choice = JOptionPane.showInputDialog("Would you like to play a game of roll the dice? (yes or no)");	
  	
  while(choice.equals("yes"))	
  {
  
     result = rollTheDice();
  
  	gamesPlayed++;
  
  if(result == 'c' )
  	 compWins++;
  	 else if(result == 'p')
  	 playerWins++;
  	 else	
  	    draws++;  
  
   	 JOptionPane.showMessageDialog(null,"Games played: " + gamesPlayed + "\nComputer Wins: " + compWins + "\nPlayer Wins: " + playerWins +  
     "\nDraws: " + draws, 
    "Game Info",JOptionPane.INFORMATION_MESSAGE);
   
    choice = JOptionPane.showInputDialog("Would you like to play another game of roll the dice? (yes or no)");	 
  	
  	}
  	
  	JOptionPane.showMessageDialog(null,"Thanks for playing the game","Farewell",JOptionPane.INFORMATION_MESSAGE);
  	
     System.exit(0);
     
  }
  
  public static char rollTheDice()
  {
  	int roll1,roll2;  
  	   	 
   	 roll1 = (int)(Math.random() * 11) + 2;
   	 JOptionPane.showMessageDialog(null,"The computer roll generated the value " + roll1 + ".... now hit return to see the player roll",
   "Computer Roll",JOptionPane.INFORMATION_MESSAGE);
   
   
   roll2 = (int)(Math.random() * 11) + 2;
    JOptionPane.showMessageDialog(null,"The player roll generated the value " + roll2,
    "Player Roll",JOptionPane.INFORMATION_MESSAGE);
    
   if(roll1 > roll2)
    return 'c';
   else if(roll2 > roll1)
   	return 'p';
    else
    return 'd';
  	
  }
}