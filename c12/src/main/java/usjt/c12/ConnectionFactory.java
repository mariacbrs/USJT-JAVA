package usjt.c12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
        
        
//Database
public class ConnectionFactory {

    private String user = "root";
    private String password = "mcbrs";
    private String host = "localhost";
    private String port = "3306";
    private String db = "universidade";
    //private String timezone = "America/São_Paulo";
    
    public Connection obtemConexao(){
        try{
            //String url:"jdbc:mysql://"+host+":"+port+"/"+db+"?serverTimezone="+timezone;
            // Connection connect = DriverManager.getConnection(url, user, password);
             Connection connect = DriverManager.getConnection(
                     "jdbc:mysql://"+host+":"+port+"/"+db,user,password
             );
             if(connect !=null){
                 System.out.println("Connection was a success!");
             }
                return connect;
        }catch(SQLException e){
                System.out.println("Error");
                    e.printStackTrace();
                        return null;
                }
    }
    
    public static void main(String[] args){
        ConnectionFactory connectionFactory = new ConnectionFactory();
        Connection connection = connectionFactory.obtemConexao();
        
        if(connection!= null){
           System.out.println("Connection was tested and approved!");
        }else{
            System.out.println("Error!!!");
        }
      
        
    }
    
}
