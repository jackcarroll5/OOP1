//Exercise1Lab12.java
/*This program will use an array of heights which will store 10 heights of students and will
 *have 5 user-defined methods*/
 
 import javax.swing.JOptionPane;
 
 public class Exercise1Lab12 {
   public static void main(String args[])
   {
   	
   	float heights[] = new float[10];
   	int i;
   	readArray(heights);
   	
   	JOptionPane.showMessageDialog(null,"Average height: " + averageHeight(heights) +
   	 "m\nSmallest height: " + smallestH(heights) + "m\nTallest height: " + 
   	 tallestH(heights) + "m","Height Stats",JOptionPane.INFORMATION_MESSAGE);
   	   	
   	over1Point7(heights);
   	
   }
   
   public static void readArray(float heights[])
   {
   	 String heightAsString;
   	 	 
   	 for(int i = 0; i < heights.length; i++)
   	 {
   	   heightAsString = JOptionPane.showInputDialog("Enter height for student " + (i + 1) + ":");
   	   heights[i] = Float.parseFloat(heightAsString);	 	
   	 } 	
   }
   
  public static float averageHeight(float heights[])
  {
   float total = 0,average;
   int i;	
    
    for(i = 0; i < heights.length; i++)
   	 {	
        total += heights[i];
   	 }
   
   average = total/10;
   
   return average; 	
  } 
  	
  public static float smallestH(float heights[])
  {
  	int i;
    float shortestHeight = heights[0];	
  	
  	for(i = 1; i < heights.length; i++)
   	 {	
  	   if(heights[i] < shortestHeight)
  	      shortestHeight = heights[i];
   	 } 	 
   	 return shortestHeight;
  } 
  	
  public static float tallestH(float heights[])
  {
  	int i;
  	float biggestHeight = heights[0];
  	
  	for(i = 1; i < heights.length; i++)
   	 {	
    if(heights[i] > biggestHeight)
  	 biggestHeight = heights[i];
   	 }	 
  	return  biggestHeight;   	
  }	
  	
  public static void over1Point7(float heights[])
   {
  	
   String heightOver1_7="";
   int i;
  //String text;
  	 	
  for(i = 0; i < heights.length; i++)
   	if(heights[i] > 1.7f)
        heightOver1_7 += heights[i] + " ";
   
   //text += heights[i] + " "; 
   
   JOptionPane.showMessageDialog(null,"The list of heights over 1.7m is:\n" + 
   	heightOver1_7,"Heights over 1.7m",JOptionPane.INFORMATION_MESSAGE);	
   
  }
 }