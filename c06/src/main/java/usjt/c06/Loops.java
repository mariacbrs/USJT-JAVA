
package usjt.c06;

import javax.swing.JOptionPane;

public class Loops {

    public static void main(String[] args) {
      
        //FOR:
        //i+= -> to add numbers starting from 2
        
        int num = 10;
        
        for(int i=0; i < num; i++){
             JOptionPane.showMessageDialog(null, i);   
        } 

        //WHILE:
        
        int num1 = 10;
        
        while(num1 <= 15){
             JOptionPane.showMessageDialog(null, "n1 is" + num1);
             break;
        }
             
        //AWHILE:
        
        int num2=0;
        
        do{
            JOptionPane.showMessageDialog(null, "n2 is" + num2); 
            num2++;
        }while(num2<=5);
        
        
        
        
      
    }
    
}
