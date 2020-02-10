//OOP1CA15Q3.java
/**/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OOP1CA15Q3
{
 JFrame jFrameWindow;	
 JLabel gameProg;
 JButton rock,paper,scissors;
 int i = 2;	
	
 public OOP1CA15Q3()
 {
  jFrameWindow = new JFrame("Rock,paper,scissors");	
 	
  FlowLayout flowLayout = new FlowLayout();	
  jFrameWindow.setLayout(flowLayout);	
 	
  jFrameWindow.setSize(300,100);
  
  jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  gameProg = new JLabel("Game 1 - the computer has made its choice");
  jFrameWindow.add(gameProg);
  
  rock  = new JButton("Rock");
  jFrameWindow.add(rock);
  
  paper  = new JButton("Paper");
  jFrameWindow.add(paper);
  
  scissors  = new JButton("Scissors");
  jFrameWindow.add(scissors);
  
  ButtonEventHandler handler = new ButtonEventHandler();
  rock.addActionListener(handler);
  paper.addActionListener(handler);
  scissors.addActionListener(handler);
  		
  jFrameWindow.setVisible(true);	
 }	
 	
 public static void main(String args[])
 {
 	OOP1CA15Q3 guiApp = new OOP1CA15Q3();
 }	
 	
 private class ButtonEventHandler implements ActionListener
 {
  public void actionPerformed(ActionEvent e)
  {
  	String gameUpdate = gameProg.getText();
  	int compChoice = (int)(Math.random() * 3) + 1;
  	int userChoice = (int)(Math.random() * 3) + 1;
  	
  	if(userChoice == compChoice)
  	 	JOptionPane.showMessageDialog(null,"neither player won","Result",JOptionPane.INFORMATION_MESSAGE);
  	 else 
  	 	{	
  	 	if(userChoice > compChoice)
  	JOptionPane.showMessageDialog(null,"you won!","Result",JOptionPane.INFORMATION_MESSAGE);
    else
  	JOptionPane.showMessageDialog(null,"you lose!","Result",JOptionPane.INFORMATION_MESSAGE);
  		
  	gameProg.setText("Game " + i + "- the computer has made its choice"); 
  		}	
  	i++;
  }		
 }		
}