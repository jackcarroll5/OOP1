//Exercise1Lab7OOP1.java
/*This program will use a user-defined method called periodCalculator() to determine 
the period of a pendulum*/

import java.util.Scanner;

public class Exercise1Lab7OOP1 {
  public static void main(String args[])
  {
  	
  float length;	
  	
  Scanner input = new Scanner(System.in);
  
  System.out.print("Please enter the length of the pendulum: ");
  length = input.nextFloat();
  
  System.out.println("The period of the pendulum is " + String.format("%.3f",periodCalculator(length))  + " seconds ");	
  		
  }
  
 public static double periodCalculator(float length) 
 {
 	
 	double period;
  final double g = 9.8f;	
  	
 return period = ((2 * Math.PI) * (Math.sqrt(length / g)));	
  	 	
 }
   
}