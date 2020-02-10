//OOP1Q314.java
/**/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OOP1Q314
{
 JFrame jFrameWindow;
 JButton generate;
 JLabel noGenerated;
 JLabel latestNoGen;	
	
 public OOP1Q314()
 {
  jFrameWindow = new JFrame("Random Numbers");	
	
  FlowLayout flowLayout = new FlowLayout();	
  jFrameWindow.setLayout(flowLayout);	
	
  jFrameWindow.setSize(400,150);	
	
  jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  noGenerated = new JLabel("no random numbers have yet been generated");
  jFrameWindow.add(noGenerated);
  
  generate = new JButton("Generate Random Number");
  jFrameWindow.add(generate);
  
   latestNoGen = new JLabel("");
   jFrameWindow.add(latestNoGen);
   
   ButtonEventHandler handler = new ButtonEventHandler();
   generate.addActionListener(handler);
  	
  jFrameWindow.setVisible(true);	
 }	
 	
 public static void main(String args[])
 {
  OOP1Q314 guiApp = new OOP1Q314();	
 }	
 
 private class ButtonEventHandler implements ActionListener
 {
  public void actionPerformed(ActionEvent e)
  {
   int randomNo;
   String latestNumberGen = latestNoGen.getText();;
   String numberGen = noGenerated.getText();
   int count = 1;
    
   randomNo = (int)(Math.random() * 10) + 1;
   
   noGenerated.setText("The number of random numbers that have been generated is: " + count);
   latestNoGen.setText("The latest randomly generated number was: " + randomNo);
   
   count++;
   }
  }	
 }	