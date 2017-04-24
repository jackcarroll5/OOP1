//Exercise2Lab12.java
/*This program will create 3 parallel arrays which will have a linear search method and 
 *display details about a student.*/
 
 import javax.swing.JOptionPane;
 import java.awt.Font;
 import javax.swing.JTextArea;
 
 public class Exercise2Lab12 {
   public static void main(String args[])
   {
   	
   	int studentID[] = new int[2];
   	float height[] = new float[2];
   	String grade[] = new String[2];
   	int subscript,searchName;	
   	String searchNameAsString;
   	   	
   	populateArrays(studentID,height,grade);
   	
   	displayTable(studentID,height,grade);
   	
   	searchNameAsString = JOptionPane.showInputDialog("Please enter the ID number of the students you seek");
   	searchName = Integer.parseInt(searchNameAsString);
   	
    subscript = linearSearch(studentID,searchName);
    
    if(subscript != 1)
    JOptionPane.showMessageDialog(null,"The details of the student are as follows:\n" +
    "ID number .......... " + searchName + "\nHeight  .......... " + height[subscript] + 
    "\nAverage Grade ...... " + grade[subscript],"Student Details",JOptionPane.INFORMATION_MESSAGE);
    else
     JOptionPane.showMessageDialog(null,"Sorry - the student details you're looking for has not " +
     "been found","Student Details",JOptionPane.INFORMATION_MESSAGE);		
   }
   
  public static void populateArrays(int studentID[],float height[],String grade[])
    {
 	 int i;
 	 String idAsString = "",heightAsString = "";
 	
 	JOptionPane.showMessageDialog(null,"Please enter the details of the student ID,height and " +
 	 "average grade of " + studentID.length + " students","Inputting the Details",JOptionPane.INFORMATION_MESSAGE);
 	 
 	 for(i = 0; i < studentID.length; i++) 
 	 {
 	 
 	 	idAsString = JOptionPane.showInputDialog("Please enter the ID of student " + (i + 1));	
 	 	studentID[i] = Integer.parseInt(idAsString);
 	 	heightAsString = JOptionPane.showInputDialog("Please enter the height of student " + (i + 1));
 	 	height[i] = Float.parseFloat(heightAsString);
 	 	grade[i] = JOptionPane.showInputDialog("Please enter the average grade of student " + (i + 1));
 	   }
    } 
    	
   public static void displayTable(int studentID[],float height[],String grade[])
   {
   	String text = "";
   	
   	Font txtAreaFont = new Font("monospaced",Font.PLAIN,12);
   	JTextArea txtArea = new JTextArea(14,20);
   	
   	txtArea.setFont(txtAreaFont);  
   	
    text += String.format("%-12s%-10s%-10s\n","Student ID","Height","Average Grade",
    "\n----------   -------   -------------");
    	
    int i;
   
    for(i = 0; i < studentID.length; i++)
    	text += String.format("%-12d%-10.2f%-10s\n",	studentID[i],	height[i],		grade[i]);
    	
    txtArea.append(text);
    
    JOptionPane.showMessageDialog(null,txtArea,"Student Details",JOptionPane.INFORMATION_MESSAGE);
     		
   }
   
   public static int linearSearch(int studentID[], int key)
   {   	
   int i;
   
   for(i = 0; i < studentID.length; i++)
   if(studentID[i] == key)	
    return i;	
   	
    return -1; 	  	
   }  
 }