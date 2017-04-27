package com.library.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.library.book.domain.User;
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	
	

}
