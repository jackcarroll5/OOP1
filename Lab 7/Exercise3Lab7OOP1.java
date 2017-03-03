//Exercise3Lab7OOP1.java
/*This program will use a user-defined method called myIsDigit()to see if a character
 *is a digit depending on whether it's true or false*/
 
 import javax.swing.JOptionPane;
 
 public class Exercise3Lab7OOP1 {
  public static void main(String args[])
  {
  	
  String charAsString;	
  	char ch;
  	
  charAsString = JOptionPane.showInputDialog("Please enter a keyboard character ");
  ch = charAsString.charAt(0);
  
 if(myIsDigit(ch))
 {
 JOptionPane.showMessageDialog(null,"You entered a digit","Digit Test",JOptionPane.PLAIN_MESSAGE);
 }
 else	
 JOptionPane.showMessageDialog(null,"You did not enter a digit","Digit Test",JOptionPane.PLAIN_MESSAGE);
 
 System.exit(0);
 	
  }
  
  public static boolean myIsDigit(char ch)
  {
  	
  	//char ch;
  	boolean result = false;
  	
  	if(Character.isDigit(ch))
  	{
  		result = true;
  
  	}
  	
  	return result;
  }
  
 }