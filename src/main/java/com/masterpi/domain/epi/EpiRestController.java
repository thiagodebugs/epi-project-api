package com.masterpi.domain.epi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
@RequestMapping(value = "/epi")
@CrossOrigin(origins = "http://localhost:4200")
public class EpiRestController {

	@Autowired
	EpiService epiService;

	@GetMapping
	public ResponseEntity<List<Epi>> findAll() {
		return ResponseEntity.ok(epiService.findAll());
	}

	@GetMapping(value = "{id}")
	public ResponseEntity<Epi> findById(@PathVariable Integer id) {
		return ResponseEntity.ok(epiService.findById(id));
	}

	@PostMapping
	public ResponseEntity<Epi> save(@RequestBody Epi epi) {
		epi = epiService.save(epi);
		return ResponseEntity.ok(epi);
	}

	@PutMapping(value = "{id}")
	public ResponseEntity<Epi> update(@PathVariable Integer id, @RequestBody Epi epi) {
		epi = epiService.save(epi);
		return ResponseEntity.ok(epi);
	}

	@DeleteMapping(value = "{id}")
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		epiService.deleteById(id);
		return (ResponseEntity<Void>) ResponseEntity.ok();
	}

}
