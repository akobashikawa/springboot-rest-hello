package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {

	@GetMapping("/hola")
	public String hello(@RequestParam(value="name", defaultValue="World") String name) {
		return String.format("Hola %s!", name);
	}
}
