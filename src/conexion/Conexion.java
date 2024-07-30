
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
      public static Connection conectar() {
        String url = "jdbc:mysql://localhost:3306/sist_estacionamiento?useSSL=false";
        String user = "root";
        String password = "";

        try {
            Connection cn = DriverManager.getConnection(url, user, password);
            return cn;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos.");
            System.out.println("Error con la bd. Error "+e);
            return null;
        }
    }
}
