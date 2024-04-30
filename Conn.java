package UniBuddy;

import java.sql.*;

public class Conn{

    /*
     * 1) Register the DRIVER CLASS
     * 2) CREATING CONNECTION string
     * 3) Creating statements
     * 4) Executing MySQL Queries
     * 5) CLOSING the CONNECTION
     */

    Connection c;
    Statement s;
    
    Conn(){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            /*Java Projects-> Referenced Libraries*/

            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/UniBuddy","root", "password");
            /*Connection  */
            
            s = c.createStatement();
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
