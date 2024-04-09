
package usjt.c04;


import javax.swing.JOptionPane;

public class Triangle {

    public static void main(String[] args) {
 //1st exercise: Calculate the area of a triangle: (b*h)/2
 //2nd exercise: Read 3 sides of a triangle and display if it is: isosceles, equilateral, scalene . Read 3 int, print the largest one, the 2nd largest and in crescent order
        
        //First get the values from the client
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Please insert the one side of your triangle"));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Please insert the base of the triangle"));
        int c = Integer.parseInt(JOptionPane.showInputDialog(null, "Please insert the other side of the triangle"));
        int h = Integer.parseInt(JOptionPane.showInputDialog(null, "Please insert the height of the triangle"));
        
        //Calculating ex 1: area of the triangle
        int area = b* h;
        JOptionPane.showMessageDialog(null, "The area of your triangle is: "+area);
        
        //Perimeter of the triangle:
        int perimeter = a+b+c;
        JOptionPane.showMessageDialog(null, "The perimeter of your triangle is: "+perimeter);
        
        //Checking if the triangle is Isosceles, equilateral or scalene
        if(a==b && b==c && a==c){
          JOptionPane.showMessageDialog(null, "Your triangle is Equilateral");  
        }else if(a==c && a!=b && c!=b){
          JOptionPane.showMessageDialog(null, "Your triangle is Isoceles");
        }else if(a!=b && a!=c && b!=c){
          JOptionPane.showMessageDialog(null, "Your triangle is Scalene");  
        }
        
        //Printing the largest and checking the 2nd largest at the same loop:
        if(a<b && a<c){
            if(b<c){
                JOptionPane.showMessageDialog(null, " " + a + " " + b + " " + c);
            }else{
                JOptionPane.showMessageDialog(null, " " + a + " " + c + " " + b );
            }
        }else if(b<a && b<c){
            if(a<c){
                JOptionPane.showMessageDialog(null,  " " + b + " " + a + " " + c);
            }else{
                JOptionPane.showMessageDialog(null,  " " + b + " " + c + " " + a);
            }
        }else{
            if(b<a){
                JOptionPane.showMessageDialog(null,  " " + c + " " + b + " " + a);
            }else{
                JOptionPane.showMessageDialog(null,  " " + c + " " + a + " " + b);
            }    
        }       
    }
}
