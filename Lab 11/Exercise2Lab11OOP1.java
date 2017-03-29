//Exercise2Lab11OOP1.java
/*This program will take in the heights of 10 people by using an array.*/

import javax.swing.JOptionPane;

public class Exercise2Lab11OOP1 {
 public static void main(String args[])
 {
 
  String heightAsString;
  int i, heightOver1Point8 = 0,heightUnder1Point6 = 0;
  float heights[] = new float[10];
  for(i = 0; i < 10; i++)
  {
  	
   heightAsString = JOptionPane.showInputDialog("Please enter the height of person " + (i + 1));
  	heights[i] = Float.parseFloat(heightAsString);
  	
  if(heights[i] > 1.8f)
  heightOver1Point8++;	
  	
  if(heights[i] < 1.6f)
  	heightUnder1Point6++;	
  }

  JOptionPane.showMessageDialog(null,"The total number of people over 1.8m is " + heightOver1Point8 +
  	"\nThe total number of people under 1.6m is " + heightUnder1Point6,"Height Notes",JOptionPane.INFORMATION_MESSAGE);
 
  System.exit(0);
 }
}