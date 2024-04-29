package com.sanjeeban.JWTExample.Controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanjeeban.JWTExample.Model.User;
import com.sanjeeban.JWTExample.Services.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
	
	
	@Autowired 
	private UserService userService;
	
	
	
	
	@GetMapping("/user")
	public List<User> getUser() {
		return this.userService.getUsers();
	}
	
	@GetMapping("/current-user")
	public String getLoggedInUser(Principal principal) {
		return principal.getName();
	}
	
	
	

}
