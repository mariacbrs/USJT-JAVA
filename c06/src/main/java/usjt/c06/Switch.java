
package usjt.c06;
import javax.swing.JOptionPane;

public class Switch {

    public static void main(String[] args) {
      int grade=70;
      switch(grade){
          case 70: 
               JOptionPane.showMessageDialog(null, "Approved");
              break;
          case 80: 
               JOptionPane.showMessageDialog(null, "Approved with honor");
              break;   
      }        
    }
    
}
