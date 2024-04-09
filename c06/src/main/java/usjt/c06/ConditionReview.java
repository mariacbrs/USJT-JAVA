
package usjt.c06;


import javax.swing.JOptionPane;

public class ConditionReview {

    public static void main(String[] args) {
       
        //IF 
        
        double grade= 70;
        if(grade>=70){
              JOptionPane.showMessageDialog(null, "Approved");
        }
        
        //IF ELSE
        
        double grade1 = 70;
         if(grade1>=70){
              JOptionPane.showMessageDialog(null, "Approved");
        }else{
            JOptionPane.showMessageDialog(null, "Repproved");  
         }
         
        //ELSE IF
        
        double grade2 = 90;
         if(grade2>=70){
            JOptionPane.showMessageDialog(null, "Approved");
        }else if(grade2>=80){
            JOptionPane.showMessageDialog(null, "Approved with honor");  
         }else{
           JOptionPane.showMessageDialog(null, "Repproved");   
        }
         
    }
    
}

