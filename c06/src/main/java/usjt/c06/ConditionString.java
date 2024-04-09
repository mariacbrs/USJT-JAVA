
package usjt.c06;


import javax.swing.JOptionPane;

public class ConditionString {

    public static void main(String[] args) {
       
        //Because it is case sensitive, use .equalsIgnoreCase(" ")
        String word= "hi";
        if(word.equalsIgnoreCase("Hi")){
             JOptionPane.showMessageDialog(null, "working");
        }else{
              JOptionPane.showMessageDialog(null, "not working"); 
        }
        
        
    }      
}
