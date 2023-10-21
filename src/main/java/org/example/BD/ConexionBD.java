package org.example.BD;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    public String puerto = "3306";
    public String nomservidor = "172.17.0.2";
    public String db = "bd_control_asistencia";
    public String user = "root";
    public String pass = "123456";
    Connection conn = null;

    public Connection conectar() {
        try {
            String ruta = "jdbc:mysql://";
            String servidor = nomservidor + ":" + puerto + "/";
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(ruta + servidor + db, user, pass);

            if (conn != null) {
                System.out.println("Conección a base de datos listo...");
            } else if (conn == null) {
                throw new SQLException();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Se produjo el siguiente error: " + e.getMessage());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Se produjo el siguiente error: " + e.getMessage());
        } finally {
            return conn;
        }
    }

    public void desconectar() {
        conn = null;
        System.out.println("Desconexion a base de datos listo...");
    }
}