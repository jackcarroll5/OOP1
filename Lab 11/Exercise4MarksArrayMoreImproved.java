//Exercise4MarksArrayMoreImproved.java
/*This program reads in a list of students' exam marks and determines and displays the
 *average mark. It then uses this to list all marks above the average*/
 
 import javax.swing.JOptionPane;
 
 public class Exercise4MarksArrayMoreImproved{
  public static void main(String args[])
  	{
  	
     int marks[] = new int[10];	
  	  int total = 0, i;
  	  String text, mark;
  	  String names[] = new String[10];
  	   double average;
  	   
  	  for(i = 0; i < marks.length; i++) 
  	  {
  	    mark = JOptionPane.showInputDialog("Enter mark for student " + (i + 1));	
  	  	marks[i] = Integer.parseInt(mark);
  	  	names[i] = JOptionPane.showInputDialog("Enter name of student " + (i + 1));
  	  	total += marks[i];	  	
  	  }
  	   
  	average = (double) total / marks.length;   
  	   
  	JOptionPane.showMessageDialog(null,"The average mark is: " + String.format("%.2f",
  	 average),"Average Mark",JOptionPane.INFORMATION_MESSAGE);   
  	   
  	text = "The following students have marks above the average:\n\n";
  	for(i = 0; i < marks.length; i++)
  	 if(marks[i] > average)
  	   text += names[i] + ",  ";
  	   
  	JOptionPane.showMessageDialog(null,text,
  	 "Above Average Students",JOptionPane.INFORMATION_MESSAGE);      
  	  	
  	}
 }