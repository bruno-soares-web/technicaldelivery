package br.com.fornecedor.controller;

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

import br.com.fornecedor.model.Fornecedor;
import br.com.fornecedor.services.FornecedorServices;


@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {
	
	@Autowired
	private FornecedorServices fornecedorServices;
	
	@GetMapping
	public List<Fornecedor> findAll() {
		return fornecedorServices.findAll();
	}	
	
	@GetMapping("/{id}")
	public Fornecedor findById(@PathVariable("id") Long id) {
		return fornecedorServices.findById(id);
	}	
	
	@PostMapping
	public Fornecedor create(@RequestBody @Valid Fornecedor fornecedor) {
		return fornecedorServices.create(fornecedor);
	}
	
	@PutMapping
	public Fornecedor update(@RequestBody Fornecedor fornecedor) {
		return fornecedorServices.update(fornecedor);
	}	
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") Long id) {
		fornecedorServices.delete(id);
		return ResponseEntity.ok().build();
	}	
	
}