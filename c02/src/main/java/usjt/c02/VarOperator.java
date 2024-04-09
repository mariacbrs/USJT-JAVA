
package usjt.c02;

import javax.swing.JOptionPane;

public class VarOperator {

    public static void main(String[] args) {
               //USING JOPTIONPANE:
          int age;
          String userAge;
          
          userAge = JOptionPane.showInputDialog(null, "Please type your age ");
            // The showInputDialog will always return a String
          age = Integer.parseInt(userAge);
            //String to int, you have to save it into another var 
          System.out.println("User age is: " + (age+4));
          JOptionPane.showMessageDialog(null, "Your age will be " + (age+4) + " in 4 years");
        
//        //USING SCANNER:
//        String age;
//        int finalAge;
//
//        Scanner userAge = new Scanner(System.in);
//        System.out.println("Please type your age: ");
//        age = UserAge.nextLine();
//        finalAge = Integer.parseInt(Age);
//        System.out.println("Your age will be: " + (finalAge + 6) + " in 6 years");

    }
    
}
