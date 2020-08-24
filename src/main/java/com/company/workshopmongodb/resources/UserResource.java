package com.company.workshopmongodb.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.company.workshopmongodb.domain.User;

@RestController
@RequestMapping (value = "/users")
public class UserResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity <List<User>> findAll() {
		User maria = new User(1, "Maria", "maria@gmail.com.br");
		User pedro = new User(2, "Pedro", "pedro@gmail.com.br");
		User carlos = new User(3, "Carlos", "carlos@gmail.com.br");
		
		List <User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, pedro, carlos));
		return ResponseEntity.ok().body(list);
	}

}
