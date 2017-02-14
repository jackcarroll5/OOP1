//Exercise3Lab4OOP1.java
/*This program will use a Character class to verify that a character is a digit*/

import javax.swing.JOptionPane;

public class Exercise3Lab4OOP1 {
  public static void main(String args[])
    {
  
      char ch;
      String charAsString;
      
     charAsString = JOptionPane.showInputDialog("Please enter any character ");
     ch = charAsString.charAt(0); 
      
     if(Character.isDigit(ch) == true)
     JOptionPane.showMessageDialog(null,"You entered a digit","Digit Test",
     JOptionPane.PLAIN_MESSAGE);
     else
         JOptionPane.showMessageDialog(null,"You did not enter a digit","Digit Test",
     JOptionPane.PLAIN_MESSAGE);
      
    
    System.exit(0);
     
    }
}