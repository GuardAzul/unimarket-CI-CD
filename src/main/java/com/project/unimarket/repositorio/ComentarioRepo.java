package com.project.unimarket.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.unimarket.modelo.entidades.Comentario;

@Repository
public interface ComentarioRepo extends JpaRepository<Comentario, Integer>{
    
}
