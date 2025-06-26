package com.project.unimarket.modelo.enums;

public enum MedioPago {
    
    EFECTIVO("Efectivo"),
    TARJETA_DEBITO("Tarjeta de Débito"),
    TARJETA_CREDITO("Tarjeta de Crédito");

    private final String descripcion;

    MedioPago(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
