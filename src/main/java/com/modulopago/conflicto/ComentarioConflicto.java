package com.modulopago.conflicto;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.util.Date;

public class ComentarioConflicto {

    private Date fechaCreacionComentario;

    private String descripcionComentario;

    public ComentarioConflicto() {

    }

    public Date getFechaCreacionComentario() {
        return fechaCreacionComentario;
    }

    public void setFechaCreacionComentario(Date fechaCreacionComentario) {
        if (!DateUtils.isSameDay(fechaCreacionComentario, new Date())) {
            throw new IllegalArgumentException("La fecha de creación del comentario debe ser la fecha de hoy");
        }
        this.fechaCreacionComentario = fechaCreacionComentario;
    }

    public String getDescripcionComentario() {
        return descripcionComentario;
    }

    public void setDescripcionComentario(String descripcionComentario) {
        if (StringUtils.isEmpty(descripcionComentario)) {
            throw new IllegalArgumentException("La descripción del comentario no puede estar vacia");
        }
        this.descripcionComentario = descripcionComentario;
    }
}
