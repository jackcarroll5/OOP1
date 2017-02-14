//Exercise2Lab2OOP1.java
/*This program will read in the-t-number of a student which will have 10 characters*/

import java.util.Scanner;

public class Exercise2Lab2OOP1 {
  public static void main(String args[])
  {
  
 String tNumber;
  char character;
  int digits = 0, i = 1;
  
Scanner input = new Scanner(System.in);

System.out.print("Please enter the students t-number: ");
tNumber = input.nextLine();

 if(tNumber.length() == 10)	
   {

if(tNumber.charAt(0) = 't' || tNumber.charAt(0) = 'T')
{
      
    while(i < tNumber.length())
    {   
    	
    character = tNumber.charAt(i);	
    	
    if(character >= '1' || character <= '9')		
	digits++;
	
}

if(digits == 9)
 System.out.println("The t-number entered is valid"); 
else
 System.out.println("Invalid! Some of the characters after the first one are not digits"); 
      
   }

      else
          System.out.println("Invalid! The t-number entered does not begin with a 't' or 'T'");   
          	
          	
   }	   
       else 
      System.out.println("Invalid! The t-number entered does not contain 10 characters");      
      
 }
}