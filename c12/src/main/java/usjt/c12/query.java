
package usjt.c12;

import javax.swing.JOptionPane;


public class query {
    static String name;
    static int age;
    static int ra;
    static String email;
    static String phone;
    static int id_stu;
    static stu student = new stu();
    
    public static void main(String args[]){
        String menu = "1-Cadastrar\n2-Atualizar\n3-Apagar\n4-Listar\n0-Sair";
        int option;
        do{
            option = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(option){
                case 1: 
                    name = JOptionPane.showInputDialog("Insert name");
                    age = Integer.parseInt(JOptionPane.showInputDialog("Insert age"));
                    ra = Integer.parseInt(JOptionPane.showInputDialog("Insert RA"));
                    email = JOptionPane.showInputDialog("Insert email");
                    phone = JOptionPane.showInputDialog("Insert phone");
                    
                    student.setName_stu(name);
                    student.setAge_stu(age);
                    student.setRa_stu(ra);
                    student.setEmail_stu(email);
                    student.setPhone_stu(phone);
                    
                    student.insertStu();
                    break;
                case 2: 
                    name = JOptionPane.showInputDialog("Insert name to update");
                    age = Integer.parseInt(JOptionPane.showInputDialog("Insert age to update"));
                    ra = Integer.parseInt(JOptionPane.showInputDialog("Insert RA to update"));
                    email = JOptionPane.showInputDialog("Insert email to update");
                    phone = JOptionPane.showInputDialog("Insert phone to update");
                    id_stu = Integer.parseInt(JOptionPane.showInputDialog("Insert ID you want to update"));
                    
                    student.setName_stu(name);
                    student.setAge_stu(age);
                    student.setRa_stu(ra);
                    student.setEmail_stu(email);
                    student.setPhone_stu(phone);
                    student.setId_stu(id_stu);
                    
                    student.updateStu();
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
