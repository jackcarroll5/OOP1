//Thermometer.java
/*This file contains a user defined class called Thermometer which is designed 
 *to store the current, maximum and minimum temperatures for a particular day*/

public class Thermometer
{	
  private int maxTemp;
  private int minTemp;	
  private int currentTemp;	
	
 public Thermometer()	
 {
   maxTemp = Integer.MIN_VALUE;	
   minTemp = Integer.MAX_VALUE;	
   currentTemp = 0;	
 }	
	
 public Thermometer(int cTemp)	
 {
   currentTemp = cTemp;
   maxTemp = cTemp;
   minTemp = cTemp;			
 }	
	
 public void setTemperature(int cTemp)
 {
   currentTemp = cTemp;	
   updateMaxMinTemp();	
 }	
	
 private void updateMaxMinTemp() 
 {
   if(currentTemp > maxTemp)	
   maxTemp = currentTemp;
	
   if(currentTemp < minTemp)
   	minTemp = currentTemp;	
 }	
	
 public int getCurrentTemperature()
 {
 	return currentTemp;
 }	
	
 public int getMaxTemperature()
 {
 	return maxTemp;
 }	
	
 public int getMinTemperature()
 {
 	return minTemp;
 }	
	
 public String toString()
 {
  return "Current Temperature: " + currentTemp + "\n" +
  	   	 "Maximum Temperature: " + maxTemp + "\n" +
 	      "Minimum Temperature: " + minTemp + "\n"; 	
 }		
}