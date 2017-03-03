//SimpleInputValidationForMarks.java
/*This program uses a do-while loop which processes exactly 5 exam marks
 *supplied by the user. The program determines the highest mark along with
 *the average mark (to the nearest whole number). It performs some simple
 *validation on the exam marks*/
 
 import java.util.Scanner;
 
 public class SimpleInputValidationForMarks {
  public static void main(String args[])
  {
  	
  	int i = 1, mark, totalMarks = 0, highestMark = 0;
  	
  	Scanner input = new Scanner(System.in);
  	
  	do{
  		
  	 System.out.print("Please enter the mark of student " + i + ": ");
  	 mark = input.nextInt();
  	 
  	 while(mark < 0 || mark > 100)
  	 {
  	 	System.out.print("Invalid! Please enter the mark of student " + i + ": ");
  	    mark = input.nextInt();
  	 	
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