//Exercise4Lab2OOP1.java
/*This program will use a do-while loop to simulate an ATM machine by offering the user 3 options*/

import java.util.Scanner;

public class Exercise4Lab2OOP1 {
  public static void main(String args[])
  {
  
  String choice;
  int deposit,withdraw;
   float balance = 1000,newBal;
  
  Scanner input = new Scanner(System.in);
  
  do{
  System.out.println("\n\n");
  System.out.print("****************ITT ATM****************\n\n\nPlease choose from the " +
  	 "following transaction types:\n\n'D' is deposit\n'W' is withdrawal\n'X' is Exit the system " +
  	 	"\n\nPlease enter your choice: ");
  choice = input.nextLine();
  choice.toUpperCase();
  
  switch(choice)
  { 
  case "D": 	
  	System.out.println("\n");
  	
            System.out.print("Please enter the amount you wish to deposit: ");
             deposit = input.nextInt();
  
          balance = balance + deposit;
          
         System.out.println("\n\n\nYour balance is now " + String.format("%.2f",balance));
  
         break;
  
     case "W":    	
     	System.out.println("\n\n");
     	
               System.out.print("Please enter the amount you wish to withdraw: ");
             withdraw = input.nextInt();          
           
            balance = balance - withdraw;
  
         System.out.println("\n\n\nYour balance is now " + String.format("%.2f",balance));
  
         break;
  
    case "X":
              System.out.println("\n");
    		
              System.out.println("Thanks for using the system ... goodbye");
  
  }
  
  System.out.print("Please hit return to continue ..... ");
  	input.nextLine();
   input.nextLine();
   
  }while(!choice.equals("X"));
  		
  }
}