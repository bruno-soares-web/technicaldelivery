package br.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.model.Cliente;
import br.com.repository.ClienteRepository;
import lombok.Data;

@Data
@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;

	public Cliente create(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	public List<Cliente> findAll() {
		return clienteRepository.findAll();
	}

	public Cliente findById(Long id) {

		return clienteRepository.findById(id).orElseThrow();
	}

	public Cliente update(Cliente cliente) {
		Cliente entity = clienteRepository.findById(cliente.getId()).orElseThrow();

		entity.setNome(cliente.getNome());
		entity.setEndereco(cliente.getEndereco());
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
				.orElseThrow();
		clienteRepository.delete(entity);
	}
}
