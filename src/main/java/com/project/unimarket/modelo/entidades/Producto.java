package com.project.unimarket.modelo.entidades;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import com.project.unimarket.modelo.enums.Categoria;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Producto implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @EqualsAndHashCode.Include
    private int id;

    private String nombre;
    private int unidades;
    private String descripcion;
    private double precio;
    private boolean activo;

    @Enumerated(value = EnumType.STRING)
    private List<Categoria> categoria;

    @Column(name = "fecha_creado", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime fechaCreacion;

    @Column(name = "fecha_limite", nullable = false, columnDefinition = "TIMESTAMP")
    private LocalDateTime fechaLimite;

    @OneToMany(mappedBy = "producto")
    private DetalleCompra detalleCompra;

    @OneToMany(mappedBy = "producto")
    private Comentario comentario;

    @ManyToOne
    @Column(name = "codigo_vendedor", nullable = false)
    private Usuario usuario;

    @OneToMany(mappedBy = "producto")
    private ProductoModerador productoModerador;

    @OneToMany(mappedBy = "producto")
    private Imagen imagen;

    @OneToMany(mappedBy = "producto")
    private Favorito favorito;
}
