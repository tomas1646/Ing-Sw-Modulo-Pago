package com.modulopago.conflicto;

import com.modulopago.ordendepago.OrdenDePago;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class Conflicto {
    private Date fechaCreacion;
    private String descripcion;
    private OrdenDePago ordenDePago;

    public Conflicto() {
    }

    public Conflicto(OrdenDePago ordenDePago) {
        this.ordenDePago = ordenDePago;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        if (!DateUtils.isSameDay(fechaCreacion, new Date())) {
            throw new IllegalArgumentException("La fecha de creación debe ser la fecha de hoy");
        }
        this.fechaCreacion = fechaCreacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (StringUtils.isEmpty(descripcion)) {
            throw new IllegalArgumentException("La descripción no puede estar vacia");
        }
        this.descripcion = descripcion;
    }

    public OrdenDePago getOrdenDePago() {
        return this.ordenDePago;
    }
}
