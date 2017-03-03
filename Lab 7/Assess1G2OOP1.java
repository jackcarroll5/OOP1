//Assess1G2OOP1.java
/**/

import javax.swing.JOptionPane;

public class Assess1G2OOP1{
  public static void main(String args[])
  {
  
  float initSpeed,maxDistance = 0;
  String floatSpeedAsString,text = " ";
  int maxAngle = 0;
  
  floatSpeedAsString = JOptionPane.showInputDialog("Please enter the initial speed of the projectile");
  initSpeed = Float.parseFloat(floatSpeedAsString);
  
  text = "Angle   Distance\n------      --------\n\n";
  
  for(int i = 0; i <= 90; i+=5)//angles
   {	
  	
     text +=  i + "        " + String.format("%.2f\n",projectileDistance(initSpeed,i));
        
      if(maxDistance < projectileDistance(initSpeed,i))
      {
     	maxDistance = (float) projectileDistance(initSpeed,i); 		
        maxAngle = i;
      }  	
   }
   
   JOptionPane.showMessageDialog(null,text + "\n\n\n\nMaximum distance traveled is " + String.format("%.2f",maxDistance) + "m which occurs at an angle of " + maxAngle,
   	"Results",JOptionPane.INFORMATION_MESSAGE);
  
  System.exit(0);
  
  }
  
  public static double projectileDistance(float initSpeed,int angles)
  {
  	
  	double distance;
  	double radians;
  	
    radians =  Math.toRadians(angles);	
   distance = (2 * (initSpeed * initSpeed) * Math.sin(radians) * Math.cos(radians) / 9.81);
  			
   return distance;	
  	  	 	
  }
}