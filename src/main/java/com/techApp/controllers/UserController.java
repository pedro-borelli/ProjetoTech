package com.techApp.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

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

	@GetMapping("/{id_user}")
	public ResponseEntity<UserModel> findById(@PathVariable(value = "id_user") Long idUser){
		return repository.findById(idUser).map(resp -> ResponseEntity.status(200).body(resp)).orElseThrow( () -> new ResponseStatusException(HttpStatus.BAD_REQUEST,"Id não existe"));
	}
	
	@GetMapping("/email/{email_user}")
	public ResponseEntity<UserModel>findByEmail( @PathVariable(value = "email_user") String emailUser) {
		return repository.findByEmail(emailUser).map(resp -> ResponseEntity.status(200).body(resp)).orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST,"Email não existe"));
	
	}
	
	@PostMapping("/save") // /save --> rota para o verbo POST fazer a postagem
	public UserModel save( @Valid @RequestBody UserModel newUser) {
		return repository.save(newUser);
	}
	
	//save --> método para salvar a requisição do método
	// public UserModel é o retorno que vai mandar pra o Frontend
	// JSON --> transporte de dados com várias linguagens em comum
	
	@PutMapping("/update") // /update --> rota para o verbo PUT atualizar a requisição
	public UserModel update(@Valid @RequestBody UserModel newUser) {
		return repository.save(newUser);
	}
	
	@DeleteMapping("/{id_user}") // delete --> método que vai deletar o cadastro de um usuário pelo ID 
	public void delete(@PathVariable(value = "id_user") Long idUser) {
		repository.deleteById(idUser);
		}
	
}
