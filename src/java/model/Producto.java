/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.UUID;

/**
 * Clase de entidad que representa un producto en NexusHub.
 * Almacena datos básicos, calcula el alquiler del producto y es un modelo para 
 * las concreciones de todos los productos que tiene NexusHub.
 * @author Juan Fernando Cárdenas Duque.
 */
public abstract class Producto {

    protected String ID;
    protected String nombre;
    protected int valorAlquiler;
    protected String formato;
    protected boolean isAlquilado = false;

    public Producto(String nombre, int valorAlquiler, String formato) {
        this.ID = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.valorAlquiler = valorAlquiler;
        this.formato = formato;
    }

    public abstract double calcularAlquiler(String membresia);
    /*Metodo que los hijos implementarán, para realizar ligadura dinámica.*/

    public String getID() {
        return ID;
    }

    public String getNombre() {
        return nombre;
    }

    public int getValorAlquiler() {
        return valorAlquiler;
    }

    public String getFormato() {
        return formato;
    }

    public boolean getIsAlquilado() {
        return isAlquilado;
    }

    public void setIsAlquilado(boolean isAlquilado) {
        this.isAlquilado = isAlquilado;
    }

}
