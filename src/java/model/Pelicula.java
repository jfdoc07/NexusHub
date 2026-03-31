/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Home
 */
public class Pelicula extends Producto{

    public Pelicula(String nombre, int valorAlquiler, String formato) {
        super(nombre, valorAlquiler, formato);
    }

    @Override
    public double calcularAlquiler(String membresia, int semanasAlquiladas) {
        double descuentoMembresia = 0;
        switch(membresia){
            case "normal":{
                descuentoMembresia = 1;
                break;
            }
            case "plata":{
                descuentoMembresia = 0.95;
                break;
            }
            case "oro":{
                descuentoMembresia = 0.9;
                break;
            }
            case "platino":{
                descuentoMembresia = 0.8;
                break;
            }
        }
        return this.valorAlquiler * descuentoMembresia * semanasAlquiladas;
    }
    
}
