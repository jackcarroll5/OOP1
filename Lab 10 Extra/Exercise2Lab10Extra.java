//Exercise2Lab10Extra.java
/*This program will validate a Visa debt card which will use a perfect validation
 * to be 16 characters long for example*/
 
 import javax.swing.JOptionPane;
 
 public class Exercise2Lab10Extra {
   public static void main(String args[])
   {
   	
   boolean valid = false;	
   	String debitCard;
   	int i,j;
   		
   	debitCard = JOptionPane.showInputDialog("Please enter a 16-digit debit card number");
   	  		
   	while(!valid)
   	{	
   	if(debitCard.length() == 16)
   	{
   	  if(debitCard.charAt(0) == '4')	
   	  {
   	  	for(i = 1; i < 16; i++)
   	  		if(!Character.isDigit(debitCard.charAt(i)))
   	             break;
   	             
   	        if(i == 16) 
   	         {
   	          	int total = 0,num;
   	          	
   	           for(j = 0; j < 16; j++)
   	           {
   	           	 if(j % 2 == 0)
   	           	 {
   	           	  num = Character.getNumericValue(debitCard.charAt(j) * 2);	
   	           	  	
   	              if(num > 9)   	 	
   	           	 num = 1 + (num % 10);
   	           	 total += num;	
   	           	 }
   	           	 
   		      else     	
   	           	total += Character.getNumericValue(debitCard.charAt(j));
   	       }
   	       
   	       	if(total % 10 == 0)
   	          valid = true;	
   	          else	
   	           debitCard = JOptionPane.showInputDialog("Invalid - failed the golden rule! Please re-enter");  	   	
   	          	
   	      }  
   	       else	
   	         debitCard = JOptionPane.showInputDialog("Invalid - must contain all digits! Please re-enter");  	             
   	  }
   	  else	
   	    debitCard = JOptionPane.showInputDialog("Invalid - must begin with a 4! Please re-enter");		
   	}	
   	 else	
   	    debitCard = JOptionPane.showInputDialog("Invalid debit card length! Please re-enter");	
   		
   	}
   	
   JOptionPane.showMessageDialog(null,"The debit card " + debitCard + " is valid", "Valid!",
   JOptionPane.INFORMATION_MESSAGE);	
   	
    System.exit(0);
  	
   }
 }