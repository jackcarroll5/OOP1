//ImprovedInputValidationForMarks.java
/*This program uses a do-while loop which processes exactly 5 exam marks
 *supplied by the user. The program determines the highest mark along with
 *the average mark (to the nearest whole number). It performs significantly improved
 *validation on the exam marks compared to the previous version*/
 
 import java.util.Scanner;
 
 public class ImprovedInputValidationForMarks {
  public static void main(String args[])
  {
  	
  	int i = 1, mark = 0, totalMarks = 0, highestMark = 0, j;
  	String markAsString;
  	boolean valid;
  	
  	Scanner input = new Scanner(System.in);
  	
  	do{
  		
  	 System.out.print("Please enter the mark of student " + i + ": ");
  	 markAsString = input.nextInt();
  	 
  	 valid = false;
  	 
  	 while(!valid)
  	 {
  	 	for(j = 0; j < markAsString.length(); j++;)
  	 		if(!Character.isDigit(markAsString.charAt(j)))
  	 			break;
  	 	
  	     if(j == markAsString.length())	
  	     {
  	       
  	       mark = Integer.parseInt(markAsString);
  	       
  	       if(mark >= 0 && mark <= 100)
  	       	valid = true;
  	       	else
  	       	{
  	       	   System.out.print("Invalid! Please enter the mark of student " + i + ": ");
  	          markAsString = input.nextLine(); 			
  	       	}
  	     }
  	       	
  	       	else
  	       	{
  	       		System.out.print("Invalid! Please enter the mark of student " + i + ": ");
  	            markAsString = input.nextLine();
  	    
  	       	}	    	
  	     }
  	     	
  	
  	 if(mark > highestMark)
  	  highestMark = mark;
  	  
  	  totalMarks += mark;
  	  
  	  System.out.println("\n");
  	
  	  i++;
  	  
      }while(i <= 5);
      
     
  	     System.out.println("\n\nHighest mark was: " + highestMark + 
      	"\nAverage mark was: " + String.format("%.0f",totalMarks/5f));
   
   }
 }