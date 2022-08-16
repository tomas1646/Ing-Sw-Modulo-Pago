package com.modulopago.Envio;

import java.util.UUID;

public class Envio {
    String numeroEnvio;

    public Envio() {
        UUID uuid = UUID.randomUUID();
        this.numeroEnvio = "EN"+uuid.toString();
    }

    public String getNumeroEnvio() {
        return numeroEnvio;
    }

    /*
    public void setNumeroEnvio(String numeroEnvio) {
        this.numeroEnvio = numeroEnvio;
    }
     */
}
