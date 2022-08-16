package com.modulopago.ordendepago;
import org.junit.jupiter.api.Test;

import com.modulopago.ordendepago.EstadoOrdenDePago;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class EstadoOrdenDePagoTest {

    @Test
    public void testGetNombreEstadoOrdenDePago(){
        EstadoOrdenDePago estadoOrdenDePago=new EstadoOrdenDePago("Pendiente");
        assertNotNull("Pendiente",estadoOrdenDePago.getNombreEstadoOrdenDePago());
    }

    @Test
    public void testGetFechaCreacion(){
        EstadoOrdenDePago estadoOrdenDePago=new EstadoOrdenDePago("Pendiente");
        assertNotNull(estadoOrdenDePago.getFechaCreacion());
    }

    @Test
    public void testFechaFinVigencia(){
        EstadoOrdenDePago estadoOrdenDePago=new EstadoOrdenDePago("Pendiente");
        estadoOrdenDePago.setFechaFinVigencia();
        assertNotNull(estadoOrdenDePago.getFechaFinVigencia());
    }

}
