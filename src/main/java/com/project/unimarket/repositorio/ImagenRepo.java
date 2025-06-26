package com.project.unimarket.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.unimarket.modelo.entidades.Imagen;

@Repository
public interface ImagenRepo extends JpaRepository<Imagen, Integer> {
    
    // Aquí puedes agregar métodos personalizados si es necesario
    // Por ejemplo, para buscar imágenes por producto, etc.
    
}
