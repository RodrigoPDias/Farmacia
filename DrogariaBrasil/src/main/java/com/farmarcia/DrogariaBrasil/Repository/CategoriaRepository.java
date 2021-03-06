package com.farmarcia.DrogariaBrasil.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmarcia.DrogariaBrasil.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

	public List<Categoria> findAllByTituloContainingIgnoreCase (String titulo); 

}
