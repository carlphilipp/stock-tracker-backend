package fr.cph.stock.backend;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@RequestMapping(value = "/users", produces = "application/json")
	public ResponseEntity<String> getUsers() {
		return new ResponseEntity<>("{\"users\":[{\"firstname\":\"Richard\", \"lastname\":\"Feynman\"}," +
				"{\"firstname\":\"Marie\",\"lastname\":\"Curie\"}]}", HttpStatus.OK);
	}
}
