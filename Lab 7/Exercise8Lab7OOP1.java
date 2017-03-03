//Exercise8Lab7OOP1.java
/*This program asks the user to ask how many times they wish to toss a coin. The user-
 *defined method coinToss() will simulate the tossing of a coin*/
 
 import java.util.Scanner;
 
 public class Exercise8Lab7OOP1 {
   public static void main(String args[])
   {
   
   int numCoinToss,heads = 0,tails = 0;
   String headsTails = " ";
   
   Scanner input = new Scanner(System.in);
   
   System.out.print("Please enter the number of coin tosses you want: ");
   numCoinToss = input.nextInt();
   
   	for(int i = 1; i <= numCoinToss; i++)
   {
   	
    int toss = coinToss();
   	
   	if(toss == 0) {
   		headsTails = "heads";
   		heads++;
   	}
   	else
   	{		
   	    headsTails = "tails";
   	    tails++;
   	}
   
    System.out.println("Coin toss " + i + ":" + headsTails);
    
   }
   
   System.out.println("\n\n\n===========Overall Results===========\nPercentage of heads: " + String.format("%.0f",(float)heads / numCoinToss * 100) +
   	"\nPercentage of tails:" + String.format("%.0f",(float)tails / numCoinToss * 100));
   
   }
   
  public static int coinToss() 
  {
  	 	 
  int toss;
   
  toss = (int)(Math.random() * 2);
  	
  return toss;  	
  }  
 }