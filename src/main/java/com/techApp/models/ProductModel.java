package com.techApp.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_products")
public class ProductModel {
	
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long idProduct;
	private String product;
	private String description;
	private String dots;
	private String urlImage;
	private @SuppressWarnings("deprecation") Long inventory = new Long(0);
	private @SuppressWarnings("deprecation") Float value = new Float(0.00);
	
	//Relacionamento muitos pra um
	@ManyToOne
	private UserModel criador;
	
	public Long getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(Long idProduct) {
		this.idProduct = idProduct;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDots() {
		return dots;
	}
	public void setDots(String dots) {
		this.dots = dots;
	}
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	public Long getInventory() {
		return inventory;
	}
	public void setInventory(Long inventory) {
		this.inventory = inventory;
	}
	public Float getValue() {
		return value;
	}
	public void setValue(Float value) {
		this.value = value;
	}
	public UserModel getCriador() {
		return criador;
	}
	public void setCriador(UserModel criador) {
		this.criador = criador;
	}
	

}

