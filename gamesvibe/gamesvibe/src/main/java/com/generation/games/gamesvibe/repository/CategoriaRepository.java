package com.generation.games.gamesvibe.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import com.generation.games.gamesvibe.model.Categoria;

@RequestMapping
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	public List<Categoria> findAllByNomeCategoriaContainingIgnoreCase(String nomeCategoria);

}