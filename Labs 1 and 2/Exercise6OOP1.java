//Exercise6OOP1.java
/*This program will ask a user to enter nine characters to check if the word entered forms 
 *a palindrome*/

import java.util.Scanner;

public class Exercise6OOP1 {
  public static void main(String args[])
    {
  
   String word;
     
 Scanner input = new Scanner(System.in);
 
 System.out.print("Please enter a word 9 characters long: ");
 word = input.nextLine();
 
 
 if(word.length() != 9)
 System.out.println("\nInvalid word! Quitting program now");
 
 else{
 
 if(word.charAt(0) == word.charAt(8) && word.charAt(1) == word.charAt(7) && word.charAt(2) == word.charAt(6) && +
 	word.charAt(3) == word.charAt(5))
 
  System.out.println("\nThe word you entered is a palindrome");
 
 else
 System.out.println("\nThe word you entered is not a palindrome");
 
 }
 
 
    }
}