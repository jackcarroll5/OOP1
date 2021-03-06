//Exercise1RainfallArrayImproved.java
/*This program creates an array of rainfall values and determines some statistical
 *infromation based on it*/
 
 import javax.swing.JOptionPane;
 import java.awt.Font;
 import javax.swing.JTextArea;
 
 public class Exercise1RainfallArrayImproved {
   public static void main(String args[])
   {
      int rainfall[] = {7, 12, 10, 4, 5, 3, 1, 4, 3, 7, 8, 10};
      int month = 0,i,janToJuneRainfall = 0, winterRainfall, springRainfall;
      String text = "", monthAsString;
      
      Font textAreaFont = new Font("monospaced",Font.PLAIN,12);
      JTextArea textArea = new JTextArea(14,20);
      
      textArea.setFont(textAreaFont);
      
      text += String.format("%-10s%-10s\n","Month","Rainfall");
      
      for(i = 0; i < rainfall.length; i++)
      text += String.format("%-10d%-10d\n",(i + 1), rainfall[i]);
      
      textArea.append(text);
      
      JOptionPane.showMessageDialog(null,textArea,"Rainfall Stats",JOptionPane.PLAIN_MESSAGE);
      
      monthAsString = JOptionPane.showInputDialog("Please enter a month number" +
      	" (1-12) ");
      	
      month = Integer.parseInt(monthAsString);
      	
       while(month < 0 || month > 12)
       {
       
	      monthAsString = JOptionPane.showInputDialog("Invalid! The month " +
	      	"must be between 1 and 12. Please enter a month number" +
	      	" (1-12) ");
	      		
	      month = Integer.parseInt(monthAsString);
       }
              
     JOptionPane.showMessageDialog(null,"Rainfall for this month is : " + 
     	rainfall[month - 1] + "mm","Rainfall Stats",JOptionPane.PLAIN_MESSAGE); 
      
     winterRainfall = rainfall[0] + rainfall[10] + rainfall[11];
      
     JOptionPane.showMessageDialog(null,"Total rainfall for the winter months is : " + 
     	winterRainfall + "mm","Rainfall Stats",JOptionPane.PLAIN_MESSAGE);
     		
     for(i = 0; i <= 5; i++)		 
      janToJuneRainfall += rainfall[i];
      
     JOptionPane.showMessageDialog(null,"Total rainfall from January to June is : " + 
     	janToJuneRainfall + "mm","Rainfall Stats",JOptionPane.PLAIN_MESSAGE);
     	
     	springRainfall = rainfall[1] + rainfall[2] + rainfall[3];
     	
     	JOptionPane.showMessageDialog(null,"Total rainfall for the spring months is : " + 
     	springRainfall + "mm","Rainfall Stats",JOptionPane.PLAIN_MESSAGE);
     	
     	System.exit(0);
           
   }
 }