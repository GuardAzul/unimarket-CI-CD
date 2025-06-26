package com.project.unimarket.repositorio;

import org.springframework.stereotype.Repository;

import com.project.unimarket.modelo.entidades.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UsuarioRepo extends JpaRepository<Persona, String> {
    
}
