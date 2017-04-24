//JButtonOnJFrame.java
/*This program uses some text-fields for input and a button to submit the user's input. The
 *program should calculate the average age of the group and give the name of the oldest 
 *person. There is some validation built-in to the GUI also*/
 
 import javax.swing.*;
 import java.awt.event.*;
 import java.awt.*;
 
 public class JButtonOnJFrame {
 	
 	JTextField nameField;
 	JTextField ageField;
 	String nameOldest;
 	JFrame jFrameWindow;
 	int totalProcessed = 0,totalAge = 0,oldestAge = 0; 
 	
 	public JButtonOnJFrame()
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
 	  submitButton.addActionListener(handler);
 	
 	 jFrameWindow.setVisible(true);	
 	}
 	
 	public static void main(String args[])
 	{
 	 JButtonOnJFrame guiApp = new JButtonOnJFrame(); 	
 	}
 	
 	private class ButtonEventHandler implements ActionListener
 	{
 	  public void actionPerformed(ActionEvent e)	
 	  {
 	  	String name,ageAsString;
 	  	int age = 0,choice;
 	  	float averageAge;
 	  	
 	  	name = nameField.getText();
 	  	
 	  	if(!name.equals(""))
 	  	{
 	  	   ageAsString = ageField.getText();	
 	  	   age = Integer.parseInt(ageAsString);	
 	  	totalAge += age;
 	  	totalProcessed++;	
 	  		
 	  	if(age > oldestAge)	
 	  	{
 	  	  oldestAge = age;	
 	  	  nameOldest = name;	
 	  	}
 	  		
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
 	  	  JOptionPane.showMessageDialog(null,"Average age: " +
 	  	  averageAge + "\nOldest person: " + nameOldest,"Statistics",
 	  	  JOptionPane.INFORMATION_MESSAGE);		  		
 	  	}
 	  	else
 	  	{
 	  	  JOptionPane.showMessageDialog(null,"You entered no details" +
 	  	  "\nThanks for using the system - goodbye!","Statistics",
 	  	  JOptionPane.INFORMATION_MESSAGE);		  			 		
 	  	}
 	  	System.exit(0);
 	  } 	
 	 }		
    }	
 }