//MarksArray.java
/*This program reads in a list of students' exam marks and determines and displays the
 *average mark. It then uses this to list all marks above the average*/
 
 import javax.swing.JOptionPane;
 
 public class MarksArray{
  public static void main(String args[])
  	{
  	
     int marks[] = new int[10];	
  	  int total = 0, i;
  	  String text, mark;
  	   double average;
  	   
  	  for(i = 0; i < marks.length; i++) 
  	  {
  	    mark = JOptionPane.showInputDialog("Enter mark for student " + (i + 1));	
  	  	marks[i] = Integer.parseInt(mark);
  	  	total += marks[i];	  	
  	  }
  	   
  	average = (double) total / marks.length;   
  	   
  	JOptionPane.showMessageDialog(null,"The average mark is: " + String.format("%.2f",
  	 average),"Average Mark",JOptionPane.INFORMATION_MESSAGE);   
  	   
  	text = "List of marks above the average is :\n\n";
  	for(i = 0; i < marks.length; i++)
  	 if(marks[i] > average)
  	   text += marks[i] + " ";
  	   
  	JOptionPane.showMessageDialog(null,text,
  	 "Marks Above Average",JOptionPane.INFORMATION_MESSAGE);      
  	  	
  	}
 }