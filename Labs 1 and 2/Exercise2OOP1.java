//Exercise2OOP1.java
/*This program will prompt for and read in the details of investments for the share portfolio
 *of an investor*/
 
 import java.util.Scanner;
 
 public class Exercise2OOP1 {
  public static void main(String args[])
         {
  
  String investment1,investment2;
  int shares1,shares2;
  float price1,price2;
 
  Scanner input = new Scanner(System.in);
 
 System.out.print("Please enter the type of the first investment: ");
  investment1 = input.nextLine();
 
 System.out.print("Please enter the number of shares purchased: ");
 shares1 = input.nextInt();
 
 System.out.print("Please enter the share price: ");
 price1 = input.nextFloat();
 
 System.out.println("\n\n\n");
 
 System.out.print("Please enter the type of the second investment: ");
 input.nextLine();
 investment2 = input.nextLine();
 
 System.out.print("Please enter the number of shares purchased: ");
 shares2 = input.nextInt();
 
 System.out.print("Please enter the share price: ");
 price2 = input.nextFloat();
 
System.out.println("\n\n\t\t\t\t================================\n\t\t\t\t\t\tInvestment Details" +
                   "\n\t\t\t\t================================" + String.format("%-20s%-10s%s\n%-20s%-10s%s\n" + 
                   "%-20s%-10d%.4f\n%-20s%-10d%.4f","\n\nInvestment Type", "# Shares", "Share Price", "---------------", "-------"
                     ,"-----------",investment1,shares1,price1,investment2,shares2,price2));

  }
}