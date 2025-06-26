package com.project.unimarket.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.unimarket.modelo.entidades.Compra;

@Repository
public interface CompraRepo extends JpaRepository<Compra, Long> {
    // Aquí puedes agregar métodos personalizados si es necesario

}
