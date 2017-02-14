//Exercise1OOP1Lab3.java
/**/

import javax.swing.JOptionPane;

public class Exercise1OOP1Lab3 {
 public static void main(String args[])
 {
 
 String choice; 
float side1, side2, side3, area, radius, height, volume,s;
 final float PI = 3.142f;
 String side1AsString,side2AsString,side3AsString,radiusAsString,heightAsString;
 
 choice = JOptionPane.showInputDialog("1.Calculate the area of a triangle\n2. Calculate the volume of a cone " +
 	        "\n3.Quit\n\n\n\nPlease enter your choice(1-3): "); 
 	        		        	
 
 switch(choice)
 {
 	
   case "1":
            side1AsString = JOptionPane.showInputDialog("Please enter the length of the first side: ");
            side1 = Float.parseFloat(side1AsString);
             side2AsString = JOptionPane.showInputDialog("Please enter the length of the second side: ");
               side2 = Float.parseFloat(side2AsString);
              side3AsString = JOptionPane.showInputDialog("Please enter the length of the third side: ");
               side3 = Float.parseFloat(side3AsString);
               
              s = (side1 + side2 + side3) / 2;
              
              JOptionPane.showMessageDialog(null,"The area of the triangle is " + String.format("%.3f",Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)))) +
              	   " metres squared ");
                                                                                 
    break;
    
    case "2":
             radiusAsString = JOptionPane.showInputDialog("Please enter the radius of the cone: ");
             radius = Float.parseFloat(radiusAsString);
            heightAsString = JOptionPane.showInputDialog("Please enter the height of the cone: ");
            height = Float.parseFloat(heightAsString);
    
    JOptionPane.showMessageDialog(null,"The volume of the cone is " + String.format("%.3f",1/3f * PI * (radius * radius) * height) + " metres cubed ");
      
    break;
    
    case "3":
               JOptionPane.showMessageDialog(null,"Thanks for using the system. Goodbye!");
               
               break;
    
    default:
    	     if(!choice.equals(1) || !choice.equals(3))
    JOptionPane.showMessageDialog(null,"Sorry - you have entered an invalid choice - must be between 1 and 3");
    
 }
 
 
    
    System.exit(0); 
    
      }
 }