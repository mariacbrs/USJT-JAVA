
package usjt.edusys;

import javax.swing.JOptionPane;

public class teacherClass extends userClass{

//alt+insert to create constructor
   
    
// METHODS:    

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
}