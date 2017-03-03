//Exercise6Lab7OOP1.java
/*This program will display a square of hashes whose side is inputted by the user where a 
 *user-defined method squareGraphic() will display the hashes*/

import javax.swing.JOptionPane;

public class Exercise6Lab7OOP1 {
 public static void main(String args[])
 {
 	
 int width;	
 String widthAsString,graphic;
 char ch;	
 	
 widthAsString = JOptionPane.showInputDialog("Please enter the width of your square graphic");
 width = Integer.parseInt(widthAsString);
 
 graphic = JOptionPane.showInputDialog("What type of graphics fill do you want in your square graphic?: ");	
 	
 squareGraphic(width,graphic);
 
 System.exit(0);
 		
 }
 
 public static void squareGraphic(int width,String graphic)
 {
 	
 String squareAsString = " ";
 //char ch = ' ';
 
 for(int i = 0; i < width; i++)	
 {
 	
   for (int j = 0; j < width; j++)
   {
   	
     squareAsString += graphic + "    ";

   }
   
  	squareAsString += "\n";
  	
 }	
 
  JOptionPane.showMessageDialog(null,squareAsString,"Square Graphic",JOptionPane.PLAIN_MESSAGE);	
 	
 }
}