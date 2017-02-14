//LottoDraw.java
/*This program uses a pre-defined method from the Math class called random() to
 *emulate the Lotto draw by generating 7 random numbers between 1 and 42 inclusive*/
 
 import javax.swing.JOptionPane;
 
 public class LottoDraw {
   public static void main(String args[])
   {
   
      int lottoNum;
      String numbers = " ";
 
     for(int i = 1; i <= 7; i++)
     {
     	
         lottoNum = (int)(Math.random() * 42 + 1);
         numbers += lottoNum + " ";	
     	
     }
 
     JOptionPane.showMessageDialog(null,"The lotto numbers are:\n" + numbers,"Lotto Draw",
       JOptionPane.PLAIN_MESSAGE);
       
       System.exit(0);
 
   }
 }