

package usjt.c07;
import javax.swing.JOptionPane;

public class Modules {

    public static void main(String[] args) {
        fatorial(8);
    
    }
    
     public static void fatorial(int n) {
       for(int i= 1; i<=n; i++){
           int fat = n;
            fat = fat * i;
            JOptionPane.showMessageDialog(null, fat);
       }
    
    }
}
