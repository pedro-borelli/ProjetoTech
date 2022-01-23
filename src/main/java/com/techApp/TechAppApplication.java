package com.techApp;

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

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

/* Projeto App Tech -->  Criação de um servidor web para um aplicativo */

// Dependências : Spring web --> responsável por criar um ambiente web para o funcionamento do servidor;

/* Spring Data Jpa --> responsável por passar as diretrizes que transformam os dados java em tabela no banco de dados */
/* MySQL Driver --> cria a conexão pelo driver do banco de dados específico que esta sendo utilizado no projeto*/
/* DevTools --> serve para rodar a aplicação em looping a cada atualização feita*/
/*  */

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

/* Construção do projeto em ordem :

// Application.properties --> configurar os dados url para rodar a aplicação vinculando com o banco de dados:
 
// spring.jpa.hibernate.ddl-auto=update --> fala qual tipo de acesso que o java tem com o banco de dados, 

// Update --> no caso é a função aonde o Hibernate altera o bd de acordo com as estruturas de entidades fornecidas;

/* spring.datasource.url=jdbc:mysql://localhost/techApp?createDatabaseIfNotExist=true&serverTimezone=UTC&useSSl=false (Url);
  
   spring.datasource.username=root --> nome do usuário do banco de dados;
		
   spring.datasource.password=pedro1905 --> senha do usuário do banco de dados;
			 	
   spring.jpa.show-sql=true --> anotar no console as alterações feitas no aplicação spring */

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

/* Model, Domain ou Entity --> são as entidades do banco de dados, classes e atributos que vão representar tabelas e colunas do banco */

// @Entity --> cria a tabela no bd e o @Table --> serve para renomear a tabela
// javaxpersistense --> avisa o que precisa escrever dentro do java para que seja transformado dentro do banco.
// @GeneratedValue(strategy = GenerationType.IDENTITY) --> comando para auto incrementação.
// @Id --> o Hibernate vai entender que é uma chave primária 

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

/* Repository --> Interface que implementa todos os métodos CRUD */

// @Repository --> uma boa prática, um indicador que mostra que a classe vai trabalhar com persistência de dados.

//Http Methods --> Métodos CRUD --> GET,POST,PUT,DELETE (pegar,postar ou colocar, atualizar e deletar)

//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//

/* Controller ou Resource --> controlador que recebe requisições dos verbos CRUD do repositório e retorna responses para aquele determinado usuário que realiza solicitações no servidor */

// @RestController --> indica para o spring que o controlador está apto para receber requisições e devolver responses(respostas)
// @RequestMapping --> serve para mapear o endereço do endpoint 
// endpoint --> ponto final da aplicação, é daí em diante que é solicitado os métodos CRUD
// @Autowired --> injeção de dependência do repositório dentro do controller habilitando assim o uso dos métodos CRUD.
// @RequestBody --> serve para pegar dentro do corpo da requisição o método que está sendo passado por linha de código.
// @PathVariable --> é obter algum espaço reservado no URI (o Spring chama-se Modelo de URI)
// @ResponseEntity --> serve para passar uma resposta ou retorno para o usuário
// map é para mapear, findById --> buscar por ID, status, httpStatus, ok ou orelsethow são métodos de responsividade para 
// requisições que vão ser feitas pelo usuáro no sistema.
// Optional --> uma biblioteca é como uma resposta if else.
// isPresent --> para confirmar se algo é existente e isEmpty --> se algo é ausente ou vazio na requisição.
// findByContaining --> query method para pegar alguma requisição pela variável declarada como um nome ou email.



//-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------//



// Status Code 
// Api Rest 
// Http Methods --> Métodos CRUD --> GET,POST,PUT,DELETE (pegar,postar ou colocar, atualizar e deletar)

