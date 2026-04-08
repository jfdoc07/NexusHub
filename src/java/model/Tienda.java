/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase de entidad que representa la tienda completa, guardando clientes y
 * productos previamente creados.
 * Nota: Esta clase requiere que existan los servlets que utilizan sus métodos.
 * @author Juan Fernando Cárdenas Duque.
 */
public class Tienda {

    protected List<Cliente> clientela = new ArrayList<>();
    protected List<Producto> stock = new ArrayList<>();

    public List<Cliente> getClientela() {
        return clientela;
    }

    public List<Producto> getStock() {
        return stock;
    }

    public void agregarCliente(Cliente c) {
        clientela.add(c);
    }

    public void agregarProducto(Producto p) {
        stock.add(p);
    }

}
