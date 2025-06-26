package com.project.unimarket.modelo.entidades;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.project.unimarket.modelo.enums.Categoria;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
public class ProductoModerador implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @EqualsAndHashCode.Include
    private int id;

    private String motivo;

    @Column(name = "fecha", nullable = false, columnDefinition = "TIMESTAMP DeFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fecha;

    @ManyToOne
    @Column(name = "codigo_producto", nullable = false)
    private Producto producto;

    @ManyToOne
    @Column(name = "codigo_moderador", nullable = false)
    private Moderador moderador;

    @Enumerated(value = EnumType.STRING)
    private Categoria categoria;
}
