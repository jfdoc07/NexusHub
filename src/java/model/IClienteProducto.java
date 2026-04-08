/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package model;

/**
 * Interfaz encargada de crear un modelo que concretará ClienteProducto.
 * @author Juan Fernando Cárdenas Duque.
 */
public interface IClienteProducto {
    
    public void añadirProducto(String clienteID, String productoID);
    public void devolverProducto(String clienteID, String productoID);
    
}
