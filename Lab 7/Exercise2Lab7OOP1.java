//Exercise2Lab7OOP1.java
/*This program will use auser-defined method called numberDaysIn() to switch the month
 *number to the number of days in that month*/
 
 import javax.swing.JOptionPane;
 
 public class Exercise2Lab7OOP1 {
  public static void main(String args[])
  {
  	
  int monthNum,result;
  String numAsString;
  	
  	
  numAsString = JOptionPane.showInputDialog("Please enter the number of a month(1-12) ");	
  monthNum = Integer.parseInt(numAsString);
  
  result = numberDaysIn(monthNum);
  
   if(numberDaysIn(monthNum) != 0)
   JOptionPane.showMessageDialog(null,"There are " + result + " days in this month","Message",
   JOptionPane.INFORMATION_MESSAGE);
    else
    JOptionPane.showMessageDialog(null,"Invalid - you must enter a month between 1 and 12!","Message",
   JOptionPane.INFORMATION_MESSAGE);
  
  System.exit(0);
  
  }
  
  public static int numberDaysIn(int monthNum)
  {
  	
  	switch(monthNum)
  {
  	
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
       return 31;
    
    case 2:   
        return 28;
        
    case 4:
    case 6:
    case 9:
   	case 11:
   		     return 30;
   		
   default:
 		   return 0;
  		
  }
  	
  	
  	
  }
   
 }