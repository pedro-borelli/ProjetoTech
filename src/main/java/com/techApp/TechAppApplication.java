package com.techApp;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TechAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechAppApplication.class, args);
	}

}

// O que é Spring Boot? 

/* O Spring é um framework java open source para facilitar o desenvolvimento de aplicações corporativas, 
 baseado nos padrões de projeto de inversão de controle e injeção de dependência */

// Projeto App Tech -->  Criação de um servidor web para um aplicativo */

// Dependências : Spring web --> responsável por criar um ambiente web para o funcionamento do servidor;

/* Spring Data Jpa --> responsável por passar as diretrizes que transformam os dados java em tabela no banco de dados */
/* MySQL Driver --> cria a conexão pelo driver do banco de dados específico que esta sendo utilizado no projeto*/
/* DevTools --> serve para rodar a aplicação em looping a cada atualização feita*/
/*  */

// Construção do projeto em ordem :

// Application.properties --> configurar os dados url para rodar a aplicação vinculando com o banco de dados:
 
// spring.jpa.hibernate.ddl-auto=update --> fala qual tipo de acesso que o java tem com o banco de dados, 

// Update --> no caso é a função aonde o Hibernate altera o bd de acordo com as estruturas de entidades fornecidas;

/* spring.datasource.url=jdbc:mysql://localhost/techApp?createDatabaseIfNotExist=true&serverTimezone=UTC&useSSl=false (Url);
  
   spring.datasource.username=root --> nome do usuário do banco de dados;
		
   spring.datasource.password=pedro1905 --> senha do usuário do banco de dados;
			 	
   spring.jpa.show-sql=true --> anotar no console as alterações feitas no aplicação spring */

/* Model, Domain ou Entity --> são as entidades do banco de dados, classes e atributos que vão representar tabelas e colunas do banco */

/* @Entity --> cria a tabela no bd e o @Table --> serve para renomear a tabela */ 
// javaxpersistense --> avisa o que precisa escrever dentro do java para que seja transformado dentro do banco.
/* @GeneratedValue(strategy = GenerationType.IDENTITY) --> comando para auto incrementação.
// @Id --> o Hibernate vai entender que é uma chave primária 






/* Repository */
/* Controller ou Resource */
/*  */
/*  */
/*  */


// Status Code 
// Api Rest 
// 

