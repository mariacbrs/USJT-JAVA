package usjt.c12;

import java.sql.Connection;
import java.sql.DriverManager;
        
        
//Database
public class ConnectionFactory {

    private String user = "root";
    private String password = "mcbrs";
    private String host = "localhost";
    private String port = "3306";
    private String db = "person_db";
    
    public Connection obtemConexao(){
        try{
             Connection connect = DriverManager.getConnection(
                     "jdbc:mysql://"+host+":"+port+"/"+db,user,password
             );
                return connect;
        }catch(Exception e){
                    e.printStackTrace();
                        return null;
                }
    }
    
}
