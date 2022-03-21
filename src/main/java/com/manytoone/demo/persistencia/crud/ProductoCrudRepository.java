package com.manytoone.demo.persistencia.crud;

import com.manytoone.demo.persistencia.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductoCrudRepository extends JpaRepository<Producto, Long> {
    List<Producto> findByIdCategoriaOrderByNombreAsc(Long idCategoria);
}
