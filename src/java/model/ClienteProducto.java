/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Home
 */
public class ClienteProducto implements IClienteProducto{

    @Override
    public void añadirProducto(Cliente cliente, Producto producto) {
        producto.setIsAlquilado(true);
        cliente.getProductosAlquilados().add(producto);
    }

    @Override
    public void devolverProducto(Cliente cliente, Producto producto) {
        producto.setIsAlquilado(false);
        cliente.getProductosAlquilados().remove(producto);
    }
    
    
    
}
