package com.project.unimarket.modelo.entidades;

import java.io.Serializable;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Favorito implements Serializable{
    
    @EmbeddedId
    @EqualsAndHashCode.Include
    private FavoritoId id;

    @ManyToOne
    @MapsId("codigoProducto")
    @JoinColumn(name = "codigo_producto", nullable = false)
    private Producto producto;

    @ManyToOne
    @MapsId("codigoUsuario")
    @JoinColumn(name = "codigo_usuario", nullable = false)
    private Usuario usuario;
}
