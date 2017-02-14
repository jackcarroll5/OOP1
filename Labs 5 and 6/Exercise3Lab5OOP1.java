//Exercise3Lab5OOP1.java
/*This program will use auser-defined method called isWholeNumber() to determine whether
 *a string argument forms a whole number*/
 
 import javax.swing.JOptionPane;
 
 public class Exercise3Lab5OOP1 {
  public static void main(String args[])
  {
  	
  	String text;
  	
  text = JOptionPane.showInputDialog("Please enter a piece of text");
  
  if(isWholeNumber(text))		
  JOptionPane.showMessageDialog(null,"The text you entered constitutes a whole number",
                               "Number Tester",JOptionPane.INFORMATION_MESSAGE);
 else	
  JOptionPane.showMessageDialog(null,"The text you entered does not constitute a whole number",
                               "Number Tester",JOptionPane.INFORMATION_MESSAGE);	  	
  }
  
  public static boolean isWholeNumber(String text)
  {
  	
  	boolean result = false;
  	char ch;
  	
  	for(int i = 0; i < text.length(); i++)
  	{
  		
	  	if(Character.isDigit(text.charAt(i)))
	  	{
	  	    result = true;
	  	    //break;	
	  	}
	  	else
	  	{
	  		result = false;
	  	    break;
	  	}
	  	
	  	/*
	  	 *if(!Character.isDigit(text.charAt(i)))
	  	 *{
	  	 *       result = false;
	  	 *       break;
	  	 *}*/
  	
  	}
  return result;	
  	
  }
 }