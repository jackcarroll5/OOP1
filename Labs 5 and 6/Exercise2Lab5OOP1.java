//Exercise2Lab5OOP1.java
/*This program will enable a String argument to return it in reverse through the use
 *of the reverse() method*/
 
 import javax.swing.JOptionPane;
 
 public class Exercise2Lab5OOP1 {
  public static void main(String args[])
  {
  	
  	String text;
  	
  text = JOptionPane.showInputDialog("Please enter a piece of text: ");
  
  
  JOptionPane.showMessageDialog(null,"The text reversed is " + reverse(text),
                               "String Reversed",JOptionPane.PLAIN_MESSAGE);
  
  }	 	
  	
  	 public static String reverse(String text)
  	 {
  	 	
  	 String reversedText= " ";
  	 
  	int length = text.length();
  	 
  	  for(int i = 0; i < text.length(); i++) 
  	  {
  	      	reversedText = text.charAt(i)  +  reversedText;	
  	  }
  	
  	return reversedText; 
  	
    
  }
 }