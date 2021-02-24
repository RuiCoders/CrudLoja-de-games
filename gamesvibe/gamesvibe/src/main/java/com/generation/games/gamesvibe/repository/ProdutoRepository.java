package com.generation.games.gamesvibe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.games.gamesvibe.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<ProdutoRepository> findAllByNomeProdutoContainingIgnoreCase(String nomeProduto);
}
