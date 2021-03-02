package com.generation.games.gamesvibe.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;



import com.generation.games.gamesvibe.model.Usuario;
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	public List<Usuario> findAllByNomeContainingIgnoreCase(String nome);
}