
package usjt.c03;

import javax.swing.JOptionPane;

public class Boolean {

    public static void main(String[] args) {
    
        // first get the number from the user and parse it from string to integer
        String num1 = JOptionPane.showInputDialog(null, "Please insert the first number you want to compare: ");
        String num2 = JOptionPane.showInputDialog(null, "Please insert the second number you want to compare: ");
        
        int a = Integer.parseInt(num1);
        int b = Integer.parseInt(num2);
        
        // then you create a boolean for each operator you want to use to compare the numbers and display the result to the user
        // whenever you use boolean you have to create it:  boolean name = 
        boolean bigger = a > b;
        JOptionPane.showMessageDialog(null,"Is the first number greater than the second? " + bigger);
        
        boolean smaller = a < b;
        JOptionPane.showMessageDialog(null,"Is the first number less than the second? " + smaller);
        
        boolean bORe = a >= b;
        JOptionPane.showMessageDialog(null,"Is the first number greater than or equal to the second? " + bORe);
        
        boolean sORe = a <= b;
        JOptionPane.showMessageDialog(null,"Is the first number less than or equal to the second? " + sORe);
        
        boolean equal = a==b;
        JOptionPane.showMessageDialog(null,"Is the first number equal to the second? " + equal);
        
        boolean different = a != b;
        JOptionPane.showMessageDialog(null, "Is the first number different from the second? " + different);
        
        
    }
    
}

