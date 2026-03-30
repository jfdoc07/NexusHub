/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.List;

/**
 *
 * @author Home
 */
public class Cliente {
    
    private String nombre;
    private String numContacto;
    private String membresia;
    private List<Producto> productosAlquilados;

    public Cliente(String nombre, String numContacto, String membresia) {
        this.nombre = nombre;
        this.numContacto = numContacto;
        this.membresia = membresia;
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
    
}
