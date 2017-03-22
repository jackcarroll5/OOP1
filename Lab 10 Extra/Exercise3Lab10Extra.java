//Exercise3Lab10Extra.java
/*This program will enable a user to type in a landline number which will be perfectly validated
 *for a number from Kerry,Limerick and Cork*/
 
 import javax.swing.JOptionPane;
 
 public class Exercise3Lab10Extra {
   public static void main(String args[])
   {
   	
   	String phoneNo,validPhoneNos = "";
   	int i,j;
   	boolean valid = false;
   	
   	for(i = 1; i <= 5; i++)
   	{
   		phoneNo = JOptionPane.showInputDialog("Loop " + i + "-Please enter phone number");
   		
   	 while(!valid)	
   	 {  		
   		if(phoneNo.length() == 12)
   		{
   		  if(phoneNo.startsWith("(0"))	
   		  {
   		    if(phoneNo.charAt(2) == '2' || phoneNo.charAt(2) == '6' )
   		    {
   			  if(phoneNo.charAt(3) >= '1' || phoneNo.charAt(3) <= '9' )
   		      {
   			    if(phoneNo.charAt(4) == ')')
   			    {
   			
   			      for(j = 5; j < 12; j++)
   			  if(!Character.isDigit(phoneNo.charAt(j)))
   			        break;
   		     
   		     if(j == 12)
   		     valid = true;
   		     	else
   		           JOptionPane.showMessageDialog(null,"Invalid! The last 7 characters must all be digits. Please re-enter");
   		           
   		      }
   		       else
   		          JOptionPane.showMessageDialog(null,"Invalid! 5th character must be ). Please re-enter");
   		          
   		    }
   		      else
   		         JOptionPane.showMessageDialog(null,"Invalid! 4th character must be in the range 1 to 9. Please re-enter");
   		         
   		    }	
   		     else
   		         JOptionPane.showMessageDialog(null,"Invalid! 3rd character must be 2 or 6. Please re-enter");
   		  }
   	    	else
   		    JOptionPane.showMessageDialog(null,"Invalid! Must begin with (0. Please re-enter");	
   		
   		}
   		 else
   			 JOptionPane.showMessageDialog(null,"Invalid! Must have exactly 12 characters. Please re-enter");	
   		
   	 }
   	 validPhoneNos += phoneNo + "\n";	
   	}
   	
   	JOptionPane.showMessageDialog(null,"The list of valid phone numbers is:\n\n " + validPhoneNos,
   	"Valid Phone Numbers",JOptionPane.INFORMATION_MESSAGE);
   	  	
   	System.exit(0);
   }
 } 