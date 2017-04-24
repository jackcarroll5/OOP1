//Exercise1Lab14.java
/*This program shows how a JTextField object can be created and used as a means of
 *retrieving user input. This program alos introduces event-handling*/
    
 import javax.swing.*;
 import java.awt.event.*;
  import java.awt.FlowLayout;
  import java.awt.Color;	
   	
  public class Exercise1Lab14 {
    JTextField jTextField;	
  	
  public Exercise1Lab14()	
  { 
  	JFrame jFrameWindow = new JFrame("Adding a JTextField to a JFrame");
  	
  	FlowLayout flowLayout = new FlowLayout();
  	jFrameWindow.setLayout(flowLayout);
  	
  	jFrameWindow.setSize(350,100);
  	
  	jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  	
  	JLabel jLabel = new JLabel("Please enter your address:"); 	
  	jFrameWindow.add(jLabel);
  	
  	jTextField = new JTextField(15);
  	jTextField.setForeground(Color.GREEN);	
  	jFrameWindow.add(jTextField);
  	
  	TextFieldEventHandler handler = new TextFieldEventHandler();	
  	jTextField.addActionListener(handler);
  	
  	jFrameWindow.setVisible(true); 	
  	}
  	
   public static void main(String args[])
   { 	
   	Exercise1Lab14 guiApp = new Exercise1Lab14();
   }
   
   private class TextFieldEventHandler implements ActionListener 
   	{  	
   	public void actionPerformed(ActionEvent e)
   	{
   	   String address = jTextField.getText();
   	   	
   	 JOptionPane.showMessageDialog(null,"Your address is " + address,"",JOptionPane.INFORMATION_MESSAGE);	 		
  	}  	
   }
  }   