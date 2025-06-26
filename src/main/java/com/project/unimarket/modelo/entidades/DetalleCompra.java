package com.project.unimarket.modelo.entidades;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class DetalleCompra implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    private int cantidad;

    @Column(name = "precio_producto", nullable = false)
    private double precioUnitario;

    @ManyToOne
    @Column(name = "codigo_compra", nullable = false)
    private Compra compra;

    @ManyToOne
    @Column(name = "codigo_producto", nullable = false)
    private Producto producto;

}
