package br.com.controller;

import java.util.List;

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

import br.com.model.Cliente;
import br.com.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public List<Cliente> findAll() {
		return clienteService.findAll();
	}	
	
	@GetMapping("/{id}")
	public Cliente findById(@PathVariable("id") Long id) {
		return clienteService.findById(id);
	}	
	
	@PostMapping
	public Cliente create(@RequestBody Cliente cliente) {
		return clienteService.create(cliente);
	}
	
	@PutMapping
	public Cliente update(@RequestBody Cliente cliente) {
		return clienteService.update(cliente);
	}	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id) {
		clienteService.delete(id);
		return ResponseEntity.ok().build();
	}	
}
