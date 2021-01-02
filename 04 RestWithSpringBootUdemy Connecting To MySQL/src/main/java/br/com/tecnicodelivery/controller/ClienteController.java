package br.com.tecnicodelivery.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tecnicodelivery.model.Cliente;
import br.com.tecnicodelivery.services.ClienteServices;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	@Autowired
	private ClienteServices service;
	
	@GetMapping
	public List<Cliente> findAll() {
		return service.findAll();
	}	
	
	@GetMapping("/{id}")
	public Cliente findById(@PathVariable("id") Long id) {
		return service.findById(id);
	}	
	
	@PostMapping
	public Cliente create(@RequestBody @Valid Cliente cliente) {
		return service.create(cliente);
	}
	
	@PutMapping
	public Cliente update(@RequestBody Cliente cliente) {
		return service.update(cliente);
	}	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id) {
		service.delete(id);
		return ResponseEntity.ok().build();
	}	
	
}