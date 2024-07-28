package com.devmiguel.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.devmiguel.userdept.entities.User;
import com.devmiguel.userdept.repositories.UserRepository;

//controler é umn objeto responsavel por receber e responder as requestes http
@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	//Isso é um endpoint para achar todos os usuarios
	@GetMapping
	public List<User> findAll() {
		List<User> resultado = repository.findAll();
		return resultado;
	}
	//endpoint usuario por id
	@GetMapping(value = "/{id}")
	public User findById(@PathVariable Long id) {
		User resultado = repository.findById(id).get();
		return resultado;
	}
	//Inserir um usuario 
	@PostMapping
	public User insert(@RequestBody User user) {
		User resultado = repository.save(user);
		return resultado;
	}
}
