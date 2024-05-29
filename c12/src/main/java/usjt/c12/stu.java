
package usjt.c12;

import java.sql.Connection;
import java.sql.PreparedStatement;


public class stu {
    private int id_stu;
    private String name_stu;
    private int age_stu;
    private int ra_stu;
    private String email_stu;
    private String phone_stu;
    
    public void insertStu(){
        String sql = "INSERT INTO student(name_stu, age_stu, ra_stu, email_stu, phone_stu) VALUES (?, ?, ?, ?, ?)";
        
        ConnectionFactory nConnection = new ConnectionFactory();
        try(Connection c= nConnection.obtemConexao()){
          PreparedStatement ps = c.prepareStatement(sql);
          ps.setString(1,getName_stu());
          ps.setInt(2,getAge_stu());
          ps.setInt(3,getRa_stu());
          ps.setString(4,getEmail_stu());
          ps.setString(5,getPhone_stu());
          ps.execute();
        }catch(Exception e){
         e.printStackTrace();
        }
    }

   
    private int getId_stu() {
        return id_stu;
    }


    private void setId_stu(int id_stu) {
        this.id_stu = id_stu;
    }

 
    private String getName_stu() {
        return name_stu;
    }


    public void setName_stu(String name_stu) {
        this.name_stu = name_stu;
    }


    private int getAge_stu() {
        return age_stu;
    }

  
    public void setAge_stu(int age_stu) {
        this.age_stu = age_stu;
    }

    private int getRa_stu() {
        return ra_stu;
    }

 
    public void setRa_stu(int ra_stu) {
        this.ra_stu = ra_stu;
    }

 
    private String getEmail_stu() {
        return email_stu;
    }

    
    public void setEmail_stu(String email_stu) {
        this.email_stu = email_stu;
    }

 
    private String getPhone_stu() {
        return phone_stu;
    }

 
    public void setPhone_stu(String phone_stu) {
        this.phone_stu = phone_stu;
    }
}


