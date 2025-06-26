package com.project.unimarket.modelo.entidades;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Comentario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @EqualsAndHashCode.Include
    private int id;

    private String mensaje;

    @Column(name = "fecha_creacion", nullable = false, columnDefinition = "TIMESTAMP")
    private LocalDateTime fechaCreacion;

    @ManyToOne
    @Column(name = "codigo_producto", nullable = false)
    private Producto producto;

    @ManyToOne
    @Column(name = "codigo_usuario", nullable = false)
    private Usuario usuario;
}
