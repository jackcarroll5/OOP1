//Exercise1Lab8OOP1.java
/*This program will ask a student for his or her t-number and will check if the 
 *number has exactly 8 digits.*/
 
 import javax.swing.JOptionPane;
 
 public class Exercise1Lab8OOP1 {
    public static void main(String args[])
    {
    	
     String tNo,validTNo = "",digits = " ";
     int i, j=0;
     boolean valid = false; //I'm assuming the user input will be bad
    		
  
   
              do{ 
              	
              	 if(j==0)
              	      tNo = JOptionPane.showInputDialog("Please enter a t-number(return to exit)");
              	 else
              	 	  tNo = JOptionPane.showInputDialog("Please enter another t-number(return to exit)");
              	   
                 while(!valid && !tNo.equals("")) //you always get into the validation loop
                 {

                 			if(tNo.charAt(0) == 'T' || tNo.charAt(0) == 't')
				     	    {
				     		
						       if(tNo.length() == 9)
						       {  
						       	   for(i=1;i<9;i++)
						       	   {
						       	   	  if(!Character.isDigit(tNo.charAt(i)))
						       	   	  	break;   //tk9878657
						       	   } 
						       	   
						       	   if(i==9)
						       	   {
						       	   	  valid = true;
						       	   	  j++;
						       	   	  System.out.println("Value of j is " + j);
                                      validTNo += tNo + "\n"; 
						       	   	  
						       	   }
						       	   else	
						       	   	 	
						       	      tNo = JOptionPane.showInputDialog("Invalid! Please re-enter t-number(return to exit)");  	  	
						       }	
						      else
						          tNo = JOptionPane.showInputDialog("Invalid! Please re-enter t-number(return to exit)");
				     	    }
						  else
                                tNo = JOptionPane.showInputDialog("Invalid! Please re-enter t-number(return to exit)"); 
                                	
                           	
                 }//validation loop finishes here
     
                 valid = false; //vital for the next iteration
                
                 	
              }while(!tNo.equals("")); 
              
                	
               if(!validTNo.equals(""))
                {
                   
                 JOptionPane.showMessageDialog(null,"Number of valid t-numbers entered: " + j + 
     	         "\nList of valid t-numbers:\n\n" + validTNo,"Valid T-Numbers",JOptionPane.INFORMATION_MESSAGE);
                }
               else
     	         JOptionPane.showMessageDialog(null,"You entered no valid t-numbers!","Valid T-Numbers",
     	         JOptionPane.INFORMATION_MESSAGE);
     	  

     	  
     	   System.exit(0);
    	
    }	
 }