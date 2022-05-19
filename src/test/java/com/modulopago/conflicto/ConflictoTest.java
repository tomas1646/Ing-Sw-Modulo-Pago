package com.modulopago.conflicto;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ConflictoTest {

    @Test
    public void testSetDescripcion() {
        Conflicto conflicto = new Conflicto();
        conflicto.setDescripcion("Nueva Descripcion");
        assertEquals("Nueva Descripcion", conflicto.getDescripcion());
    }

    @Test
    public void testSetDescripcionVacia() {
        Conflicto conflicto = new Conflicto();
        assertThrows(IllegalArgumentException.class, () -> conflicto.setDescripcion(""));
    }

    @Test
    public void testSetDescripcionNula() {
        Conflicto conflicto = new Conflicto();
        assertThrows(IllegalArgumentException.class, () -> conflicto.setDescripcion(null));
    }

    @Test
    public void testSetFechaCreacion() {
        Conflicto conflicto = new Conflicto();
        Date fechaAAsignar = new Date();
        conflicto.setFechaCreacion(fechaAAsignar);
        assertEquals(fechaAAsignar, conflicto.getFechaCreacion());
    }

    @Test
    public void testSetFechaCreacionNula() {
        Conflicto conflicto = new Conflicto();
        assertThrows(IllegalArgumentException.class, () -> conflicto.setFechaCreacion(null));
    }

    @Test
    public void testSetAyerComoFechaCreacion() {
        Conflicto conflicto = new Conflicto();
        Date fechaHoy = new Date();
        Calendar fechaAyer = Calendar.getInstance();
        fechaAyer.setTime(fechaHoy);
        fechaAyer.add(Calendar.DAY_OF_MONTH, -1);
        assertThrows(IllegalArgumentException.class, () -> conflicto.setFechaCreacion(fechaAyer.getTime()));
    }

    @Test
    public void testSetManianaComoFechaCreacion() {
        Conflicto conflicto = new Conflicto();
        Date fechaHoy = new Date();
        Calendar fechaManiana = Calendar.getInstance();
        fechaManiana.setTime(fechaHoy);
        fechaManiana.add(Calendar.DAY_OF_MONTH, 1);
        assertThrows(IllegalArgumentException.class, () -> conflicto.setFechaCreacion(fechaManiana.getTime()));
    }
}