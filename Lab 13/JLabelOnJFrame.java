//JLabelOnJFrame.java
/*This program adds a JLabel to a JFrame window*/

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;

public class JLabelOnJFrame {
 public static void main(String args[])
 {
 	
 JFrame jFrameWindow = new JFrame();	
 	
 FlowLayout flowLayout = new FlowLayout();	
 	
 jFrameWindow.setLayout(flowLayout);
 
 jFrameWindow.setTitle("Adding a JLabel to a JFrame");
  jFrameWindow.setSize(300,100);
  
  jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  JLabel jLabel = new JLabel();
  jLabel.setText("Java rules!");
  
  jFrameWindow.add(jLabel);
  
   jFrameWindow.setVisible(true);		
 }
}