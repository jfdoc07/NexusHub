/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.Conexion to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jfcar
 */
public class Conexion {

    //Datos de la conexión
    private static final String nombreBaseDeDatos = "nexushub";
    private static final String controlador = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/" + nombreBaseDeDatos + "?serverTimezone=UTC";
    private static final String login = "root";
    private static final String password = "root";

    Connection conn = null;

    public Connection conectarBD() throws SQLException {
        if (conn != null && !conn.isClosed()) {
            return conn;
            /*Si la conexión ya existe, simplemente retornela en vez de abrir otra*/
        }
        try {
            Class.forName(controlador);
            conn = DriverManager.getConnection(url, login, password);
            System.out.println("Conectado a la base de datos");
        } catch (ClassNotFoundException e) {
            System.out.println("❌ Error: No se encontró el driver JDBC");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("❌ Error de SQL: " + e.getMessage());
            e.printStackTrace();
        }
        return conn;
    }

    public void desconectarBD() {
        try {
            if (!conn.isClosed() && conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conn = null;
        }
    }
}
