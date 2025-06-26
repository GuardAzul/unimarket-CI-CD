package com.project.unimarket.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.unimarket.modelo.entidades.Favorito;
import com.project.unimarket.modelo.entidades.FavoritoId;

@Repository
public interface FavoritoRepo extends JpaRepository<Favorito, FavoritoId> {
    
    // Aquí puedes agregar métodos personalizados si es necesario
    // Por ejemplo, para buscar favoritos por usuario o producto, etc.
    
}
