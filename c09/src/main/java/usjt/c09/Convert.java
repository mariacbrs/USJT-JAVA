
package usjt.c09;
import javax.swing.*;
import java.awt.Container;
import java.awt.GridLayout;


public class Convert {
    public static void CreateScreen() {
        JFrame window = new JFrame("Convert");
        JTextField celsius = new JTextField();
        JLabel celsiusLabel = new JLabel("\u00B0C");
        JButton toConvert = new JButton("Convert");
        JLabel fahrenheit = new JLabel();
        
        Container calculator = window.getContentPane();
        calculator.setLayout(new GridLayout(2,2,4,4));
        calculator.add(celsius);
        calculator.add(celsiusLabel);
        calculator.add(toConvert);
        calculator.add(fahrenheit);
        
        toConvert.addActionListener((e)->{
            double tempC = Double.parseDouble(celsius.getText());
            double tempF = tempC / 5*9+32;
             fahrenheit.setText(String.format("%.2f\u00B0F",tempF));
        });
        
       window.pack();
       window.setLocationRelativeTo(null);
       window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       window.setVisible(true);
        
        
        
                
    }
}
