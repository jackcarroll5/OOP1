//LottoDrawImproved.java
/*This program uses a pre-defined method from the Math class called random() to
 *emulate the Lotto draw by generating 7 random numbers between 1 and 42 inclusive*/
 
 import javax.swing.JOptionPane;
 
 public class LottoDrawImproved {
   public static void main(String args[])
   {
   
      int lottoNum = 0,num1 = 0,num2 = 0, num3 = 0,num4 = 0,num5 = 0,num6 = 0,num7 = 43;
      String numbers = " ";
 
     for(int i = 1; i <= 7; i++)
     {
     	while(lottoNum == num1 || lottoNum == num2 || lottoNum == num3 || 
     		lottoNum == num4 || lottoNum == num5 || lottoNum == num6 || lottoNum == num7)
     	{
               lottoNum = (int)(Math.random() * 42 + 1);
     	}     
               
         numbers += lottoNum + " ";
         
         if(i==1)
         	num1 = lottoNum;
         else if(i==2)
         	num2 = lottoNum;
         else if(i==3)
     	num3 = lottoNum;
     	else if(i==4)
     	num4 = lottoNum;
     	else if(i==5)
     	num5 = lottoNum;    	
     	else if(i==6)
     	num6 = lottoNum;
     	else if(i==7)
     	num7 = lottoNum;
     	
     }
 
     JOptionPane.showMessageDialog(null,"The lotto numbers are:\n" + numbers,"Lotto Draw",
       JOptionPane.PLAIN_MESSAGE);
       
       System.exit(0);
 
   }
 }