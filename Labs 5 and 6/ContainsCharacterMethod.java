//ContainsCharacterMethod.java
/*This program uses a user-defined method called containsCharacter() to determine whether a
 *string contains a given character*/
 
 import javax.swing.JOptionPane;
 	
 public class ContainsCharacterMethod {
   public static void main(String args[])
   {
   	 String text,charAsString;
   	  char ch;
   	
   text = JOptionPane.showInputDialog("Please enter a piece of text");	
   	
   charAsString = JOptionPane.showInputDialog("Please enter a keyboard character");	
   	ch = charAsString.charAt(0);
   	
   	if(containsCharacter(text,ch))
   	JOptionPane.showMessageDialog(null,"The text you entered contained the character " + ch,
   	                             "Character Tester",JOptionPane.INFORMATION_MESSAGE);
   else
   		JOptionPane.showMessageDialog(null,"The text you entered does not contain the character " + ch,
   	                             "Character Tester",JOptionPane.INFORMATION_MESSAGE);
   	                             
   	System.exit(0);
   }
   
   public static boolean containsCharacter(String s, char c)
   {
   	
   	boolean result = false;
   	
   	for(int i = 0; i < s.length(); i++)
   		
   		if(s.charAt(i) == c)
   		{
   			result = true;
   			break;
   		}
   		
   		return result;
   			
   }
 }
   
   
   
   
   
   
   