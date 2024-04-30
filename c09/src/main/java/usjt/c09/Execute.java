package usjt.c09;

import javax.swing.SwingUtilities;

public class Execute {
     public static void main(String[] args) {
      
      SwingUtilities.invokeLater(()->{
         Convert.CreateScreen();
      });
    }
}
