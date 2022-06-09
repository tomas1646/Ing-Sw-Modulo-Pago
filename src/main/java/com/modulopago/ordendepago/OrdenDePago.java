package com.modulopago.ordendepago;

public class OrdenDePago {

    private String numeroOrdenDePago;
    private String numeroVenta;
    private String numeroCliente;
    private String numeroEnvio;
    private float monto;

    public OrdenDePago(){

    }
    public OrdenDePago(String numeroOrdenDePago, String numeroVenta, String numeroCliente, String numeroEnvio, float monto) {
        this.numeroOrdenDePago = numeroOrdenDePago;
        this.numeroVenta = numeroVenta;
        this.numeroCliente = numeroCliente;
        this.numeroEnvio = numeroEnvio;
        this.monto = monto;
    }

    public String getNumeroOrdenDePago() {
        return numeroOrdenDePago;
    }

    public void setNumeroOrdenDePago(String numeroOrdenDePago) {
        this.numeroOrdenDePago = numeroOrdenDePago;
    }

    public String getNumeroVenta() {
        return numeroVenta;
    }

    public void setNumeroVenta(String numeroVenta) {
        this.numeroVenta = numeroVenta;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getNumeroEnvio() {
        return numeroEnvio;
    }

    public void setNumeroEnvio(String numeroEnvio) {
        this.numeroEnvio = numeroEnvio;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }
}