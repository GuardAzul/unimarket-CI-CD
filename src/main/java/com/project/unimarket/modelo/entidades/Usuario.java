package com.project.unimarket.modelo.entidades;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@DiscriminatorValue("Usuario")
public class Usuario extends Persona {
 
    private String direccion;
    private String telefono;

    @OneToMany(mappedBy = "usuario")
    private Compra compra;

    @OneToMany(mappedBy = "usuario")
    private Comentario comentario;

    @OneToMany(mappedBy = "usuario")
    private Producto producto;

    @OneToMany(mappedBy = "usuario")
    private Favorito favorito;
}
