package com.project.unimarket.modelo.entidades;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
@DiscriminatorValue("Moderador")
public class Moderador extends Persona {

    public Moderador() {
        super();
    }

    // Aquí puedes agregar métodos específicos para la clase Moderador si es necesario
    @OneToMany(mappedBy = "moderador")
    private ProductoModerador productoModerador;
}
