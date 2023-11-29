package com.masterpi.domain.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
@CrossOrigin(origins = "http://localhost:4200")
public class UserRestController {

	@Autowired
	UserService userService;

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		return ResponseEntity.ok(userService.findAll());
	}

	@GetMapping(value = "{id}")
	public ResponseEntity<User> findById(@PathVariable Integer id) {
		return ResponseEntity.ok(userService.findById(id));
	}

	@PostMapping
	public ResponseEntity<User> save(@RequestBody User user) {
		user = userService.save(user);
		return ResponseEntity.ok(user);
	}

	@PutMapping(value = "{id}")
	public ResponseEntity<User> update(@PathVariable Integer id, @RequestBody User user) {
		user = userService.save(user);
		return ResponseEntity.ok(user);
	}

	@DeleteMapping(value = "{id}")
	public BodyBuilder delete(@PathVariable Integer id) {
		userService.deleteById(id);
		return ResponseEntity.ok();
	}

}
