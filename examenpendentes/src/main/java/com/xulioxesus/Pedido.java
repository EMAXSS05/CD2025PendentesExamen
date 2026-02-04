package com.xulioxesus;

import java.util.ArrayList;
import java.util.List;

/**
 * Esta es la clase Pedido que gestiona los productos.
 */
public class Pedido {
    /**
     * Lista de productos.
     */
    private List<Producto> productos;

    /**
     * Constructor de la clase Pedido donde se inicializa la lista de productos.
     */
    public Pedido() {
        productos = new ArrayList<>();
    }

    /**
     * Método que se encarga de añadir un nuevo producto al pedido.
     * @param producto es un objeto de tipo producto.
     */

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    /**
     * Método que se encarga de calcular el monto total del pedido.
     * @return un numero decimal el cual es el resultado de la suma de los
     *         productos.
     */

    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getTotal();
        }
        return total;
    }
}
