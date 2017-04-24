//JTextFieldOnJFrameAlternate.java
/*This program shows how a JTextField object can be created and used as a means of
 *retrieving user input. This program alos introduces event-handling*/
    
 import javax.swing.*;
 import java.awt.event.*;
  import java.awt.FlowLayout;	
   	
  public class JTextFieldOnJFrameAlternate {
    JTextField jTextField;	
  	
  public JTextFieldOnJFrameAlternate()	
  { 
  	JFrame jFrameWindow = new JFrame("Adding a JTextField to a JFrame");
  	
  	FlowLayout flowLayout = new FlowLayout();
  	jFrameWindow.setLayout(flowLayout);
  	
  	jFrameWindow.setSize(350,100);
  	
  	jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  	
  	JLabel jLabel = new JLabel("Please enter your name:"); 	
  	jFrameWindow.add(jLabel);
  	
  	jTextField = new JTextField(15);	
  	jFrameWindow.add(jTextField);
  	
  	TextFieldEventHandler handler = new TextFieldEventHandler();	
  	jTextField.addActionListener(handler);
  	
  	jFrameWindow.setVisible(true); 	
  	}
  	
   public static void main(String args[])
   { 	
   	JTextFieldOnJFrameAlternate guiApp = new JTextFieldOnJFrameAlternate();
   }
   
   private class TextFieldEventHandler implements ActionListener 
   	{  	
   	public void actionPerformed(ActionEvent e)
   	{
   	   String name = jTextField.getText();
   	   	
   	 JOptionPane.showMessageDialog(null,"Your name is " + name,"",JOptionPane.INFORMATION_MESSAGE);	 		
  	}  	
   }
  }   