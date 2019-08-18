package com.invillia.dockerjava.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.invillia.dockerjava.entity.User;
import com.invillia.dockerjava.service.UserService;


@RestController
@RequestMapping("/usuario")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping
	@CrossOrigin(origins = "*")
	@ResponseStatus(value = HttpStatus.OK)
	public List<User> getUsuarios(){
		return userService.list();
	}
	
	@PostMapping
	@ResponseStatus(value=HttpStatus.CREATED)
	public URI createRecurso(@RequestBody User usuario) throws URISyntaxException {
		User user = userService.save(usuario);
		return new URI("/usuario/" +user.getId().toString());
	}
	
	@GetMapping("{/idUsuario}")
	@ResponseStatus(value = HttpStatus.OK)
	public User getUsuario(@PathVariable("idUsuario") Long idUsuario ){
		return userService.findUserById(idUsuario);
	}
}
