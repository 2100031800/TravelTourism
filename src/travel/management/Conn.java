
package travel.management;

import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            //c =DriverManager.getConnection("jdbc:mysql:///tms","root","root"); 
            c =DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem","root","Keerthi@81");
            s =c.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  

