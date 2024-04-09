package usjt.c01;

import javax.swing.JOptionPane;

public class DisplayName {

      public static void main(String[] args) {
        // 1st option: using java.util.Scanner;
//        Scanner scanner = new Scanner(System.in);
//        String userName;    
//        System.out.println("Write your name:");
//        userName = scanner.nextLine();
//        System.out.println("Your name is: " + userName);

          // 2nd option: using javax.swing.JOptionPane;
          String userName;
          userName = JOptionPane.showInputDialog("Insert Name: ");
          JOptionPane.showMessageDialog(null, "Your name is: " + userName);
      }
}
