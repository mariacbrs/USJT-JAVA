
package usjt.edusys;

import javax.swing.JOptionPane;

public class teacherClass {
    private String tName;
    private int tAge;
    private String tEmail;
    private String tPass;
   
    
// METHODS:    

   public void identifyTeacher(){
        settName(JOptionPane.showInputDialog(null, "Your name:"));
        JOptionPane.showMessageDialog(null, "Welcome teacher " + gettName() + "!");
        
        settAge(Integer.parseInt(JOptionPane.showInputDialog(null, "Your age:")));
        settEmail(JOptionPane.showInputDialog(null, "Your email:"));
        settPass(JOptionPane.showInputDialog(null, "Create a password:"));
        
   } 
   public void addGrades(){
   //Method functionalities:  
        // - Launch Grades -> If the user is a teacher, allows the client to launch the students grade
        // - Avarage calculator -> Using the grades lauched by the teacher will calculate the avarage and then display it
        
        
        //This array will hold the name of the students taking the UC 
          String [] student = {"Ana", "Julia", "Maria"};
          
          //The loop for is going through the entire lenght of the array allowing the teacher to insert the grades and calculate the avarage for each student
          for(int i=0; i< student.length; i++ ){
              
             double a1 = Double.parseDouble(JOptionPane.showInputDialog(null, "insert A1 grade of the student " + student[i]));
             double a2 = Double.parseDouble(JOptionPane.showInputDialog(null, "insert A2 grade of the student " + student[i]));
             double a3 = Double.parseDouble(JOptionPane.showInputDialog(null, "insert A3 grade of the student " + student[i]));  
           
             double avg = (a1+a2+a3) / 3;
             JOptionPane.showMessageDialog(null, " " + student[i]+ "'s avarage in the class is " + avg);
             
          }
   }

// GET AND SET VAR:
   
    private String gettName() {
        return tName;
    }


    private void settName(String tName) {
        this.tName = tName;
    }

  
    private int gettAge() {
        return tAge;
    }

 
    private void settAge(int tAge) {
        this.tAge = tAge;
    }

 
    private String gettEmail() {
        return tEmail;
    }

 
    private void settEmail(String tEmail) {
        this.tEmail = tEmail;
    }

 
    private String gettPass() {
        return tPass;
    }

 
    private void settPass(String tPass) {
        this.tPass = tPass;
    }
}