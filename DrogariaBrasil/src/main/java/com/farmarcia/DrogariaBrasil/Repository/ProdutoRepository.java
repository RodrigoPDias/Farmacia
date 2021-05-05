package com.farmarcia.DrogariaBrasil.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farmarcia.DrogariaBrasil.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	public List<Produto> findAllByDescricaoContainingIgnoreCase (String descricao); 

}
