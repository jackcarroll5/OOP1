//TestProgThermometer.java
/*This program contains the main() to test out the functionality of our
 *Thermometer class*/
 
 import java.util.*;
 
 public class TestProgThermometer
 {
   public static void main(String args[])
   {
   	 int temp;
 	
 	Scanner input = new Scanner(System.in);
 	
    System.out.println("Calling the single-argument constructor....." +
    "Setting the temperature of first thermometer to 35C");
    
    Thermometer firstThermometer = new Thermometer(35);	
 	
 	System.out.println("First thermometer: \n" + firstThermometer);
 	
 	System.out.println("Calling the no-argument constructor....." +
    "Setting the temperature of second thermometer to 0C");
    
     Thermometer secondThermometer = new Thermometer();	
    
    System.out.println("Second thermometer: \n" + secondThermometer);
    
   	System.out.println("Calling setTemperature()....." +
    "Setting the temperature of second thermometer to 25C"); 
    	
    secondThermometer.setTemperature(25);
    
    System.out.println("Second thermometer: \n" + secondThermometer);
    
    System.out.print("Please enter the current temperature: ");  
    temp = input.nextInt();
    
    System.out.println();
    
    System.out.println("Calling setTemperature()....." +
    "Setting the temperature of first thermometer to " + temp + "C");
    
    firstThermometer.setTemperature(temp); 
    
 	System.out.println("First thermometer: \n" + firstThermometer);
  }
 }