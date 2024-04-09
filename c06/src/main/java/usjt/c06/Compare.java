

package usjt.c06;

import javax.swing.JOptionPane;

public class Compare {

    public static void main(String[] args) {
        
        // you can also compare int, its a similar command
        
       double n1=0.1;
       double n2=0.2;
       
       if(Double.compare(n1, n2)==0){
            JOptionPane.showMessageDialog(null, "Numbers are the same");
       }else{
              JOptionPane.showMessageDialog(null, "Numbers are different");
       }
    }
    
}
