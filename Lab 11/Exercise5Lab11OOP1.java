//Exercise5Lab11OOP1.java
/*This program will ask the user to input 10 integerspositive or negative which will be stored in an array.*/

import java.util.Scanner;

public class Exercise5Lab11OOP1 {
 public static void main(String args[])
 {
 
 String integer[] = new String[10];
 int integ, maxInt = 0,minInt = 0;
 
 Scanner input = new Scanner(System.in);
 
 for(int i = 0; i < integer.length; i++)
 {
 
 System.out.print("Please enter an integer: ");
 integer[i] = input.nextLine();	
 	
 integ = Integer.parseInt(integer[i]);	
 
 if(integ > maxInt)
   maxInt = integ;
   
  if(integ < minInt)
   minInt = integ;  
 
 }
 
 System.out.println("\n\n\nThe first value in the array is " + integer[0] +
 	"\n\nThe 5th value in the array is " + integer[4] + "\n\nThe largest number in the array is " 
 		+ maxInt + "\n\nThe smallest number in the array is " + minInt);
 }
}