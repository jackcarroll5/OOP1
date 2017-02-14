//JOptionPaneOutput.java
/*This program displays the values of some variables to a JOptionPane message dialog*/

import javax.swing.JOptionPane;

public class JOptionPaneOutput {
 public static void main(String args[])
 { 
   String message = "This output message is being displayed on a JOptionPane GUI component" +
   	                 "\ncalled a message dialog. We will use this component a lot from now on.";

int wholeNum = 10;
float fractionNum = 78.7956f;

JOptionPane.showMessageDialog(null,message + "\n\nWe have just used it above to display the " +
           "value of a String variable but it \ncan also be used to display the " +
           	"values of integer and floating-point variables.\n\n\nIn this case the value " +
           	"of the integer variable is " + wholeNum + " while the value of the \n" +
           	"floating-point variable is " + fractionNum + ". The floating-point number " +
           	"correct to \n2 decimal places is " + String.format("%.2f",fractionNum)
           	,"GUI Variable Outputs",JOptionPane.INFORMATION_MESSAGE);
           	
           	System.exit(0);

    }
}