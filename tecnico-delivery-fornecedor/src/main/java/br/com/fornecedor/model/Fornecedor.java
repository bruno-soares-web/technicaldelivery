package br.com.fornecedor.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;


@Entity
@Table(name = "fornecedor")
public class Fornecedor {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_fornecedor", length = 80)
	private Long id_fornecedor;
	
	
	private String telefone;
	
	@NotBlank(message = "{celular.not.blank}")
	@Column(name = "celular", length = 50)
	private String celular;
	
	private String CNPJ;
	
	private String IE;
	
	@NotBlank(message = "{endereco.not.blank}")
	@Column(name = "endereco", length = 200)
	private String endereco;
	
	@NotBlank(message = "{bairro.not.blank}")
	@Column(name = "bairro", length = 50)
	private String bairro;
	
	@NotBlank(message = "{cidade.not.blank}")
	@Column(name = "cidade", length = 50)
	private String cidade;
	
	@NotBlank(message = "{estado.not.blank}")
	@Column(name = "estado", length = 50)
	private String estado;
	
	@NotBlank(message = "{cep.not.blank}")
	@Column(name = "cep", length = 50)
	private String cep;
	
	private String email;
	
	private String observacao;








	
	




	

}
