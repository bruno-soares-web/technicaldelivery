package br.com.fornecedor.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fornecedor.exception.ResourceNotFoundException;
import br.com.fornecedor.model.Fornecedor;
import br.com.fornecedor.repository.FornecedorRepository;


@Service
public class FornecedorServices {
	
	@Autowired
	FornecedorRepository fornecedorRepository;
		
	public Fornecedor create(Fornecedor fornecedor) {
		return fornecedorRepository.save(fornecedor);
	}
	
	public List<Fornecedor> findAll() {
		return fornecedorRepository.findAll();
	}	
	
	public Fornecedor findById(Long id) {

		return fornecedorRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
	}
		
	public Fornecedor update(Fornecedor fornecedor) {
		Fornecedor entity = fornecedorRepository.findById(fornecedor.getId_fornecedor())
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
		
		entity.setTelefone(fornecedor.getTelefone());
		entity.setCelular(fornecedor.getCelular());
		entity.setCNPJ(fornecedor.getCNPJ());
		entity.setIE(fornecedor.getIE());
		entity.setEndereco(fornecedor.getEndereco());
		entity.setBairro(fornecedor.getBairro());
		entity.setCidade(fornecedor.getCidade());
		entity.setEstado(fornecedor.getEstado());
		entity.setCep(fornecedor.getCep());
		entity.setDataCadastro(fornecedor.getDataCadastro());
		entity.setEmail(fornecedor.getEmail());
		entity.setObservacao(fornecedor.getObservacao());
		
		return fornecedorRepository.save(entity);
	}	
	
	public void delete(Long id) {
		Fornecedor entity = fornecedorRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
		fornecedorRepository.delete(entity);
	}

}
