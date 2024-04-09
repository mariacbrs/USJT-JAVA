
package usjt.edusys;

import javax.swing.JOptionPane;

public class stuClass {
     String sName;
     int sAge;
     int sRA;
     String sPhone;
     String sEmail;
     private String sPass;
     
     
//  METHODS:
     public void identifyStu(){ 
         JOptionPane.showMessageDialog(null, "Welcome student!"); 
         
         sName =  JOptionPane.showInputDialog(null, "Your name:");
         sAge = Integer.parseInt(JOptionPane.showInputDialog(null, "Your age:"));
         sRA = Integer.parseInt(JOptionPane.showInputDialog(null, "Your RA:"));
         sPhone = JOptionPane.showInputDialog(null, "Your phone:");
         sEmail = JOptionPane.showInputDialog(null, "Your email:");
         sPass = JOptionPane.showInputDialog(null, "Create a password:");
         
           
     }
     public void viewGrades(){
         
     }
     
      public void viewCourseWork(){
         
     }
     
}
