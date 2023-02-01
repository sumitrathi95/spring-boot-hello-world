package com.example.hello.controller;
import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String getHello(Model model) {
		Date d = new Date();
		model.addAttribute("hello","Hello All Users");
		System.out.println(d.toString());
		System.out.println("Siddesh and Vrushali and Sumit");
		return "hello";
	}
}
