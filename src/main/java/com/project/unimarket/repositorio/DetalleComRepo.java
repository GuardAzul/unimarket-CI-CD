package com.project.unimarket.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleComRepo extends JpaRepository<DetalleComRepo, Integer> {
    
}
