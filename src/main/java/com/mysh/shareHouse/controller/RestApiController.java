package com.mysh.shareHouse.controller;

import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.mysh.shareHouse.model.User;
import com.mysh.shareHouse.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1")
public class RestApiController {
	
	private final UserRepository userRepository;
	private final  BCryptPasswordEncoder  bCryptPasswordEncoder;
	
	@GetMapping("home")	
	public String home() {
		return "<h1>home</h1>";
	}
	
	@GetMapping("admin/users")
	public List<User> users(){
		return null;
	}
	
	@PostMapping("join")
	public String join(@RequestBody User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setRoles("ROLE_USER");
		userRepository.save(user);
		return "회원가입완료";		
	}
	                     
}

