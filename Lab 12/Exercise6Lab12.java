//Exercise6Lab12.java
/*This program will generate 7 random numbers through using an array*/

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Exercise6Lab12 {
 public static void main(String args[])
 {
 	int lottoNos[] = new int[7];
 	boolean alreadyPicked[] = new boolean[43];
 	int lottoNum;
 	 
 	 /*for(int i = 0; i < alreadyPicked.length; i++)
 	 	alreadyPicked[i] = true;*/
 	
    for(int i = 0; i < 7; i++)	
    {	  
    	lottoNum = (int)(Math.random() * 42 + 1);
 		while(alreadyPicked[lottoNum])
     	{
            	lottoNum = (int)(Math.random() * 42 + 1);
            	//alreadyPicked[lottoNum] = true; 
     	}     
     alreadyPicked[lottoNum] = true;                 
 	 lottoNos[i] =  lottoNum;
 	 	
   }
  Arrays.sort(lottoNos);
  
  JOptionPane.showMessageDialog(null,"The lotto numbers are:\n\n" + Arrays.toString(lottoNos),"Lotto Numbers",
       JOptionPane.INFORMATION_MESSAGE);
       
  System.exit(0);      
   
 }
}