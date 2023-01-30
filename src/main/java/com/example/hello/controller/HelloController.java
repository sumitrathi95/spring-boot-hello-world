package com.example.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String getHello(Model model) {
		Date date = new Date();
		model.addAttribute("hello","Hello All Users");
		System.out.println("[" + date.toString() + "] " + string);
		return "hello";
	}
}
