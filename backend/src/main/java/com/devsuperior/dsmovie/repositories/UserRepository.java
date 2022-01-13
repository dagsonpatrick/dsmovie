package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entities.User;

/**
 * @author Dagson Souza
 *
 */
public interface UserRepository extends JpaRepository<User, Long>{

}
