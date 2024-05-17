package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.mvc.Entity.User;

@Controller
public class UserController {
	
	@GetMapping("/")
	public String getForm(Model model) {
		
		User userObj = new User();
		
		model.addAttribute("user", userObj);
		
		return"index";
	}
	
	@PostMapping("/register")
	public String HandleFormData( @Validated User userData ,  BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			return "index";
		}
		
		System.out.println(userData);
		
		model.addAttribute("msg", "Your Registration is Successful");
		
		return "Success";
	}

}
