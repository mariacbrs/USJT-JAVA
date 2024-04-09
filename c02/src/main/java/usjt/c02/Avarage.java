package usjt.c02;

import javax.swing.JOptionPane;

public class Avarage {

     public static void main(String[] args) {
        // Read 2 grades and the name of the student, then calculate the avarage and display the name and avg of the student
        
        // 1ST GETTING NAMES AND GRADES:
        
       String stuName = JOptionPane.showInputDialog(null, "Please insert student name ");
       double a1 = Double.parseDouble(JOptionPane.showInputDialog(null, "insert A1 grade: "));
       double a2 = Double.parseDouble(JOptionPane.showInputDialog(null, "insert A2 grade: "));
        
        //CALCULATE THE AVG
      
        double avg = (a1+ a2) / 2;
        
        // DISPLAY THE NAMES AND THE GRADE: 
         JOptionPane.showMessageDialog(null, " "+ stuName + "'s avarage is: " + avg);
     }
}
