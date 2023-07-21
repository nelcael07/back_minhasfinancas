package com.nelcael.minhasfinancas.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nelcael.minhasfinancas.model.entity.Usuario;

public interface UsuarioRespository extends JpaRepository<Usuario, Long>{
	
	boolean existByEmail(String email);
}
