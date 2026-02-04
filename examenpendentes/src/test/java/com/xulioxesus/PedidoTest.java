package com.xulioxesus;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PedidoTest {
    @Test
    void testAgregarProducto() {

       
        
       
    }

    @Test
    void testCalcularTotal() {
          Producto pr1= new Producto("lavadora", 700, 12);
          double resultado= pr1.getPrecio()*pr1.getCantidad();

          double total= pr1.getTotal();

          assertEquals(resultado, total);
          





    }
}
