package com.devmiguel.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmiguel.userdept.entities.User;

//obejtos para acessar dados de uma entidade nesse caso a entidade user
public interface UserRepository extends JpaRepository<User, Long> {

}
