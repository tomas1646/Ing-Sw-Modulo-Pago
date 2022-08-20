package com.modulopago.conflicto;

import com.modulopago.Cliente.Cliente;
import com.modulopago.Envio.Envio;
import com.modulopago.Venta.Venta;
import com.modulopago.ordendepago.OrdenDePago;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class ConflictoTest {

    @Test
    public void testCrearConflictoDescripcionVacia() {
        OrdenDePago ordenDePago = new OrdenDePago(new Venta(), new Cliente(), new Envio());
        assertThrows(IllegalArgumentException.class, () -> new Conflicto(ordenDePago, ""));
    }

    @Test
    public void testCrearConflictoDescripcionNula() {
        OrdenDePago ordenDePago = new OrdenDePago(new Venta(), new Cliente(), new Envio());
        assertThrows(IllegalArgumentException.class, () -> new Conflicto(ordenDePago, null));
    }

    @Test
    public void testGetFechaCreacion() {
        OrdenDePago ordenDePago = new OrdenDePago(new Venta(), new Cliente(), new Envio());
        Conflicto conflicto = new Conflicto(ordenDePago, "Descripcion");
        assertEquals(Date.class, conflicto.getFechaCreacion().getClass());
    }

    @Test
    public void testOrdenDePagoAsignada() {
        OrdenDePago ordenDePago = new OrdenDePago(new Venta(), new Cliente(), new Envio());
        Conflicto conflicto = new Conflicto(ordenDePago, "Descripcion");
        assertEquals(ordenDePago, conflicto.getOrdenDePago());
    }
}