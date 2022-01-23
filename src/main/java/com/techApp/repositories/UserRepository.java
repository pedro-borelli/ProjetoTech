package com.techApp.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techApp.models.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Long> {

	Optional<UserModel> findByEmail(String emailUser);
	// query method , utiliza a classe JpaRepository e sobreescreve o método findBy utilizando uma coluna específica.
	// escrever da mesma forma que tem na Model só que em camalCase
	

}


// Extendendo a ferramenta JpaRepository para implementar os métodos CRUD, <T --> entidade , ID --> tipo da chave primária>
// Quando você extende a funcionalidade significa que você está pegando uma herança ou seja os métodos já estão prontos e só vão ser herdados.
// Implements --> além de implementar e herdar, o método precisa ser sobreescrito.