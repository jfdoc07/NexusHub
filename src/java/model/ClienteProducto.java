/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Home
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
            c.getProductosAlquilados().add(p);
            p.setIsAlquilado(true);
        }
        System.out.println("Estado actualizado");
    }

    @Override
    public void devolverProducto(String clienteID, String productoID) {
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
