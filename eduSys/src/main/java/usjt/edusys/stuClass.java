
package usjt.edusys;

import javax.swing.JOptionPane;

public class stuClass {
     private String sName;
     private int sAge;
     private int sRA;
     private String sPhone;
     private String sEmail;
     private String sPass;
     
     
//  METHODS:
     public void identifyStu(){
         setsName(JOptionPane.showInputDialog(null, "Your name:"));
         JOptionPane.showMessageDialog(null, "Welcome student " + getsName() + "!"); 
         
         
         setsAge(Integer.parseInt(JOptionPane.showInputDialog(null, "Your age:")));
         setsRA(Integer.parseInt(JOptionPane.showInputDialog(null, "Your RA:")));
         setsPhone(JOptionPane.showInputDialog(null, "Your phone:"));
         setsEmail(JOptionPane.showInputDialog(null, "Your email:"));
         setsPass(JOptionPane.showInputDialog(null, "Create a password:"));
         
           
     }
     public void viewGrades(){
         
     }
     
      public void viewCourseWork(){
         
     }

// GET AND SET VAR:
      
    private String getsName() {
        return sName;
    }
    

    private void setsName(String sName) {
        this.sName = sName;
    }
    

    private int getsAge() {
        return sAge;
    }
    

    private void setsAge(int sAge) {
        this.sAge = sAge;
    }
    

    private int getsRA() {
        return sRA;
    }
    

    private void setsRA(int sRA) {
        this.sRA = sRA;
    }

   
    private String getsPhone() {
        return sPhone;
    }

  
    private void setsPhone(String sPhone) {
        this.sPhone = sPhone;
    }

 
    private String getsEmail() {
        return sEmail;
    }

    
    private void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

 
    private String getsPass() {
        return sPass;
    }

   
    private void setsPass(String sPass) {
        this.sPass = sPass;
    }
     
}
