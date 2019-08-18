package com.invillia.dockerjava.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.invillia.dockerjava.entity.Usuario;
import com.invillia.dockerjava.service.UsuariosService;


@RestController
@RequestMapping("/usuario")
public class UsuariosController {

	@Autowired
	private UsuariosService usuariosService;
	
	@GetMapping
	@CrossOrigin(origins = "*")
	@ResponseStatus(value = HttpStatus.OK)
	public List<Usuario> getUsuarios(){
		return usuariosService.list();		
	}
	
	@PostMapping
	@ResponseStatus(value=HttpStatus.CREATED)
	public URI createRecurso(@RequestBody Usuario usuario) throws URISyntaxException {
		Usuario user = usuariosService.save(usuario);
		return new URI("/usuario/" +user.getId().toString());
	}
	
	@GetMapping("{/idUsuario}")
	@ResponseStatus(value = HttpStatus.OK)
	public Usuario getUsuario(@PathVariable("idUsuario") Long idUsuario ){
		return usuariosService.findUserById(idUsuario);		
	}
}
