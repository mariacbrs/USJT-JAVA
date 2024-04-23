
package usjt.edusys;

import javax.swing.JOptionPane;

public class stuClass extends userClass{
     private int sRA;
     private String sPhone;

// GET AND SET VAR: set define e get pega o valor  

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
    
//  METHODS:
    @Override
        public void IdentifyUser(){
            
        super.IdentifyUser();
        setsRA(Integer.parseInt(JOptionPane.showInputDialog(null, "Your RA:")));
        setsPhone(JOptionPane.showInputDialog(null, "Your phone:"));
       
     } 
     
      public void viewCourseWork(){
         
     }
     
}
