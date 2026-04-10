/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Clase entidad que representa un usuario en NexusHub.
 * Nota: Esta clase requiere que existan los servlets que utilizan sus métodos.
 * @author Juan Fernando Cárdenas Duque.
 */
public class Cliente {
    
    private String ID;
    private String nombre;
    private String numContacto;
    private String membresia;
    private List<Producto> productosAlquilados = new ArrayList<>();

    public Cliente(String nombre, String numContacto, String membresia) {
        this.ID = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.numContacto = numContacto;
        this.membresia = membresia;
    }

    public String getID() {
        return ID;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getNumContacto() {
        return numContacto;
    }

    public String getMembresia() {
        return membresia;
    }

    public List<Producto> getProductosAlquilados() {
        return productosAlquilados;
    }
    /*jeison*/
    
}
