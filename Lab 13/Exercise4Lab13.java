//Exercise4Lab13.java
/*This program illustrates the use of a JFrame GUI Component which will be modified*/

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exercise4Lab13 {
  public static void main(String args[])
  {
  	
   JFrame jFrameWindow = new JFrame("Exercise4.java");	
  	
  //jFrameWindow.setTitle("Exercise4.java");	
  jFrameWindow.setSize(250,250);
  jFrameWindow.setVisible(true);	
  jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  JOptionPane.showMessageDialog(null,"Text obtained from the JFrame title bar is\n\n" 
  	+ jFrameWindow.getTitle(),"Title Bar Text",JOptionPane.INFORMATION_MESSAGE);	
  		 	
  }
}