package it.framework.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import it.framework.api.service.impl.GenericService;

@RestController
@RequestMapping("/api/v1")
public class GenericController {

	// insert service with @Autowired
	@Autowired
	private GenericService service;
	
	@Operation(description = "descrizione del metodo")
	@GetMapping(value = "url")
	public ResponseEntity<String> getMethod(
			@RequestHeader String id) {
		
		return ResponseEntity.ok(id);
		
	}
	
	@Operation(description = "descrizione del metodo")
	@PostMapping(value = "url")
	public void postMethod() {
			//@RequestBody
	}
	
	@Operation(description = "descrizione del metodo")
	@PutMapping(value="url")
	public void putMethod() {

	}
	
	@Operation(description = "descrizione del metodo")
	@DeleteMapping(value = "url")
	public void deleteMethod() {

	}
}
