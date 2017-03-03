//AltImprovedInputValidationForMarks.java
/*This program uses a do-while loop which processes exactly 5 exam marks
 *supplied by the user. The program determines the highest mark along with
 *the average mark (to the nearest whole number). It performs significantly improved
 *validation on the exam marks compared to the previous version*/
 
 import java.util.Scanner;
 
 public class AltImprovedInputValidationForMarks {
  public static void main(String args[])
  {
  	
  	int i = 1, mark = 0, totalMarks = 0, highestMark = 0, j;
  	String markAsString;
  	boolean valid;
  	
  	Scanner input = new Scanner(System.in);
  	
  	do{
  		
  	 System.out.print("Please enter the mark of student " + i + ": ");
  	 markAsString = input.nextLine();
  	 
  	 while(markAsString.length() < 1 || (markAsString.length() > 2 && !markAsString.equals("100"))
  	 || !Character.isDigit(markAsString.charAt(0))
  	 	|| (markAsString.length() == 2 && !Character.isDigit(markAsString.charAt(1))))
  	 	{
  	 		
  	 		System.out.print("Invalid - Please enter the mark of student " + i + ": ");
	  	     markAsString = input.nextLine(); 		
  	 	}	
  	       
  	  mark = Integer.parseInt(markAsString);
  	       
  	
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