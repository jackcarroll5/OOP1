//PerfectValidationForChoiceandRadiusImproved.java
/*This program validates the user's choice for a menu-based program*/

import java.util.Scanner;

public class PerfectValidationForChoiceandRadiusImproved {
   public static void main(String args[])
   {
   	
   	   String choice;
       Scanner input = new Scanner(System.in);
       
       do{
       	
       	displayMenu();
       	System.out.print("\n\n\nEnter your choice: ");
       	choice = input.nextLine().toUpperCase();
       	
       	while(!choice.equals("A") && !choice.equals("B") && !choice.equals("C"))
       	{
   	      System.out.print("\nInvalid! Please re-enter your choice (A-C): ");	
       	  choice =  input.nextLine().toUpperCase(); 	
       	}
       	
       	switch(choice)
       	{
       	   case "A":	
       		   cylinderVolume();
       		    break;
       		 case "B":	
       		   semiCircleArea();
       		    break;
       		 case "C":
       		    break; 		
       	}
       	
       }while(!choice.equals("C"));
       System.out.println("\n\nThanks for using the system - goodbye!\n\n");
   }
       	
       	public static void displayMenu()
       	{
       	  System.out.print("\n\n\n\tA. Find volume of cylinder");
       	  System.out.print("\n\tB. Find area of semicircle");
       	  System.out.print("\n\tC. Quit \n\n\n\n");	   		
       	}
       	
       public static void cylinderVolume()
       {
       	
       	float radius,height;
       	String radiusAsString;
       	boolean valid = false;
       	int noOfDots = 0, i;
       	double radiusAsDouble = 0;
       	
       	Scanner input = new Scanner(System.in);
       	
       	System.out.print("\n\nPlease enter the radius of the cylinder: ");
       	radiusAsString = input.nextLine();
       	
       	while(!valid)
       	{
          for(i = 0; i < radiusAsString.length(); i++)
       	   if((!Character.isDigit(radiusAsString.charAt(i)) && radiusAsString.charAt(i) != '.' ) ||
       	   	noOfDots > 1)
       	     break;
       	    else if(radiusAsString.charAt(i) == '.')
       	           noOfDots++;
       	
       	  if(i == radiusAsString.length() && i != 0 && noOfDots <= 1 && !radiusAsString.equals("."))
       	  {
       	  	valid = true;
       	  }
       	
       	else
       	{
       	  System.out.print("\n\nInvalid! Please re-enter the radius of the cylinder: ");	
       	  radiusAsString = input.nextLine();		   		
       	}
       	
       noOfDots = 0;
       
    } 	
       	
    radius = (float)radiusAsDouble;   	
       	
     System.out.print("\n\nPlease enter the height of the cylinder: ");
       	height = input.nextFloat();
       	
       System.out.println("Volume of cylinder is " + String.format("%.2f m3",3.14 * radius * radius * height));
       
       System.out.println("\n\nPlease hit return to continue ...... ");
       input.nextLine();
       input.nextLine();
       System.out.println("\n\n\n\n");   	   	   
       }
       
       public static void semiCircleArea()
       {
       	
       float radius;
       
       Scanner input = new Scanner(System.in);
       
       	System.out.print("\n\nPlease enter the radius of the semicircle: ");
       	radius = input.nextFloat();	
       	
       	System.out.println("Area of semicircle is " + String.format("%.2f m2",3.14 * radius * radius / 2));
       	
       System.out.println("\n\nPlease hit return to continue ...... ");
       input.nextLine();
       input.nextLine();
       System.out.println("\n\n\n\n");
       	
       }
}