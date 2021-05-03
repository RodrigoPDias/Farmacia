package com.farmarcia.DrogariaBrasil.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmarcia.DrogariaBrasil.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	public List<Categoria> findAllByTituloContainingIgnoreCase (String titulo); 

}
