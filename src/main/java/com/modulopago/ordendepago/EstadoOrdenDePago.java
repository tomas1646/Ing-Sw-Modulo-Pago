package com.modulopago.ordendepago;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EstadoOrdenDePago {
    private String nombreEstadoOrdenDePago;
    private Date fechaCreacion;
    private Date fechaFinVigencia;

    public EstadoOrdenDePago(String nombreEstadoOrdenDePago){
        this.nombreEstadoOrdenDePago=nombreEstadoOrdenDePago;
        SimpleDateFormat dtf = new SimpleDateFormat("yyyy/MM/dd");
        Calendar calendar = Calendar.getInstance();
        this.fechaCreacion=calendar.getTime();
        this.fechaFinVigencia=null;
    }

    public String getNombreEstadoOrdenDePago() {
        return nombreEstadoOrdenDePago;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public Date getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    /*

    CREO QUE NO VAN, NO SE PUEDE CAMBIAR ESTO

    public void setNombreEstadoOrdenDePago(String nombreEstadoOrdenDePago) {
        this.nombreEstadoOrdenDePago = nombreEstadoOrdenDePago;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    */

    public void setFechaFinVigencia() {
        SimpleDateFormat dtf = new SimpleDateFormat("yyyy/MM/dd");
        Calendar calendar = Calendar.getInstance();
        this.fechaFinVigencia = calendar.getTime();
    }
}
