//Exercise4Lab10Extra.java
/*This program will validate registration plates for cars bought in Ireland which will 
have perfect validation if the conditions are met*/

import javax.swing.JOptionPane;

public class Exercise4Lab10Extra {
  public static void main(String args[])
  {
  	
  	String regNo,validRegNo = "";
  	int j;
  	boolean valid = false;
  
   for(int i = 1; i <= 4; i++)
   {
   	regNo = JOptionPane.showInputDialog("Iteration " + i + " Please enter the registration number ");
   	
   	while(!valid)
   	    {
   		  if(regNo.length() >= 6 && regNo.length() <= 12)
   		  {
   		    if(Character.isDigit(regNo.charAt(0)) && Character.isDigit(regNo.charAt(1)))
   		    {
   		      if(regNo.charAt(2) == '-')
   		      {
   		      	if((Character.isUpperCase(regNo.charAt(3)) && Character.isUpperCase(regNo.charAt(4))
   		      	&& regNo.charAt(5) == '-') || (Character.isUpperCase(regNo.charAt(3))) && regNo.charAt(4) == '-'
   		       && Character.isDigit(regNo.charAt(5)))
   		        {
   		       
   		      	for(j = 6; j < regNo.length(); j++)
   		      	if(!Character.isDigit(regNo.charAt(j)))
   		      	      break;
   		      	      
   		      	if(j == regNo.length()) 
   		      	{ 		      		
   		      	valid = true;			      		  		      		
   		      	}     
   		      	  else
   		           regNo = JOptionPane.showInputDialog("Invalid! Last part of registration must be digits. Please re-enter");	
   	     	
   		        }
   		         else
   		           regNo = JOptionPane.showInputDialog("Invalid! Something wrong with 4th,5th or 6th characters. Please re-enter");	
   	       	  }
   		        else
   		          regNo = JOptionPane.showInputDialog("Invalid! Third character must be a dash. Please re-enter");
   	     	}
   	     	else
   		        regNo = JOptionPane.showInputDialog("Invalid! First 2 characters must be digits. Please re-enter");	 	  
      	  } 
      	  	else
      	  	  	regNo = JOptionPane.showInputDialog("Invalid! Must be between 6 and 12 characters. Please re-enter");	 	  	   	  	
   }  
  	validRegNo += regNo + "\n";	
  } 
  	JOptionPane.showMessageDialog(null,"The valid registration numbers entered are:\n\n " 
   + validRegNo,"Valid Registration Numbers",JOptionPane.INFORMATION_MESSAGE);
   
  System.exit(0); 
 }
}