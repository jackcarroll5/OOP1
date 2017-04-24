//Exercise4Lab14.java
/*This program will create a JFrame that will convert an amount in pounds to kilos
 *which will use validation in this GUI*/
 
 import java.awt.*;
 import javax.swing.*;
 import java.awt.event.*;
 
 public class Exercise4Lab14
 {
 	
  JTextField poundsField,kilosField;	
  JFrame jFrameWindow;
  JButton converter;	
 	
   public Exercise4Lab14()
   {
   	
   	jFrameWindow = new JFrame("Weight Converter");
   	
   	FlowLayout flowLayout = new FlowLayout();
   	jFrameWindow.setLayout(flowLayout); 
   	
   	jFrameWindow.setSize(400,150);
   	
   	jFrameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	
   	JLabel poundLabel = new JLabel("Pounds:");
   	jFrameWindow.add(poundLabel);
   	
   	 poundsField = new JTextField(15);
   	jFrameWindow.add(poundsField);
   	
   	JLabel kiloLabel = new JLabel("Kilos:");
   	jFrameWindow.add(kiloLabel);
   	
   	kilosField = new JTextField(15);
   	jFrameWindow.add(kilosField);
   	
   	converter = new JButton("Convert");
   	jFrameWindow.add(converter);
   	
   	ButtonEventHandler handler = new ButtonEventHandler();
   	converter.addActionListener(handler);
   	
   	jFrameWindow.setVisible(true);   		
   }	
 	
 public static void main(String args[])
 {
  Exercise4Lab14 guiApp = new Exercise4Lab14();	
 }
 	
 private class ButtonEventHandler implements ActionListener
 {
   public void actionPerformed(ActionEvent e)	
   {
   	float kilos,pounds,kiloConvert,poundConvert;
   	String kilosAsString,poundsAsString;
   	
    poundsAsString = poundsField.getText();	
   	kilosAsString = kilosField.getText();
   	
   	if(poundsAsString.equals("") && kilosAsString.equals("") ||
   	   (!poundsAsString.equals("") && !kilosAsString.equals("")))
   	   {	   
    	JOptionPane.showMessageDialog(null,"You must enter a value into one field and one field only",
        "Error",JOptionPane.ERROR_MESSAGE);
       }      
   else 
   { 	  
   if(!poundsAsString.equals(""))
     {
     	pounds = Float.parseFloat(poundsAsString);
     	poundConvert = pounds / 2.2f;
   	    kilosField.setText(String.format("%.4f",poundConvert));   	
     }
     
     else
     {
     	kilos = Float.parseFloat(kilosAsString); 
     	 kiloConvert = kilos * 2.2f;	
     	poundsField.setText(String.format("%.4f",kiloConvert)); 	
     }  
    }
   }		
  }			
 }