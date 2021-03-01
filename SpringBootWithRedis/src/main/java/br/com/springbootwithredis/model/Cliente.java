package br.com.springbootwithredis.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente", length = 80)
	private Long id_cliente;

	@Column(name = "nome", length = 255)
	private String nome;

	@Column(name = "telefone", length = 20)
	private String telefone;

	@Column(name = "sexo", length = 20)
	private String sexo;

	@Column(name = "idade", length = 3)
	private Integer idade;

	@Column(name = "dataCadastro", length = 50)
	private Date dataCadastro;

	@Column(name = "rg", length = 50)
	private String RG;

    @Column(name = "cpf", length = 20)
	private String CPF;

	@Column(name = "dataNascimento", length = 50)
	private Date dataNascimento;

	@Column(name = "email", length = 100)
	private String email;

	@Column(name = "bairro", length = 50)
	private String bairro;

	@Column(name = "cidade", length = 50)
	private String cidade;

	@Column(name = "complemento", length = 255)
	private String complemento;

	@Column(name = "endereco", length = 255)
	private String endereco;

	@Column(name = "uf", length = 5)
	private String uf;
	
	
}
