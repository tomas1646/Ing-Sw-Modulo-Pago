package com.modulopago.ordendepago;

import com.modulopago.Cliente.Cliente;
import com.modulopago.Envio.Envio;
import com.modulopago.Venta.Venta;
//import com.modulopago.ordendepago.EstadoOrdenDePago;
import java.util.UUID;

public class OrdenDePago {

    private String numeroOrdenDePago;

    private Cliente cliente;
    private Venta venta;
    private Envio envio;
    private EstadoOrdenDePago estadoOrdenDePago;

    /*
    No tiene constructor por defecto
    public OrdenDePago(){

    }
    */

    public OrdenDePago(Venta venta, Cliente cliente, Envio envio) {
        UUID uuid = UUID.randomUUID();
        this.numeroOrdenDePago = "PA"+uuid.toString();
        this.venta = venta;
        this.cliente = cliente;
        this.envio = envio;
        this.estadoOrdenDePago= new EstadoOrdenDePago("Pendiente");
    }

    public String getNumeroOrdenDePago() {
        return numeroOrdenDePago;
    }

    private void setNumeroOrdenDePago(String numeroOrdenDePago) {
        this.numeroOrdenDePago = numeroOrdenDePago;
    } // Deberia ser privado en caso de existir dicho metodo, no parece muy correcto que sea modificable

    public String getNumeroVenta() {
        return venta.getNumeroVenta();
    }
    /*
    No lo pondria porque estarias modificando otro objeto

    public void setNumeroVenta(String numeroVenta) {
        this.numeroVenta = numeroVenta;
    }
    */
    public String getNumeroCliente() {
        return cliente.getNumeroCliente();
    }

    /*
    No lo pondria porque estarias modificando otro objeto

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }
    */

    public String getNumeroEnvio() {
        return envio.getNumeroEnvio();
    }

    /*
    No lo pondria porque estarias modificando otro objeto

    public void setNumeroEnvio(String numeroEnvio) {
        this.numeroEnvio = numeroEnvio;
    }
    */

    public float getMonto() {
        return venta.getMonto();
    }

    /*
    No lo pondria porque estarias modificando otro objeto

    public void setMonto(float monto) {
        this.monto = monto;
    }
    */

    public String getEstadoOrdenDePago() {
        return estadoOrdenDePago.getNombreEstadoOrdenDePago();
    }

    public void setEstadoOrdenDePago(String estadoOrdenDePago) {
        this.estadoOrdenDePago = new EstadoOrdenDePago(estadoOrdenDePago);
    }
}