//BankAccountMethod.java
/*This program uses many methoda - some to read in a customer's bank account details and
 *another method to check if the customer's credit limit is exceeded*/
 
 import javax.swing.JOptionPane;
 
 public class BankAccountMethod {
   public static void main(String args[])
   {
   	  String accountNum;
   	   float balance, debits, credits, creditLimit;
   	
   	accountNum = JOptionPane.showInputDialog("Enter account number (<CR> to exit)");
   	
   	while(!accountNum.equals(" "))
   	{
   		
   	   balance = getCustomerBalance();	
   	debits = getCustomerDebits();
   	 credits = getCustomerCredits();
   	creditLimit = getCustomerCreditLimit();
   		
   	checkCreditLimit(accountNum, balance, debits, credits, creditLimit);
   		
   	accountNum = JOptionPane.showInputDialog("Enter account number (<CR> to exit)");	
   		 		
   	}
   	
  JOptionPane.showMessageDialog(null,"Thanks for using the system - goodbye!",
   "Exiting System ...",JOptionPane.PLAIN_MESSAGE); 	
   	
   	System.exit(0);
   		
   }
   
   public static float getCustomerBalance()
   {
   	float balance;
   	String balanceAsString;
   	balanceAsString = JOptionPane.showInputDialog("Enter account balance");
   	balance = Float.parseFloat(balanceAsString);
   	return balance;
   }
   
    public static float getCustomerDebits()
   {
   	float debits;
   	String debitsAsString;
   	debitsAsString = JOptionPane.showInputDialog("Enter total debits");
   	debits = Float.parseFloat(debitsAsString);
   	return debits;
   }
   
    public static float getCustomerCredits()
   {
   	float credits;
   	String creditsAsString;
   	creditsAsString = JOptionPane.showInputDialog("Enter total credits");
   	credits = Float.parseFloat(creditsAsString);
   	return credits;
   }
   
    public static float getCustomerCreditLimit()
   {
   	float creditLimit;
   	String creditLimitAsString;
   creditLimitAsString = JOptionPane.showInputDialog("Enter credit limit");
   creditLimit = Float.parseFloat(creditLimitAsString);
   	return creditLimit;
   }
   
   public static void checkCreditLimit(String accountNum, float balance, float debits,
    float credits, float creditLimit)
    {
       
       float newBalance;	
       	
    newBalance = balance - debits + credits;	
    	
    String text = "\nAccount number ==> " + accountNum + "\nCredit Limit " +
     " ==> " + String.format("€%.2f",creditLimit) + "\nNew Balance ==> " +
     	String.format("€%.2f",newBalance);	
    	
    if(newBalance < -creditLimit)	
      text += "\n\nSorry - Credit Limit has been exceeded";	
    else	
    	text += "\n\nCredit limit has not been exceeded";
    	
       JOptionPane.showMessageDialog(null,text,"Account Details",JOptionPane.PLAIN_MESSAGE);	   	
    }
 }