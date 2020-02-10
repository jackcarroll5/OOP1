//OOP1CA15Q1.java
/**/

import javax.swing.JOptionPane;

public class OOP1CA15Q1
{
 public static void main(String args[])	
  {
    String res,freq;
	
  res = JOptionPane.showInputDialog("Please enter the resistivity of the conductor");	
  freq = JOptionPane.showInputDialog("Please enter the frequency of the current that flows through the conductor");	
	
  JOptionPane.showMessageDialog(null,"The skin depth here is " + String.format("%.3f",skinDepthCalculator(res,freq)) + " micrometres","Skin Depth",
  JOptionPane.INFORMATION_MESSAGE);	
  	
  	System.exit(0);	
 }	
 	
 public static double skinDepthCalculator(String p, String f)
 {
 	final double u = 0.023;
 	double r,fr;
 	
 	r = Double.parseDouble(p);
 	fr = Double.parseDouble(f);
 	
   return 1000000 * (Math.sqrt(r / (Math.PI * fr * u)));	
 }		
}