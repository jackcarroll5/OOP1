//Exercise1Lab2OOP1.java
/*This program will read in a series of positive numbers to track it and find out the average of the numbers
 *where a press of -1 will terminate the program */

import java.util.Scanner;

 public class Exercise1Lab2OOP1 {
  public static void main(String args[])
  {
  
  int count = 0,valuesMoreThan100 = 0,oddValue = 0,totalValue = 0,wholeNum = 0;
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("Please enter a " + (count) + "first +ve whole number (-1 to exit): ");
  wholeNum = input.nextInt();
  
  while(wholeNum != -1)
  {
  
  if(wholeNum % 2 == 1)
   oddValue++;
  
  if(wholeNum > 100)
  valuesMoreThan100++;
   
   totalValue += wholeNum; 
   	
   count++;
   
  System.out.print("Please enter the next +ve whole number (-1 to exit): ");
  wholeNum = input.nextInt(); 
  
  }
  
 System.out.println("\n\n\n=======Results=======\n\nNumber of values entered: " + count +
  "\nNumber of odd values entered: " + oddValue + "\nNumber of values > 100 entered: " + valuesMoreThan100 +
  	 "\nAverage of the values entered: " + String.format("%.0f",(float)totalValue/count)); 
   
  }
 }
  
  