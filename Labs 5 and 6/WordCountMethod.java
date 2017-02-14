//WordCountMethod.java
/*This program uses a user-defined method called wordCount() to determine number of 
 *words in a user-supplied string*/
 
 import javax.swing.JOptionPane;
 
 public class WordCountMethod {
  public static void main(String args[])
  {
  
    String text;
    
    text = JOptionPane.showInputDialog("Please enter a piece of text");
    
    JOptionPane.showMessageDialog(null,"\n\nThe number of words in the text you entered is " +
    	                         wordCount(text),"Word Count Results",JOptionPane.PLAIN_MESSAGE);
    	                         
   System.exit(0);
    	                         
  }
  
  public static int wordCount (String text)
  {
  	
    int words = 0;	
  	
  	for(int i = 0; i < text.length(); i++)
  	{
  	
  	if(text.charAt(i) == ' ')
  		words++;	  		
  	}
  	
  	return words + 1;	
  	
  }
 }