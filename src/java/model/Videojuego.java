/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Home
 */
public class Videojuego extends Producto {

    public Videojuego(String nombre, int valorAlquiler, String formato) {
        super(nombre, valorAlquiler, formato);
    }

    @Override
    public double calcularAlquiler(String membresia) {
        double descuentoMembresia = 0;
        switch (membresia) {
            case "normal": {
                descuentoMembresia = 1;
                break;
            }
            case "plata": {
                descuentoMembresia = 0.95;
                /*Descuento del 5%*/
                break;
            }
            case "oro": {
                descuentoMembresia = 0.85;
                /*Descuento del 15%*/
                break;
            }
            case "platino": {
                descuentoMembresia = 0.75;
                /*Descuento del 25%*/
                break;
            }
        }
        return this.valorAlquiler * descuentoMembresia;
    }

}
