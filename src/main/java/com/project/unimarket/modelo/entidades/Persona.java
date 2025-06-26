package com.project.unimarket.modelo.entidades;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@Inheritance
@NoArgsConstructor
@DiscriminatorColumn(name = "rol")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Persona implements Serializable{
    
    @Id
    @EqualsAndHashCode.Include
    private String cedula;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(name = "e-mail", nullable = false, length = 50)
    private String email;

    @Column(nullable = false)
    private String password;
}
