
package usjt.c03;

import javax.swing.JOptionPane;


public class Time {
    public static void main(String[] args) {
         // Read the time of beggining and end of a meeting and print the lenght       
         //1step: Get the time from the client and parsing from strign to integer 
         //2step: Calculate the time using math operation
         //3step: Display it to the client 

        //1ST TEST: -ERR: its not calculating properly the time
//        int sh = Integer.parseInt(JOptionPane.showInputDialog(null, "Please insert the hour the meeting started 24h format"));
//        int sm = Integer.parseInt(JOptionPane.showInputDialog(null, "Please insert the minute the meeting started 24h format"));
        
//        int eh = Integer.parseInt(JOptionPane.showInputDialog(null, "Please insert the hour the meeting ended 24h format"));
//        int em = Integer.parseInt(JOptionPane.showInputDialog(null, "Please insert the minute the meeting ended 24h format"));

//        int fHour = eh - sh;
//        int fMinute = em - sm;       
//        JOptionPane.showMessageDialog(null, "The lenght of your meeting was: " + fHour +"hrs" + fMinute + "minutes");


        //2ND TEST: -ERR: its not showing the time properly  
        double sh = Integer.parseInt(JOptionPane.showInputDialog(null, "Please insert the hour the meeting started 24h format"))*60;
        double sm = Integer.parseInt(JOptionPane.showInputDialog(null, "Please insert the minute the meeting started 24h format"));
        double sf = sh+sm;
        System.out.println(" "+  sh + " " + sm + " "+ sf);
        
        
        double eh = Integer.parseInt(JOptionPane.showInputDialog(null, "Please insert the hour the meeting ended 24h format"))*60;
        double em = Integer.parseInt(JOptionPane.showInputDialog(null, "Please insert the minute the meeting ended 24h format"));
        double ef = eh + em;
        System.out.println(" "+  eh + " " + em + " "+ ef);
        
        int h = (int)((ef - sf)/60);
        int m = (int)((ef - sf)%60);
        System.out.println(" " + h + ":"+ m + "hrs");
        
        

      
    }
}

