//Exercise1Lab13.java
/*This program will use different outputs to show 3 icons for messages*/

import javax.swing.JOptionPane;

public class Exercise1Lab13 {
  public static void main(String args[])
  {
  	
  JOptionPane.showMessageDialog(null,"This message dialog uses an error message icon","Error!",
  JOptionPane.ERROR_MESSAGE);	
  	
   JOptionPane.showMessageDialog(null,"This message dialog uses a warning message icon","Warning!",
  JOptionPane.WARNING_MESSAGE);
  
  JOptionPane.showMessageDialog(null,"This message dialog uses a question message icon","Question!",
  JOptionPane.QUESTION_MESSAGE);				
  	
  System.exit(0);	
  }
}