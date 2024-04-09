
package usjt.c05;

import javax.swing.JOptionPane;

public class Conditions2 {

    public static void main(String[] args) {
    // To work with numbers: int, long you have to put an L at the end of the number, byte(Java doesnt like it), double and float have to put an f at the end of the number
    // Verify if the number is positive, negative or neutral
    
    //1st get the number from the client:
        int fNum = Integer.parseInt(JOptionPane.showInputDialog(null, "please insert the number you want to check:"));
 
        
    //Apply if and else to check if the number is positive, negative or neutral(0):
    
        if(fNum==0){
            JOptionPane.showMessageDialog(null, "your number is neutral (0)");
        }else if(fNum<0){
            JOptionPane.showMessageDialog(null, "your number is negative");
        }else{
             JOptionPane.showMessageDialog(null, "your number is positive");
        }
            
 
        
        
        
    }
}