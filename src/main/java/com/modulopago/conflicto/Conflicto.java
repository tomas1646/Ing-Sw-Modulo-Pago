package com.modulopago.conflicto;

import com.modulopago.ordendepago.OrdenDePago;
import org.apache.commons.lang3.StringUtils;

import java.util.Date;

public class Conflicto {
    private Date fechaCreacion;
    private String descripcion;
    private OrdenDePago ordenDePago;

    public Conflicto(OrdenDePago ordenDePago, String descripcion){
        if (StringUtils.isEmpty(descripcion)) {
            throw new IllegalArgumentException("La descripción no puede estar vacia");
        }
        this.ordenDePago = ordenDePago;
        this.descripcion = descripcion;
        this.fechaCreacion = new Date();
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public OrdenDePago getOrdenDePago() {
        return this.ordenDePago;
    }
}
