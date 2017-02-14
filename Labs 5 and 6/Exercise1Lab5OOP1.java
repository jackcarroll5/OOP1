//Exercise1Lab5OOP1.java
/*This program will use a user-defined method called minimum() which will return the smallest of
 *2 numbers to main()*/
 
 import java.util.Scanner;
 
 public class Exercise1Lab5OOP1 {
   public static void main(String args[])
   {
   
     float num1,num2;
     
     Scanner input = new Scanner(System.in);
     
     System.out.print("Please enter a first number: ");
     num1 = input.nextFloat();
     
      System.out.print("Please enter a second number: ");
     num2 = input.nextFloat();
     
     System.out.println("\n\nThe smaller of the 2 numbers you entered is " + Minimum(num1,num2));
     
   }
   
   public static float Minimum(float a,float b)
   {
   	if(a < b)
       return a;
    else
    	return b; 
   	
   }
 }