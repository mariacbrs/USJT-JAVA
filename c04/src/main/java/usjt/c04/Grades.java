
package usjt.c04;

import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {
         //Read 3 grades of a student, A1, A2 and A3. Then print the avarage and if he was approved, will do another AI or if he was not aprroved
        // Approved >= 70 , 30 <= A1 < 70 , NA < 30
        Scanner read = new Scanner(System.in);
        
        System.out.println("Type your A1 grade: ");
        int a1 = read.nextInt(); 
        
        System.out.println("Type your A2 grade: ");
        int a2 = read.nextInt(); 
        
        System.out.println("Type your A3 grade: ");
        int a3 = read.nextInt();
        
        int fg = (a1*3 + a2*3 + a3*4)/10; 
        
        System.out.println("Grades in order: " + a1 + " " + a2 + " " + a3);
        System.out.println("Student final Grade: " + fg);
        
        if(fg>70){
          System.out.println("Approved!");  
        }else if( fg>= 30 && fg<70 ){
           System.out.println("Need  to do aonther AI"); 
        }else{
            System.out.println("Not Aprroved!");
        }
    }
    
}
