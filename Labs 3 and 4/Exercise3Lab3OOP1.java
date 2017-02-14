//Exercise3Lab3OOP1.java
/*This program will use a counter-controlled while loop to read in details of 5 students*/

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class Exercise3Lab3OOP1 {
  public static void main(String args[])
  {
  
    String name,tNum,course,average;
    int i = 1;
  
   JTextArea textArea = new JTextArea(12,40);
   Font textAreaFont = new Font("monospaced",Font.PLAIN,12);
   textArea.setFont(textAreaFont);
   	
   	textArea.setText(String.format("%-20s%-15s%-26s%-8s\n%-20s%-15s%-26s%s\n\n","Name","T-Number",
   	  "Course","Avg Mark","====","========","======","========"));
   	  
   	while (i <= 5)
   	{
   		
      name = JOptionPane.showInputDialog("Please enter the name of student " + i + ": ");		
   	  tNum =  JOptionPane.showInputDialog("Please enter the t-number of student " + i + ": ");	
   	  course = JOptionPane.showInputDialog("Please enter the course of student " + i + ": ");	
   	  average = JOptionPane.showInputDialog("Please enter the average mark of student " + i + ": ");
   	  
   	  textArea.append(String.format("%-20s%-15s%-28s%-28s\n",name,tNum,course,average));
   	  
   	  JOptionPane.showMessageDialog(null,textArea,"JTextArea Formatting Results",JOptionPane.PLAIN_MESSAGE);
   	  
   	  //textArea.setText(String.format("%-20s%-15s%-23s%-8s\n%-20s%-15s%-23s%s\n\n","Name","T-Number",
   	  //"Course","Avg Mark","====","========","======","========"));
   	  	  
   	  i++; 	
   		
   	}  
   		
   		System.exit(0);
   		
  }
}