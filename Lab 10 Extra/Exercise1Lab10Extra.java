//Exercise1Lab10Extra.java
/*This program will read in the username and password combination for
 *5 people using a for loop which will be perfectly validated*/
 
 import javax.swing.JOptionPane;
 
 public class Exercise1Lab10Extra {
   public static void main(String args[])
   {
   	
   String username,password,validUsernamePasswordCombos = "";
   boolean valid = false;
   int digits = 0,j;	
   	
   	for(int i = 1; i <= 5; i++)
   	{	
    username = JOptionPane.showInputDialog("Please enter the username of person " + i); 	
   	password = JOptionPane.showInputDialog("Please enter the password of person " + i);
   	
     while(!valid)
     {
     	if(password.length() >= 8 && password.length() <= 15)
     	{
      		
	     	for(j = 0; j < password.length(); j++)
	     	{
	     		if(password.charAt(j) >= 'A' && password.charAt(j) <= 'Z' ||
	         	   password.charAt(j) >= 'a' && password.charAt(j) <= 'z' ||
	         		password.charAt(j) >= '0' && password.charAt(j) <= '9')
	         		{
	         			
	         		}
	         	else
	         		break;
	     		 
	     		 if(Character.isDigit(password.charAt(j)))     	       
	     	       digits++;
	     	}
	     		
	     		if(j == password.length())
	     		{  		
	     			if(digits >= 3){
	     	            valid = true;	
	     			}
	     		    else  			
	     			password = JOptionPane.showInputDialog("Password must contain at least 3 digits! Please re-enter the password of person " + i);
	     		}	   
	     		else
	     		 	password = JOptionPane.showInputDialog("Password must only contain letters and digits! Please re-enter the password of person " + i);		     	
	    }	    	
     	else 
     		password = JOptionPane.showInputDialog("Invalid password length!Please re-enter the password of person " + i);
     		
     	digits=0; 
     			   		
     }	
     	 	
           validUsernamePasswordCombos += username + "      "  + password + "\n";
   	       //validPWord += password + "\n";	    	
     	 	
     }
  	 	
   	JOptionPane.showMessageDialog(null,"The valid username/password combinations are:\n\n "
   		+ validUsernamePasswordCombos,"Valid Combinations",JOptionPane.INFORMATION_MESSAGE);
    
   		System.exit(0);
    
   } 
  }