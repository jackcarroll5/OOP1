//AverageMethodImproved.java
/*This program uses a user-defined ,ethod called average() to determine the average of
 *3 user supplied values*/
 
 import java.util.Scanner;
 
 public class AverageMethodImproved {
   public static void main(String args[])
   {
   
     double num1,num2,num3;
     
     Scanner input = new Scanner(System.in);
     
     System.out.print("Please enter a first number: ");
     num1 = input.nextDouble();
     
     System.out.print("Please enter a second number: ");
     num2 = input.nextDouble();
     
     System.out.print("Please enter a third number: ");
     num3 = input.nextDouble();
     
     System.out.println("\n\nThe average of the 3 numbers you entered is " +
     	               String.format("%.3f",average(num1,num2,num3)));
     	               
   }
   
   public static double average(double a,double b,double c)
   {  	
   	 return(a+b+c)/3; 	 
   }
 }