//Exercise3Lab14.java
/*This program uses some text-fields for input and a button to submit the user's input. The
 *program should calculate the average age of the group and give the name of the oldest 
 *person. There is some validation built-in to the GUI also*/
 
 import javax.swing.*;
 import java.awt.event.*;
 import java.awt.*;
 
 public class Exercise3Lab14 {
 	
 	JTextField nameField;
 	JTextField ageField;
 	String nameOldest;
 	String namesAboveAverage = "";
 	JFrame jFrameWindow;
 	int totalProcessed = 0,totalAge = 0,youngestAge = 1000,oldestAge = 0; 
 	int ages[] = new int[4];
 	String names[] = new String[4],name;
 	
 	public Exercise3Lab14()
 		{	
 	  jFrameWindow = new JFrame("Enter Details");
 	
 	 FlowLayout flowLayout = new FlowLayout();
 	 jFrameWindow.setLayout(flowLayout);
 	 
 	 jFrameWindow.setSize(250,100);
 	
 	 jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	
 	 JLabel nameLabel = new JLabel("Name:");
 	  jFrameWindow.add(nameLabel);
 	  
 		 nameField = new JTextField(15);
 	  jFrameWindow.add(nameField);
 	  
 	JLabel ageLabel = new JLabel("Age:");
 	jFrameWindow.add(ageLabel);
 	 
 	ageField = new JTextField(3);
 	 jFrameWindow.add(ageField);
 	
 	JButton submitButton = new JButton("Submit");
 	jFrameWindow.add(submitButton);
 	
      ButtonEventHandler handler = new ButtonEventHandler();
      TextFieldEventHandler tfh = new TextFieldEventHandler(); 	
 	  submitButton.addActionListener(handler);
 	  nameField.addActionListener(tfh);
 	   //ageField.addActionListener(handler);
 	
 	 jFrameWindow.setVisible(true);	
 	}
 	
 	public static void main(String args[])
 	{
 	 Exercise3Lab14 guiApp = new Exercise3Lab14(); 	
 	}
 		
 	private class TextFieldEventHandler implements ActionListener
 	{
 	  public void actionPerformed(ActionEvent e)	
 	  {
 	  	ageField.requestFocus(true);
 	  }
 	}
 		
 	private class ButtonEventHandler implements ActionListener
 	{
 	  public void actionPerformed(ActionEvent e)	
 	  { 	  
 	    int choice;
 	  	float averageAge = 0;
 	  	
 	  	name = nameField.getText();
 	  		  	
 	  	if(!name.equals(""))
 	  	{
 	  		names[totalProcessed] = name;
 	  	   String ageAsString = ageField.getText();
 	  	    
 	  	    //for(int i = 0; i < ages.length; i++)	
 	  	   ages[totalProcessed] = Integer.parseInt(ageAsString);	  	   
 	  	   //ages[totalProcessed] = ages[i];	
 	    	totalAge += ages[totalProcessed];  	   	
 	  	
 	  	 //for(int i = 0; i < ages.length; i++)	
 	  	if(ages[totalProcessed] < youngestAge)	
 	  	{
 	  	  youngestAge = ages[totalProcessed];
 	  	}
 	  	 //for(int i = 0; i < ages.length; i++)
 	  	 if(ages[totalProcessed] > oldestAge)
 	  	 {	 	
 	  	  nameOldest = names[totalProcessed];	
 	     }	      
 	      totalProcessed++;     	  		
 	  }
 	  
 	  nameField.setText("");
 	  ageField.setText("");
 	   	  
 	  choice = JOptionPane.showConfirmDialog(null,"More details to enter?","",
 	  JOptionPane.YES_NO_OPTION);
 	  
 	  if(choice == JOptionPane.NO_OPTION)
 	  {
 	    jFrameWindow.setVisible(false);	
 	  	if(totalProcessed != 0)
 	  	{
 	  	  averageAge = (float)totalAge / totalProcessed;
 	  	  
 	  	  for(int i = 0; i < ages.length; i++)
 	  	  	if(ages[i] > averageAge)
 	  	      namesAboveAverage += names[i] + ", ";	  	  
 	  	  	
 	  	  JOptionPane.showMessageDialog(null,"Average age: " +
 	  	  averageAge + "\nOldest person: " + nameOldest + "\nYoungest age: " +
 	  	  youngestAge + "\n\nThe folowing people are above the average age:\n\n" +
 	  	  namesAboveAverage,"Statistics",
 	  	  JOptionPane.INFORMATION_MESSAGE);		  		
 	  	}
 	  	else
 	  	{
 	  	  JOptionPane.showMessageDialog(null,"You entered no details" +
 	  	  "\nThanks for using the system - goodbye!","Statistics",
 	  	  JOptionPane.INFORMATION_MESSAGE);		  			 		
 	  	}
 	  }	 	   
 	  	//System.exit(0);
 	  }	
 	 }		
    }	