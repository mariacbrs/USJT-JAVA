
package usjt.edusys;


import javax.swing.JOptionPane;

public class Index {

    public static void main(String[] args) {
    //This page features:
    // - "Login" -> Will identify if the user is a student or teacher
   
    
      // The main condition block is doing the login function, using the data from the var "user" to identify if the user is a Student, Teacher or if the data entered is invalid.
      String user = JOptionPane.showInputDialog(null, "Type S for student or T for teacher");
     
     
     
    //                                             STUDENT BLOCK START   
      if(user.equalsIgnoreCase("S")){
        stuClass stu = new stuClass(); 
        stu.identifyStu();
     
 
         
    //                                             STUDENT BLOCK END 
       
    //                                            TEACHER BLOCK START 
      }else if(user.equalsIgnoreCase("T")){
          teacherClass teacher = new teacherClass();
          
          teacher.identifyTeacher();
          teacher.addGrades();
         
          
          
         
          
    //                                             TEACHER BLOCK END      
      }else{
          JOptionPane.showMessageDialog(null, "Invalid option, use S or T");
          
      }
    }
}


