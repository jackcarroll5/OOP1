//Exercise4Lab7OOP1.java
/*This program will read in integers which will have a user-defined method called isEven()
 *which will determine if the integer is even*/
 
 import javax.swing.JOptionPane;
 
 public class Exercise4Lab7OOP1{
  public static void main(String args[])
  {
  	
  int intNum;	
  String intNumAsString = " ";
  
  while(intNumAsString == " ")
  {
  	
  intNumAsString = JOptionPane.showInputDialog("Please enter an integer ");
  intNum = Integer.parseInt(intNumAsString);
  
  if(isEven(intNum) == false)
  JOptionPane.showMessageDialog(null,"You entered an even number","Even Test",
  JOptionPane.PLAIN_MESSAGE);
  else
  JOptionPane.showMessageDialog(null,"You entered an odd number","Even Test",
  JOptionPane.PLAIN_MESSAGE);
  
  intNum++;  
  
   }
   System.exit(0);
  }
  
  public static boolean isEven(int intNum)
  {
  	
 return intNum % 2 == 1;
 
  } 
  
 }