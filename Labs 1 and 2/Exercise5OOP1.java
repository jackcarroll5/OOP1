//Exercise5OOP1.java
/*This program will determine a person's BMI based on the weight and height of an individual*/

import java.util.Scanner;

public class Exercise5OOP1 {
  public static void main(String args[])
  {
  
  int weight;
  float height,bmi;
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("Please enter your weight: ");
  weight = input.nextInt();
  
  if(weight < 0)
  	System.out.println("\nInvalid weight! Quitting program now..."); 
  		 		 		
  else
  {
  
		  System.out.print("Please enter your height: ");
		  height = input.nextFloat();
		  
		 if(height < 0){
		  	System.out.println("\nInvalid height! Quitting program now...");	 
		 }
		 else
		 {		 
		 
		   bmi = weight / (height * height);
		  
		   if(bmi >= 18.5 && bmi <= 24.99) 	
		   System.out.println("\nYour BMI is " + bmi + " so you are normal"); 
		   	 	  	
		  if(bmi < 18.5) 	
		   System.out.println("\nYour BMI is " + bmi + " so you are underweight"); 
		   	
		  else if(bmi >= 25.0 && bmi <= 29.99) 	
		   System.out.println("\nYour BMI is " + bmi + " so you are overweight");
		   
		  else if(bmi >= 30.0) 	
		   System.out.println("\nYour BMI is " + bmi + " so you are obese");	
		   
		 }
  }
  
  }
}