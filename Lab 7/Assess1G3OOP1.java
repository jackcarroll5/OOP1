//Assess1G3OOP1.java
/**/

import javax.swing.JOptionPane;

public class Assess1G3OOP1 {
  public static void main(String args[])
  {
  	
  String valueString = " ",validString = " ";
  int valid = 0;	
  	
  for(int i = 1; i <= 4; i++) 	
   {
   	
  	valueString = JOptionPane.showInputDialog("Loop " + i + "- Please enter your value ");
  	
  	if(isHexadecimal(valueString)){
  		validString += valueString + "  ";
        valid++; 
  	}   					
   }
   
   JOptionPane.showMessageDialog(null,"The list of valid hexadecimal values entered is " + validString +
   	"\nThe percentage of valid hexadecimal values entered is " + valid / 4f * 100  + "%","Program Results",
   	JOptionPane.INFORMATION_MESSAGE);
 				
  }
  
  public static boolean isHexadecimal(String valueString)
  {
  	
  boolean hex = false;
  int validCount = 0;	
 	
  for(int i = 0; i < valueString.length(); i++)
  {
  	
    if(valueString.charAt(i) >= '0' && valueString.charAt(i) <= '9' || 
       valueString.charAt(i) >= 'A' && valueString.charAt(i) <= 'F' )
    {
     validCount++;
    }
  }
  
  if(validCount == valueString.length())
       hex = true;
  
  return hex;
 }
}