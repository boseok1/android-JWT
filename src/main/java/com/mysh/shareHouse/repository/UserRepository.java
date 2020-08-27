package com.mysh.shareHouse.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mysh.shareHouse.model.User;

public interface UserRepository extends JpaRepository <User, Long>{
	
	User findByUsername(String username);
}
