//Exercise5Lab13.java
/*This program adds a JLabel to a JFrame window*/

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class Exercise5Lab13 {
 public static void main(String args[])
 {
 	
 JFrame jFrameWindow = new JFrame("Adding a JLabel to a JFrame");	
 	
 FlowLayout flowLayout = new FlowLayout();	
 	
 jFrameWindow.setLayout(flowLayout);
 
 
  jFrameWindow.setSize(300,100);
  
  jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  JLabel jLabel = new JLabel("Java rules!");
  
 
  jFrameWindow.add(jLabel);
  
   jFrameWindow.setVisible(true);		
 }
}