//Exercise4OOP1.java
/*This program will supply values for the tube radius, the cross-sectional radius and the 
 *mass of a torus along with the moments of inertia*/

import java.util.Scanner;

public class Exercise4OOP1 {
  public static void main(String args[])
   {
 
 float tubeR,crossSecR,mass,inertiaDia,inertiaVer;
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("Please enter the tube radius of the torus: ");
  tubeR = input.nextFloat();
  
  System.out.print("Please enter the cross-sectional radius of the torus: ");
  crossSecR = input.nextFloat();
  
  System.out.print("Please enter the mass of the torus: ");
 mass = input.nextFloat();
  
  System.out.println("\n\n=======Results=======\n\nMoment of inertia about a diameter is : " + 
  	String.format("%.3f",1/8f * (4 *(tubeR * tubeR) + 5 * (crossSecR * crossSecR)) * mass) + "kg sq m" + "\nMoment of " +
  	"inertia about a vertical axis is : " + String.format("%.3f",tubeR * tubeR * mass + 3/4f *(crossSecR * crossSecR) * mass) +
  	"kg sq m");
  	
   }
}