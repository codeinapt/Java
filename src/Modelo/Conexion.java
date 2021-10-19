
package Modelo;

/**
 *
 * @author Jose L
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    Connection con;
    public Connection getConnection(){
        try {
            String myBD = "jdbc:mysql://localhost:3307/sistemaventa?serverTimezone=UTC";
            con = DriverManager.getConnection(myBD, "root", "Millos#1946");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }
    
}
