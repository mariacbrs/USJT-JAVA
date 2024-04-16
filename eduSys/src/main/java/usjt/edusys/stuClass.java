
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

    /**
     * @return the sName
     */
    private String getsName() {
        return sName;
    }

    /**
     * @param sName the sName to set
     */
    private void setsName(String sName) {
        this.sName = sName;
    }

    /**
     * @return the sAge
     */
    private int getsAge() {
        return sAge;
    }

    /**
     * @param sAge the sAge to set
     */
    private void setsAge(int sAge) {
        this.sAge = sAge;
    }

    /**
     * @return the sRA
     */
    private int getsRA() {
        return sRA;
    }

    /**
     * @param sRA the sRA to set
     */
    private void setsRA(int sRA) {
        this.sRA = sRA;
    }

    /**
     * @return the sPhone
     */
    private String getsPhone() {
        return sPhone;
    }

    /**
     * @param sPhone the sPhone to set
     */
    private void setsPhone(String sPhone) {
        this.sPhone = sPhone;
    }

    /**
     * @return the sEmail
     */
    private String getsEmail() {
        return sEmail;
    }

    /**
     * @param sEmail the sEmail to set
     */
    private void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    /**
     * @return the sPass
     */
    private String getsPass() {
        return sPass;
    }

    /**
     * @param sPass the sPass to set
     */
    private void setsPass(String sPass) {
        this.sPass = sPass;
    }
     
}
