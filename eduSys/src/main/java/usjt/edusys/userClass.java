
package usjt.edusys;

import javax.swing.JOptionPane;

public class userClass {
    private String uName;
    private int uAge;
    private String uEmail;
    private String uPass;
    
// GET AND SET VAR: set define e get pega o valor 

    private String getuName() {
        return uName;
    }

    private void setuName(String uName) {
        this.uName = uName;
    }


    private int getuAge() {
        return uAge;
    }

   
    private void setuAge(int uAge) {
        this.uAge = uAge;
    }

   
    private String getuEmail() {
        return uEmail;
    }

  
    private void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

 
    private String getuPass() {
        return uPass;
    }


    private void setuPass(String uPass) {
        this.uPass = uPass;
    }
    
//  METHODS:
      public void IdentifyUser(){
        setuName(JOptionPane.showInputDialog(null, "Your name:"));
        JOptionPane.showMessageDialog(null, "Welcome" + getuName() + "!");
        
        setuAge(Integer.parseInt(JOptionPane.showInputDialog(null, "Your age:")));
        setuEmail(JOptionPane.showInputDialog(null, "Your email:"));
        setuPass(JOptionPane.showInputDialog(null, "Create a password:"));
     }  

     public void viewGrades(){
         
     }
}
