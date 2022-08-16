package com.modulopago.ordendepago;
import com.modulopago.Cliente.Cliente;
import com.modulopago.Envio.Envio;
import com.modulopago.Venta.Venta;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrdenDePagoTest {

    @Test
    public void testGetNumeroOrdenDePago() {
        OrdenDePago ordenDePago = new OrdenDePago(new Venta(),new Cliente(),new Envio());
        assertNotNull(ordenDePago.getNumeroOrdenDePago());
    }

    @Test
    public void testGetNumeroVenta(){
        Venta venta=new Venta();
        OrdenDePago ordenDePago = new OrdenDePago(venta,new Cliente(),new Envio());
        assertEquals(venta.getNumeroVenta(),ordenDePago.getNumeroVenta());
    }

    @Test
    public void testGetNumeroCliente() {
        Cliente cliente=new Cliente();
        OrdenDePago ordenDePago = new OrdenDePago(new Venta(),cliente,new Envio());
        assertEquals(cliente.getNumeroCliente(), ordenDePago.getNumeroCliente());
    }

    @Test
    public void testGetNumeroEnvio() {
        Envio envio=new Envio();
        OrdenDePago ordenDePago = new OrdenDePago(new Venta(),new Cliente(),envio);
        assertEquals(envio.getNumeroEnvio(), ordenDePago.getNumeroEnvio());
    }

    @Test
    public void testGetMonto() {
        Venta venta=new Venta();
        venta.setMonto((float)560020);
        OrdenDePago ordenDePago = new OrdenDePago(venta,new Cliente(),new Envio());
        assertEquals(venta.getMonto(), ordenDePago.getMonto());
    }

    @Test
    public void testGetEstadoOrdenPago(){
        OrdenDePago ordenDePago = new OrdenDePago(new Venta(),new Cliente(),new Envio());
        assertEquals("Pendiente",ordenDePago.getEstadoOrdenDePago());
    }

    @Test
    public void testSetEstadoOrdenPago(){
        OrdenDePago ordenDePago = new OrdenDePago(new Venta(),new Cliente(),new Envio());
        ordenDePago.setEstadoOrdenDePago("Autorizado");
        assertEquals("Autorizado",ordenDePago.getEstadoOrdenDePago());
    }
}