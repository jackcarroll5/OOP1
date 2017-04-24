//ArrayMethods.java
/*This program processes an array using methods*/

import java.util.Scanner;

public class ArrayMethods {
 public static void main(String args[])
 {
 
   int marks[] = new int[10];
   readArray(marks);
   displayArray(marks);
   
 }
   
 public static void readArray(int m[])  
 { 	
   Scanner input = new Scanner(System.in);	
 	
 for(int i = 0; i < m.length; i++)	
    {	
       System.out.print("Enter mark for student " + (i + 1) + ": ");	
 	    m[i] = input.nextInt();
    }			
 }
   
   
 public static void displayArray(int m[])    
 {	
    System.out.println("\n\nThe contents of the array is:\n");	
 	
    for(int i = 0; i < m.length; i++)	
 	  System.out.print(m[i] + " ");
 }
}    