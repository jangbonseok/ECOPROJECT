package com.cos.blog.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.blog.medel.RoleType;
import com.cos.blog.medel.User;
import com.cos.blog.repository.UserRepository;

@RestController
public class DummyControllerTest {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/dummy/join")
	public String join(User user) {
		// key = value
			System.out.println(user.getId());
			System.out.println(user.getUsername());
			System.out.println(	user.getPasswd());
			System.out.println(user.getEmail());
			System.out.println(user.getRole());
			System.out.println(user.getCreateDate());
			
			user.setRole(RoleType.USER);
			userRepository.save(user);
		return "회원가입 완료";
	}
}
