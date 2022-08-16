package com.modulopago.Cliente;

import java.util.UUID;

public class Cliente {
    private String numeroCliente;

    public Cliente() {
        UUID uuid = UUID.randomUUID();
        this.numeroCliente = "CL"+uuid.toString();
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }
    /*
    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }
    */
}
