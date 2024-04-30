
package usjt.c09;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class GUI {
    public static void main(String[] args) {
      SwingUtilities.invokeLater(()->{
          createWindow();
      });
    }

    public static void createWindow() {
        JFrame window = new JFrame("1st window");
        JLabel label = new JLabel("Hello World!");
        
        Container login = window.getContentPane();
        login.add(label);
        
        window.pack();  
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true); 
    }
}
