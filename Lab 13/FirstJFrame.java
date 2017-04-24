//FirstJFrame.java
/*This program illustrates the use of a JFrame GUI Component*/

import javax.swing.JFrame;

public class FirstJFrame {
  public static void main(String args[])
  {
  	
   JFrame jFrameWindow = new JFrame();	
  	
  jFrameWindow.setTitle("Our First JFrame GUI Application");	
  jFrameWindow.setSize(350,300);
  jFrameWindow.setVisible(true);	
  jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
  		 	
  }
}