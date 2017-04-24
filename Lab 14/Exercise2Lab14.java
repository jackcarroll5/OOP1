//Exercise2Lab14.java
/*This program will form a JFrame window which will allow the user to input their
 *name and password*/
 
 import java.awt.event.*;
 import javax.swing.*;
 import java.awt.*;
 
 public class Exercise2Lab14 {
 	
 JFrame jFrameWindow;
 JTextField nameField;
 JPasswordField passwordField;
 	
 public Exercise2Lab14()
 {	
  	jFrameWindow = new JFrame("Authentication");
 	
 	FlowLayout flowLayout = new FlowLayout();
 	jFrameWindow.setLayout(flowLayout);
 	
 	jFrameWindow.setSize(350,150);
 	
 	jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	
 	JLabel nameLabel = new JLabel("Username:"); 
 	jFrameWindow.add(nameLabel);
 	
 	nameField = new JTextField(15);
 	jFrameWindow.add(nameField);
 	
 	JLabel passwordLabel = new JLabel("Password:");
 	jFrameWindow.add(passwordLabel);
 	
 	passwordField = new JPasswordField(15);
 	passwordField.setEchoChar('*');
 	jFrameWindow.add(passwordField);
 	
 	TextFieldEventHandler handler = new TextFieldEventHandler();
   nameField.addActionListener(handler);
   passwordField.addActionListener(handler);
 	
 	jFrameWindow.setVisible(true);	
 	}
 	
 	public static void main(String args[])
 	{
 	 Exercise2Lab14 guiApp = new Exercise2Lab14();	
 	}
 	
 	private class TextFieldEventHandler implements ActionListener
 	{
 	  public void actionPerformed(ActionEvent e)	
 	  {
 	  	String name,password;
 	  	
 	  	name = nameField.getText();
 	  	password = String.valueOf(passwordField.getPassword());
 	  	
 	  	if(e.getSource() == nameField)
 	  	{
 	  		passwordField.requestFocus(true);
 	  	}
 	  	else 
 	  	{	  	
 	  		if(name.equals("Joe Bloggs") && password.equals("123abc"))
 	  	   { 	
 	  	     JOptionPane.showMessageDialog(null,"Welcome to the system " + name,"Authenticated",
 	  	      JOptionPane.INFORMATION_MESSAGE);		
 	    	}	  	
	 	  	else
	 	  	{
	 	  	   JOptionPane.showMessageDialog(null,"Invalid username/password combination","Not authenticated",
	 	  	      JOptionPane.INFORMATION_MESSAGE);	 		
	 	  	} 	  	
 	   } 		
 	}	
  }
 }