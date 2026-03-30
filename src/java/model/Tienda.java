/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Home
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
