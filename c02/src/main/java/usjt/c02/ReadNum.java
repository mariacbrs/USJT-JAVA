
package usjt.c02;

import javax.swing.JOptionPane;

public class ReadNum {

    public static void main(String[] args) {
        //Read a int number between 1 and 999, print the value of ones, tens, hundred. * take a look at MOD operator %  
        
        //Getting the number from the client
        String gNumber;
        int number, ones, tens, hundreds;
        
        //It will always return a string thats why you cant use the var number right away
        gNumber = JOptionPane.showInputDialog(null, "Please insert the number: ");
        number = Integer.parseInt(gNumber);
        
        // Separete the ones, tens and hundreds
        ones = number % 10;
        tens = (number % 100) / 10;
        hundreds = number / 100;
        
        //printing the results
        //System.out.println("Check below the results of your number" );
        JOptionPane.showMessageDialog(null, "Your results are: " + hundreds + " hundreds, " + tens + " tens and " + ones + " ones ");

    }
    
}

