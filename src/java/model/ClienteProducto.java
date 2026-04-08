/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * Clase de servicio encargada de gestionar un producto para un cliente en
 * específico, utilizando dos métodos bien definidos desde una interfaz.
 * @author Juan Fernando Cárdenas Duque.
 */
public class ClienteProducto implements IClienteProducto {

    protected Tienda tienda;

    public ClienteProducto(Tienda tienda) {
        this.tienda = tienda;
    }

    @Override
    public void añadirProducto(String clienteID, String productoID) {
        Cliente c = null;
        for (Cliente cl : tienda.getClientela()) {
            /*Para cada cliente en la clientela de la tienda (clientes registrados)
        en total)*/
            if (cl.getID().equals(clienteID)) {
                c = cl;
                /*El cliente al que se le añade un producto se recupera y se
                guarda*/
                break;
            }
        }
        Producto p = null;
        for (Producto pr : tienda.getStock()) {
            if (pr.getID().equals(productoID)) {
                p = pr;
                /*Mismo mecanismo para los productos*/
                break;
            }
        }
        if (c != null && p != null) {
            c.getProductosAlquilados().add(p);
            /*Añado el producto al arreglo de productos alquilados de ese cliente*/
            p.setIsAlquilado(true);
            /*Cambio de estado para facilidad en el sistema*/
        }
        System.out.println("Estado actualizado");
        /*Mensaje en la consola para confirmar cambio*/
    }

    @Override
    public void devolverProducto(String clienteID, String productoID) {
        /*Este método funciona igual que el anterior, pero con sus respectivas
         *modificaciones tanto al arreglo de productos alquilados del cliente como
         *al estado del producto.
         */
        Cliente c = null;
        for (Cliente cl : tienda.getClientela()) {
            if (cl.getID().equals(clienteID)) {
                c = cl;
                break;
            }
        }
        Producto p = null;
        for (Producto pr : tienda.getStock()) {
            if (pr.getID().equals(productoID)) {
                p = pr;
                break;
            }
        }
        if (c != null && p != null) {
            c.getProductosAlquilados().remove(p);
            p.setIsAlquilado(false);
        }
    }
}
