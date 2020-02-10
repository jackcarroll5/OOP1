//OOP1Q214.java
/**/

import javax.swing.JOptionPane;

public class OOP1Q214
{
  public static void main(String args[])	
  {
   String no,validNos = ""; 
   double number = 0;
   int noDots = 0, j;
   boolean valid = false;	
	
   for(int i = 1; i <= 5; i++)	
   {
   	no = JOptionPane.showInputDialog("Loop " + i + "- Please enter any number");
    
    while(!valid)
    {
     if(!no.equals("") && Character.isDigit(no.charAt(0)) ||
     	no.charAt(0) == '.')
     {
     	if(no.charAt(0) == '.')
     		noDots++;
     	
      for(j = 1; j < no.length(); j++)	
      if(!Character.isDigit(no.charAt(j)) && no.charAt(j) != '.' || 
      	noDots > 1)
          break;
     else if(no.charAt(j) == '.')
     noDots++;
     
     if(j == no.length() && noDots <= 1 && !no.equals("."))
     { 
       number = Double.parseDouble(no);
     
      if(number >= -Float.MAX_VALUE && number <= Float.MAX_VALUE)
          valid = true;
          else
         no = JOptionPane.showInputDialog("Invalid! Please re-enter any number");
       }
      else
      	  no = JOptionPane.showInputDialog("Invalid! Please re-enter any number");	
          noDots = 0;
      }
      else
      	  no = JOptionPane.showInputDialog("Invalid! Please re-enter any number");	
    }		
    validNos += no + "  ";	
	}
   JOptionPane.showMessageDialog(null,"The valid numbers are: " + validNos,"Valid Numbers",
   JOptionPane.INFORMATION_MESSAGE); 
   	
   	System.exit(0); 	
  }
}