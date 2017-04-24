//Exercise2Lab13.java
/*This program will show a confirmation dialog*/

import javax.swing.JOptionPane;

public class Exercise2Lab13 {
 public static void main(String args[])
 {
 	
 	//int YES_OPTION = 0,NO_OPTION = 1,CANCEL_OPTION = 2,CLOSED_OPTION = 3;
 	
   int input = JOptionPane.showConfirmDialog(null,"Take your pick - yes,no or cancel");
 	
    if(input == JOptionPane.YES_OPTION)	
   JOptionPane.showMessageDialog(null,"You chose yes","YES",JOptionPane.PLAIN_MESSAGE);
   
   else if(input == JOptionPane.NO_OPTION)
    JOptionPane.showMessageDialog(null,"You chose no","NO",JOptionPane.PLAIN_MESSAGE);
    
     else if(input == JOptionPane.CANCEL_OPTION)
     JOptionPane.showMessageDialog(null,"You chose cancel","CANCEL",JOptionPane.PLAIN_MESSAGE);
     
      else if(input == JOptionPane.CLOSED_OPTION)
      JOptionPane.showMessageDialog(null,"You closed the window without selecting","CLOSE",JOptionPane.PLAIN_MESSAGE);	
 	
 System.exit(0);	
 }
}
 