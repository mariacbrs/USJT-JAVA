
package usjt.c12;

import javax.swing.JOptionPane;


public class query {
    public static void main(String args[]){
        String menu = "1-Cadastrar\n2-Atualizar\n3-Apagar\n4-Listar\n0-Sair";
        int option;
        do{
            option = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(option){
                case 1: 
                    String name = JOptionPane.showInputDialog("Insert name");
                    int age = Integer.parseInt(JOptionPane.showInputDialog("Insert age"));
                    int ra = Integer.parseInt(JOptionPane.showInputDialog("Insert RA"));
                    String email = JOptionPane.showInputDialog("Insert age");
                    String phone = JOptionPane.showInputDialog("Insert phone");
                    stu student = new stu();
                    student.setName_stu(name);
                    student.setAge_stu(age);
                    student.setRa_stu(ra);
                    student.setEmail_stu(email);
                    student.setPhone_stu(phone);
                    student.insertStu();
                    break;
                case 2: 
                   
                    break;
                case 3:
                   
                    break;
                case 4:
                   
                    break;
                case 0:
                    break;
                default:    
                    JOptionPane.showMessageDialog(null, "Invaid Option");
            }
        }while(option !=0);
    
    }
}
