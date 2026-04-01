/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.UUID;

/**
 *
 * @author Home
 */
public abstract class Producto {
    
    protected String ID;
    protected String nombre;
    protected int valorAlquiler;
    protected String formato;
    protected boolean isAlquilado = false;
    
    public abstract double calcularAlquiler(String membresia);

    public Producto(String nombre, int valorAlquiler, String formato) {
        this.ID = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.valorAlquiler = valorAlquiler;
        this.formato = formato;
    }

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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setValorAlquiler(int valorAlquiler) {
        this.valorAlquiler = valorAlquiler;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setIsAlquilado(boolean isAlquilado) {
        this.isAlquilado = isAlquilado;
    }
    
}
