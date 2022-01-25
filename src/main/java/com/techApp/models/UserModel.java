package com.techApp.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_users") // name é um parâmetro para colocar o nome da tabela 
public class UserModel {
	
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long idUser; // Long é a classe e long é a forma primitiva.
	private @NotBlank String name;
	private @NotBlank @Email String email;
	private @NotBlank @Size(min = 5) String password;
	private @SuppressWarnings("deprecation") Long rewards = new Long(0);
	
	// Relacionamento um para muitos 
	@OneToMany(mappedBy = "criador") // --> mapeando pela model principal
	private List<ProductModel> produtosCriados = new ArrayList<>();
	
	// Getters and Setters --> requisições
	
	public Long getIdUser() {
		return idUser;
	}
	
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public Long getRewards() {
		return rewards;
	}

	public void setRewards(Long rewards) {
		this.rewards = rewards;
	}

	public List<ProductModel> getProdutosCriados() {
		return produtosCriados;
	}

	public void setProdutosCriados(List<ProductModel> produtosCriados) {
		this.produtosCriados = produtosCriados;
	}
	
}
