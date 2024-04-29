package com.sanjeeban.JWTExample.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.sanjeeban.JWTExample.Model.User;

@Service
public class UserService {
	
	private List<User> store = new ArrayList<>();
	
	public UserService() {
		store.add(new User(UUID.randomUUID().toString(),"Sanjeeban","sanjeeban.dev.com"));
		store.add(new User(UUID.randomUUID().toString(),"Harry","harry.dev.com"));
		store.add(new User(UUID.randomUUID().toString(),"Ross","ross.dev.com"));
		store.add(new User(UUID.randomUUID().toString(),"Rachael","rachael.dev.com"));
		store.add(new User(UUID.randomUUID().toString(),"Joey","joey.dev.com"));

	}
	
	public List<User> getUsers(){
		return store;
	}
}
