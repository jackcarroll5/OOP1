//Exercise7Lab7OOP1.java
/*This program will ask a user to input a piece of text where a method last3Characters()
 *will return the last 3 characters it contains*/
 
 import java.util.Scanner;
 
 public class Exercise7Lab7OOP1 {
   public static void main(String args[])
   {
   	
   	String text;
   	char ch;
   	
   Scanner input = new Scanner(System.in);
   
   System.out.print("Please enter a piece of text: ");	
   	text = input.nextLine();
   	
   	if(!last3Characters(text).equals(" "))
   	{
   	 System.out.println("\nThe last 3 characters in the text is \"" + last3Characters(text) + "\"" );
   	}
   	else
   	 System.out.println("\nInvalid! What you entered contains fewer than 3 characters ");
   	
   }
   
   public static String last3Characters(String text)
   {
   	
	   	String last3;
	   	   
	   if(text.length() < 3)
	      return " ";
	   else
	   {
	       last3 =  " " + text.charAt(text.length() - 3) + text.charAt(text.length() - 2) +
	       	        text.charAt(text.length() - 1);
	   	   return last3;	 	   	
	   }
   }
 }