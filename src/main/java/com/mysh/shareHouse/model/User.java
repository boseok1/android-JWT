package com.mysh.shareHouse.model;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String username;
	private String password;
	private int active;
	private String roles = "";
	private String permissions = " ";
	
	public User(String username, String password, String roles, String permissions) {
		this.username = username;
		this.password = password;
		this.roles = roles;
		this.permissions = permissions;
		this.active = 1 ;
	}
		protected User() {
		}

		public long getId() {
			return id;
		}

		public String getUsername() {
			return username;
		}

		public String getPassword() {
			return password;
		}

		public int getActive() {
			return active;
		}

		public String getRoles() {
			return roles;
		}

		public String getPermissions() {
			return permissions;
		}

		// ENUM 사용 X → 콤마로 구분해서 ROLE 입력 후 파싱할 것!
		public List<String> getRoleList() {
			if (this.roles.length() > 0) {
				return Arrays.asList(this.roles.split(","));
			}
			return new ArrayList<>();
		}

		public List<String> getPermissionList() {
			if (this.permissions.length() > 0) {
				return Arrays.asList(this.permissions.split(","));
			}
			return new ArrayList<>();
		}
	

	}
	
	
