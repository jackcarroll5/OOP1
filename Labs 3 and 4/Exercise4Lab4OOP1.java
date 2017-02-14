//Exercise4Lab4OOP1.java
/*This program will verify if a username and password is valid*/

import javax.swing.JOptionPane;

public class Exercise4Lab4OOP1 {
 public static void main(String args[])
  {
 
 String username,tNum;
 
 username = JOptionPane.showInputDialog("Please enter your username ");
 tNum = JOptionPane.showInputDialog("Please enter your password ");
 
 //if(username.equalsIgnoreCase("joe bloggs") && tNum.equals("t123456"))
 if(username.toLowerCase().equals("joe bloggs") && tNum.equals("t123456"))
 JOptionPane.showMessageDialog(null,"Welcome to the System","Input",JOptionPane.PLAIN_MESSAGE);
 else
  JOptionPane.showMessageDialog(null,"Invalid username and/or password","Input",JOptionPane.PLAIN_MESSAGE);
 
 
  }
}