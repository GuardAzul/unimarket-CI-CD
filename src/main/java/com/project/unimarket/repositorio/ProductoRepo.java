package com.project.unimarket.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.unimarket.modelo.entidades.Producto;

@Repository
public interface ProductoRepo extends JpaRepository<Producto, Integer>{
    
}
