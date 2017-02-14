//Exercise3Lab6OOP1.java
/*This program will use user-defined methods to give the user 4 choices for
 *calculations*/
 
 import java.util.Scanner;
 
 public class Exercise3Lab6OOP1 {
  public static void main(String args[])
  {
  	
  int choice,radiusCy,heightCy;	
  float areaCylinder,radiusSemiC,areaSemiC,areaTriangle,heightTri,bLengthTri;
  
  String text = "\n\n\n\t\t1.Find area of cylinder\n\t\t2.Find area of semicircle\n\t\t" +
  	"3.Find area of triangle\n\t\t4.Quit";	
  	
  Scanner input = new Scanner(System.in);
  
  do{
  
  System.out.print(text + "\n\n\n\n\n\n\nEnter your choice: ");
  choice = input.nextInt();
  
  
 while(choice < 1 || choice > 4)
 {
   invalidChoice();
 }	
  	
  	switch(choice){
  	          case 1:
  	                 cylinderArea();
  	                 break;
  	                
  	          case 2: 
  	                 semiCircleArea();
  	                  break;
  	
  	         case 3:
  	                triangleArea();
  	              break;
  	              
  	         case 4:
  	                System.out.println("\n\nThanks for using the system - goodbye! ");
  	
  	}
  	
  	System.out.print("\nPlease hit return to continue ...... ");
  	input.nextLine();
  	input.nextLine();
  	
       }while(choice != 4);
  	
    }
    
    public static void cylinderArea()
    {
    	
    	int radiusCy,heightCy;
    	float areaCylinder;
    	final float PI = 3.14f;
    	Scanner input = new Scanner(System.in);
    	
    	System.out.println("\n");	
    	
    	System.out.print("Please enter the radius of the cylinder: ");
    	radiusCy = input.nextInt();	
    		
       System.out.print("\nPlease enter the height of the cylinder: ");		
       heightCy = input.nextInt();
       
       areaCylinder = PI * (radiusCy * radiusCy) * heightCy;
       
       System.out.println("\nArea of cylinder is " + areaCylinder + "m²");	
    		
    }
    
   public static void semiCircleArea() 
   {
   	
   	float radiusSemiC,areaSemiC;
   	final float PI = 3.14f;
   	Scanner input = new Scanner(System.in);
   	
   	System.out.println("\n");	
   	
   	System.out.print("Please enter the radius of the semicircle: ");
   	radiusSemiC = input.nextFloat();
   	
   areaSemiC = PI * (radiusSemiC * radiusSemiC) / 2;
   		
   System.out.println("\n\nArea of semicircle is " + areaSemiC + "m²");	
   	
   } 
   	
   public static void triangleArea()	
   {
   	
   	float heightTri,bLengthTri,areaTriangle;
    
    Scanner input = new Scanner(System.in);
      
   	System.out.println("\n");	
   		
   	System.out.print("Please enter the base length of the triangle: ");	
   	bLengthTri = input.nextFloat();
   		
   System.out.print("\nPlease enter the height of the triangle: ");	
   	heightTri = input.nextFloat();
   	
   	areaTriangle = (bLengthTri * heightTri) / 2;		
   		
   	System.out.println("\n\nArea of triangle is " + areaTriangle + "m²");
   	
   }	
   	
   	
   public static void invalidChoice()
   {
   	
   	int choice;
   	
   	Scanner input = new Scanner(System.in);
   	
   	
   	System.out.print("Invalid choice -- please choose again\n\n\n\t\t1.Find area of cylinder\n\t\t2.Find area of semicircle\n\t\t" +
  	"3.Find area of triangle\n\t\t4.Quit\n\n\n\n\n\n\nEnter your choice: ");
   	choice = input.nextInt();
   		
     }   	 
  }