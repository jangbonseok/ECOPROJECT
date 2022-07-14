package com.cos.blog.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cos.blog.medel.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	//SELECT*FROM user WHERE username =1?;
	Optional<User> findByUsername(String username);
}


//JPA Naming 전략
	//SELECT*FROM user WHERE username = ? AND passwd =?;
	//User findByUsernameAndPasswd(String username, String passwd);