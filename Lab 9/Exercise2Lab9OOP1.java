//Exercise2Lab9OOP1.java
/*This program will read in amounts of positive and negative whole numbers which will
 *be perfectly validated.*/
 
 import javax.swing.JOptionPane;
 
 public class Exercise2Lab9OOP1{
   public static void main(String args[])
   {
   
   String noAsString;
   double noAsDouble;
   int numbers = 0,totalNum = 0,largestNum = -1000000,smallestNum = 1000000,negativeNum = 0,noOver1000 = 0,evenValue = 0;
   int values=0,i;
   boolean valid = false;
    
   do {
   
   	 noAsString = JOptionPane.showInputDialog("Please enter a whole number(x to exit)");
   	 
   	 valid = false;
   	 
   	 while(!valid && !noAsString.equals("x"))
   	 {
   	 
   	 if(!noAsString.equals("") && (Character.isDigit(noAsString.charAt(0))
   	 	|| noAsString.charAt(0) == '-'))
   	 	{
   	 		
   	 		for(i = 1; i < noAsString.length(); i++)                    //Over 31 = valid
   	 		  if(!Character.isDigit(noAsString.charAt(i))) //&& 
   	 		     // noAsString.charAt(i) != '-')
   	 		  		break;
   	 		  		
   	 		  		
   	 		  if(i == noAsString.length() && !noAsString.equals("-")
   	 		  && !noAsString.equals(".") && !noAsString.equals("-."))
   	 		  {
   	 		  	
   	 		  	noAsDouble = Double.parseDouble(noAsString);
   	 		  	
   	 		  	if(noAsDouble >= -Float.MAX_VALUE && noAsDouble <= Float.MAX_VALUE)
   	 		  		valid = true;
   	 		  	else
   	 		  	    noAsString = JOptionPane.showInputDialog("Invalid! Please re-enter a whole number (x to exit)");	
   	 		  	
   	 		  }
   	 		  else
   	 		     noAsString = JOptionPane.showInputDialog("Invalid! Please re-enter a whole number (x to exit)");
   	 		  	
   	 		}  	
   	 	 else			
   	 	    noAsString = JOptionPane.showInputDialog("Invalid! Please re-enter a whole number (x to exit)");			
   	 }		
   	 
   	 if(!noAsString.equals("x"))
   	 {
   	 numbers = Integer.parseInt(noAsString);
   	 
     if(numbers > largestNum)
     	largestNum = numbers;
     	
     	 if(noAsString.length() < smallestNum)
     	smallestNum = numbers;
     	
       if(numbers < 0)
       	  negativeNum++;
       	  
       if(numbers > 1000)	  
       	noOver1000++;
       	
       if(numbers % 2 == 0)
       	evenValue++;
       	
       	
     	
       	
     //noOver1000 += numbers;  
    
     //negativeNum += numbers; 	
     	
    totalNum += numbers;
  
    values++;
   	 }
    
    }while(!noAsString.equals("x"));
   
   
  JOptionPane.showMessageDialog(null,"The average of the numbers entered is: " + String.format("%.2f",(float)totalNum /values) +
  	"\nThe largest of the numbers entered is: " + largestNum + "\nThe smallest of the numbers entered is: " + smallestNum +
  		"\nThe percentage of the numbers that were negative: " + String.format("%.2f",(float) negativeNum/values * 100) + "\nThe percentage of the numbers that exceeded 1000: " +
  			String.format("%.2f",(float)noOver1000/values * 100) + "\nThe number of even values: " + evenValue,"Results",JOptionPane.INFORMATION_MESSAGE); 
  				
  				System.exit(0);
   
   }    
 }