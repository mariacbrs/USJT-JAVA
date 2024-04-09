

package usjt.c04;

import javax.swing.JOptionPane;
//import javax.swing.*; -> Will Import all the classes available

public class Conditions {

    public static void main(String[] args) {
       // If:
        String ga = JOptionPane.showInputDialog(null, "insert a number between 1 to 100");
        int a = Integer.parseInt(ga);
        
        if(a > 6 && a < 90){
            System.out.println("true ");
        }else if(a < 90 || a > 6  ){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
    
}
