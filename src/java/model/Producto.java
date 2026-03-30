/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Home
 */
public abstract class Producto {
    
    private String nombre;
    private int valorAlquiler;
    private String formato;
    private boolean isAlquilado = false;
    
    public abstract double calcularAlquiler(int valorAlquiler, double valorDescuento, int diasAlquilados);

    public Producto(String nombre, int valorAlquiler, String formato) {
        this.nombre = nombre;
        this.valorAlquiler = valorAlquiler;
        this.formato = formato;
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

    public boolean isIsAlquilado() {
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
