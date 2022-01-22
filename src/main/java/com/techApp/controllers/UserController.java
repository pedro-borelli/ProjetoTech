package com.techApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techApp.models.UserModel;
import com.techApp.repositories.UserRepository;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

	private @Autowired UserRepository repository;
	
	@GetMapping("/all") // /all --> rota para o verbo GET fazer a busca
	public List<UserModel> findall() {
		return repository.findAll();
	}
	
	//find all --> método que busca todas as extensões dentro do repositorio

	@PostMapping("/save") // /save --> rota para o verbo POST fazer a postagem
	public UserModel save(@RequestBody UserModel newUser) {
		return repository.save(newUser);
	}
	
	//save --> método para salvar a requisição do método
	// public UserModel é o retorno que vai mandar pra o Frontend
	// JSON --> transporte de dados com várias linguagens em comum
	
	@PutMapping("/update") // /update --> rota para o verbo PUT atualizar a requisição
	public UserModel update(@RequestBody UserModel newUser) {
		return repository.save(newUser);
	}
	
	@DeleteMapping("/{id_user}") // delete --> método que vai deletar o cadastro de um usuário pelo ID 
	public void delete(@PathVariable(value = "id_user") Long idUser) {
		repository.deleteById(idUser);
		}
	
}
