//Exercise5Lab2OOP1.java
/*This program will read in 5 words by using a for loop*/

import java.util.Scanner;

public class Exercise5Lab2OOP1 {
  public static void main(String args[])
  {
  
String word, longest = " ";
int totalVowels = 0,totalLetters = 0;
char ch;

Scanner input = new Scanner(System.in);

for(int i = 1; i <= 5; i++)
{

System.out.print("Please enter word " + (i) + ":");
word = input.nextLine();

word.toLowerCase();

for(int count = 0; count < word.length(); count++)
{
	
	ch = word.charAt(count);
	
if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')	
   totalVowels++;   
	
	}
						
		if(word.length() > longest.length())	
	   longest = word;	
	   	
	  totalLetters += word.length();
	   			
}

  System.out.println("\n\n\nThe average number of vowels per word: " + String.format("%.2f",totalVowels/5f) +
             "\nThe average number of consonants per word: " + String.format("%.2f",(totalLetters-totalVowels)/5f) +
             	"\nThe longest word: " + longest);

  }
}