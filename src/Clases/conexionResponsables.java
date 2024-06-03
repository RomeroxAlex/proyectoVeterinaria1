package Clases;

//Recuerde importar la biblioteca de conexión
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class conexionResponsables {
    
    private final String url = "jdbc:mysql://localhost:3306/calisteNia?characterEncoding=utf8";
    private final String login = "root"; //Administrador de MySQL
    private final String password = "12345678";
    private Connection cnx = null;
    private Statement sttm = null;
    private ResultSet rst = null;

    
    public conexionResponsables(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection(url,login,password);
        } catch (ClassNotFoundException | SQLException c) {
            JOptionPane.showMessageDialog(null,  
                    "ERROR: " + c.getMessage());
            System.exit(1); //salir de aplicación
        }
    }

    //método para Agregar, Modificar y Borrar datos
    public void UID(String sql) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection(url, login, password);
            sttm = cnx.createStatement();
            sttm.executeUpdate(sql); //statement
        } catch (ClassNotFoundException | SQLException c) {
            JOptionPane.showMessageDialog(null, "ERROR: " + c.getMessage());
            System.exit(1); //salir de aplicación
        }
    }

    //Método para Consultar datos
    public ResultSet getValores(String sql) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cnx = DriverManager.getConnection(url, login, password);
            sttm = cnx.createStatement();
            rst = sttm.executeQuery(sql);  //resultset
        } catch (ClassNotFoundException | SQLException c) {
            JOptionPane.showMessageDialog(null, "ERROR: " + c.getMessage());
            System.exit(1);
        }
        return rst;

    }

    public void cerrar() {
        try {
            this.cnx.close();
        } catch (SQLException ex) {
            Logger.getLogger(conexionResponsables.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    public Connection getConexion() {
        return this.cnx;
    }
}
