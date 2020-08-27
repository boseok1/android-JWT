package com.mysh.shareHouse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class IndexController {

	@GetMapping({"", "/"})
	public String findInterview() {
		return "안녕";
	}
}
