package com.cos.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.blog.medel.RoleType;
import com.cos.blog.medel.User;
import com.cos.blog.repository.UserRepository;

//IOC
@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder encoder;

	@Transactional
	public void 회원가입(User user) {
		String rawPasswd = user.getPasswd(); //원문
		String encPasswd = encoder.encode(rawPasswd); //hash
		user.setPasswd(encPasswd);
		user.setRole(RoleType.USER);
		userRepository.save(user);
	}

}
