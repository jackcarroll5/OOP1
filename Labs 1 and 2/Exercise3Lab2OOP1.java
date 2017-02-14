//Exercise3Lab2OOP1.java
/*This program will validate if a number is a perfect number by inputting a number*/

import java.util.Scanner;

public class Exercise3Lab2OOP1 {
  public static void main(String args[])
   {
   	
   int number,divisor;	
   	
   Scanner input = new Scanner(System.in);

 System.out.print("Please enter a number: ");
 number = input.nextInt();
 
 divisor = number / 2;
 
 while(number > divisor)
 {
 	
 //Factors of 496 = 1,2,4,8,16,31,62,124,249,496
 	
if(divisor < 1/2f * number)
System.out.println("This is a perfect number");
else
System.out.println("This is not a perfect number"); 

   }
     
   }
}
