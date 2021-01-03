package br.com.tecnicodelivery.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tecnicodelivery.exception.ResourceNotFoundException;
import br.com.tecnicodelivery.model.Cliente;
import br.com.tecnicodelivery.repository.ClienteRepository;

@Service
public class ClienteServices {
	
	@Autowired
	ClienteRepository clienteRepository;
		
	public Cliente create(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}	
	
	public Cliente findById(Long id) {

		return clienteRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
	}
		
	public Cliente update(Cliente cliente) {
		Cliente entity = clienteRepository.findById(cliente.getId_cliente())
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
		
		entity.setNome(cliente.getNome());
		entity.setTelefone(cliente.getTelefone());
		entity.setIdade(cliente.getIdade());
		entity.setSexo(cliente.getSexo());
		entity.setDataCadastro(cliente.getDataCadastro());
		entity.setRG(cliente.getRG());
		entity.setCPF(cliente.getCPF());
		entity.setDataNascimento(cliente.getDataNascimento());
		entity.setEmail(cliente.getEmail());
		
		return clienteRepository.save(entity);
	}	
	
	public void delete(Long id) {
		Cliente entity = clienteRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
		clienteRepository.delete(entity);
	}

}
