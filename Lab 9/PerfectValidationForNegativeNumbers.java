//PerfectValidationForNegativeNumbers.java
/*This program gets the user to enter exactly 5 numbers which could be
 *whole or fractional, positive or negative and validates each one*/
 
 import javax.swing.JOptionPane;
 
 public class PerfectValidationForNegativeNumbers{
   public static void main(String args[])
   {
     float no,sum = 0;
      String noAsString;
    int j, noOfDots = 0;
    boolean valid;
    double noAsDouble = 0;
    
    for(int i = 1; i <= 5; i++)
    { 	
      noAsString = JOptionPane.showInputDialog("Iteration " + i + " - please enter a number");	
    	
      valid = false;	
    	
    while(!valid)
    {
       if(!noAsString.equals("") && (Character.isDigit(noAsString.charAt(0))
       	|| noAsString.charAt(0) == '-' || noAsString.charAt(0) == '.'))	
       	{
       		if(noAsString.charAt(0) == '.')
       		   noOfDots++;
       		   
       		   for(j = 1; j < noAsString.length(); j++)
	       		if(!Character.isDigit(noAsString.charAt(j)) && 
	       			noAsString.charAt(j) != '.' || noOfDots > 1)
	       		     break;
	       	    else if(noAsString.charAt(j) == '.')
	       		    noOfDots++;
       		     	
       	if(j == noAsString.length() && noOfDots <= 1 && !noAsString.equals("-")
       		&& !noAsString.equals(".") && !noAsString.equals("-."))
       		{
       		   noAsDouble = Double.parseDouble(noAsString);	
       			
       		   if(noAsDouble >= -Float.MAX_VALUE && noAsDouble <= Float.MAX_VALUE)	
       			valid = true;
       			else
       				noAsString = JOptionPane.showInputDialog("Iteration " + i + " - please re-enter a number");
       		}    	      	  
       	  else
       	  	noAsString = JOptionPane.showInputDialog("Iteration " + i + " - please re-enter a number");
       		 noOfDots = 0;    	
       		     	
       	}   	
    else	
    	noAsString = JOptionPane.showInputDialog("Iteration " + i + " - please re-enter a number");   	
    }
    
   no = (float)noAsDouble;  
    sum += no;
        	
  }
    
  JOptionPane.showMessageDialog(null,"The sum of the numbers entered is " + sum, "Sum of Numbers",
     JOptionPane.INFORMATION_MESSAGE); 
     	
     	System.exit(0);    
 } 
}  