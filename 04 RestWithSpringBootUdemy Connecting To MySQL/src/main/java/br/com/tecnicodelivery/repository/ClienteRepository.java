package br.com.tecnicodelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tecnicodelivery.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}