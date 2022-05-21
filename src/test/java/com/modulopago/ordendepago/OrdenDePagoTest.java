package com.modulopago.ordendepago;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrdenDePagoTest {

    @Test
    public void testGetNumeroOrdenDePago() {
        OrdenDePago ordenDePago = new OrdenDePago("PA93003", "VE89344", "CL40123", "EN6793", 560020);
        assertEquals("PA93003", ordenDePago.getNumeroOrdenDePago());
    }

    @Test
    public void testGetNumeroVenta() {
        OrdenDePago ordenDePago = new OrdenDePago("PA93003", "VE89344", "CL40123", "EN6793", 560020);
        assertEquals("VE89344", ordenDePago.getNumeroVenta());
    }

    @Test
    public void testGetNumeroCliente() {
        OrdenDePago ordenDePago = new OrdenDePago("PA93003", "VE89344", "CL40123", "EN6793", 560020);
        assertEquals("CL40123", ordenDePago.getNumeroCliente());
    }

    @Test
    public void testGetNumeroEnvio() {
        OrdenDePago ordenDePago = new OrdenDePago("PA93003", "VE89344", "CL40123", "EN6793", 560020);
        assertEquals("EN6793", ordenDePago.getNumeroEnvio());
    }

    @Test
    public void testGetMonto() {
        OrdenDePago ordenDePago = new OrdenDePago("PA93003", "VE89344", "CL40123", "EN6793", 560020);
        assertEquals(560020, ordenDePago.getMonto());
    }
}