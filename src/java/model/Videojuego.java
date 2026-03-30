/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Home
 */
public class Videojuego extends Producto{

    public Videojuego(String nombre, int valorAlquiler, String formato) {
        super(nombre, valorAlquiler, formato);
    }

    @Override
    public double calcularAlquiler(int valorAlquiler, double valorDescuento, int diasAlquilados) {
       return valorAlquiler * valorDescuento * diasAlquilados;
    }
    
}
