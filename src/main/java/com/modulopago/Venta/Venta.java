package com.modulopago.Venta;

import java.util.UUID;

public class Venta {
    private String numeroVenta;
    private Float monto;

    public Venta() {
        UUID uuid = UUID.randomUUID();
        this.numeroVenta = "VE"+uuid.toString();
        this.monto=monto;
    }

    public String getNumeroVenta() {
        return numeroVenta;
    }

    /*
    public void setNumeroVenta(String numeroVenta) {
        this.numeroVenta = numeroVenta;
    }
    */

    public Float getMonto() {
        return monto;
    }

    public void setMonto(Float monto) {
        this.monto = monto;
    }
}
