package com.manytoone.demo.persistencia.crud;

import com.manytoone.demo.persistencia.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaCrudRepository extends JpaRepository<Categoria, Long> {
}
