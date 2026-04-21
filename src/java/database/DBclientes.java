/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;

/**
 *
 * @author jfcar
 */
public class DBclientes {

    private Conexion conn;

    public DBclientes() {
        conn = new Conexion();
    }

    public void insertarCliente(Cliente c) {
        try {
            PreparedStatement pstm = conn.conectarBD().prepareStatement("INSERT INTO usuarios (user_idStr, user_nombre, user_numContacto, user_membresia) VALUES (?,?,?,?)") ;
            /*Abra la conexion y prepare la sentencia*/
            pstm.setString(1, c.getID());
            pstm.setString(2, c.getNombre());
            pstm.setString(3, c.getNumContacto());
            pstm.setString(4,c.getMembresia());
            
            pstm.executeUpdate();
            /*Ejecute la orden a la base de datos*/
            
        } catch (SQLException e) {
            System.out.println(e);
        } finally {   
            conn.desconectarBD();
            //Pase lo que pase, cierre la conexion
        }
    }
    
    public void eliminarCliente(String id) {
        String sentenciaSQLeliminar = "DELETE FROM usuarios WHERE user_idStr = ?";
        try{
            PreparedStatement pstm = conn.conectarBD().prepareStatement(sentenciaSQLeliminar);
            pstm.setString(1, id);
            /*Seteo el string recibido desde el servlet para crear la consulta*/
            
            pstm.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            conn.desconectarBD();
        }
    }
    
    public List<Cliente> obtenerClientes(){
        List<Cliente> listaClientes = new ArrayList<>();
        String sentenciaSQL = "SELECT * FROM usuarios";
        
        try {
            PreparedStatement pstm = conn.conectarBD().prepareStatement(sentenciaSQL);
            ResultSet rs = pstm.executeQuery();
            /*Prepare la consulta y ejecútela*/
            
            while (rs.next()) { //Mientras exista un resultado más, devolverá positivo.
                Cliente c = new Cliente(); //Sobrecarga de constructores
                c.setID(rs.getString("user_idStr"));
                c.setNombre(rs.getString("user_nombre"));
                c.setNumContacto(rs.getString("user_numContacto"));
                c.setMembresia(rs.getString("user_membresia"));
                listaClientes.add(c);
            }
        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            conn.desconectarBD();
        }
        return listaClientes;
    }
}
