//Exercise3OOP1.java
/*This program will read in a number of inches to convert it into feet and inches*/

import java.util.Scanner;

public class Exercise3OOP1{
   public static void main(String args[])
      {
   
   int feet,remainingInches,inches;
   
  Scanner input = new Scanner(System.in);
  
  System.out.print("Please enter the total number of inches: ");
  inches = input.nextInt();
  
  feet = inches / 12;
  remainingInches = inches % 12;
  
  System.out.println("\n" + inches + "\" is equivalent to " + feet + "'" + remainingInches + "\"");
  
      }
}