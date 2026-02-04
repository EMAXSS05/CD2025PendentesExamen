package com.xulioxesus;

/**
 * Clase que representa a un producto.
 */

public class Producto {
    /**
     * Nombre del producto.
     */
    private String nombre;
    /**
     * Valor del precio del producto x.
     */
    private double precio;
    /**
     * cantidad de un producto x.
     */
    private int cantidad;

    /**
     * Comstructor de la clase Producto donde se inicializan los atributos.
     * @param nombre   es el nombre del producto.
     * @param precio   es el precio del producto.
     * @param cantidad es la cantidad del producto en si.
     */
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    /**
     * @return retorna el nombre del producto.
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * @return el precio del preducto en decimal(double).
     */

    public double getPrecio() {
        return precio;
    }

    /**
     * @return un entero, que viene a ser la cantidad del producto.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @return un numero decimal(double), es el resultado de haber multiplicado el
     *         precio por la cantidad
     */

    public double getTotal() {
        return precio * cantidad;
    }

    /**
     * Metodo to string para imprimir por consola los atributos de los productos.
     */

    @Override
    public String toString() {
        return nombre + " - " + cantidad + " x " + precio + " = " + getTotal();
    }
}
