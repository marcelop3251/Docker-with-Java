package com.invillia.dockerjava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invillia.dockerjava.entity.Usuario;
import com.invillia.dockerjava.repository.UsuariosRepository;

@Service
public class UsuariosService {

	@Autowired
	private UsuariosRepository repository;

	public List<Usuario> list() {			
		return repository.findAll();
	}

	public Usuario save(Usuario usuario) {
		return repository.save(usuario);
	}

	public Usuario findUserById(Long idUsuario) {
		return repository.findById(idUsuario).orElseThrow(() -> new RuntimeException("User Not Found"));
	}
	
}
