package br.com.tecnicodelivery.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;



@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente", length = 80)
	private Long id_cliente;

	@NotBlank(message = "{nome.not.blank}")
	@Column(name = "nome", length = 255)
	private String nome;

	@NotBlank(message = "{telefone.not.blank}")
	@Column(name = "telefone", length = 20)
	private String telefone;

	@NotBlank(message = "{sexo.not.blank}")
	@Column(name = "sexo", length = 20)
	private String sexo;

	// @NotBlank
	@Column(name = "idade", length = 3)
	private Integer idade;

	@Temporal(TemporalType.DATE)
	@Column(name = "dataCadastro", length = 50)
	private Date dataCadastro;

	@Column(name = "rg", length = 50)
	private String RG;

	@CPF(message = "{cpf.not.valid}")
	@Column(name = "cpf", length = 20)
	private String CPF;

	@Temporal(TemporalType.DATE)
	@Column(name = "dataNascimento", length = 50)
	private Date dataNascimento;

	@Email(message = "{email.not.valid}")
	@Column(name = "email", length = 100)
	private String email;

	@NotBlank(message = "{bairro.not.blank}")
	@Column(name = "bairro", length = 50)
	private String bairro;

	@NotBlank(message = "{cidade.not.blank}")
	@Column(name = "cidade", length = 50)
	private String cidade;

	@Column(name = "complemento", length = 255)
	private String complemento;

	@NotBlank(message = "{endereco.not.blank}")
	@Column(name = "endereco", length = 255)
	private String endereco;

	@NotBlank(message = "{uf.not.blank}")
	@Column(name = "uf", length = 5)
	private String uf;

	public Cliente(Long id_cliente, @NotBlank(message = "{nome.not.blank}") String nome,
			@NotBlank(message = "{telefone.not.blank}") String telefone,
			@NotBlank(message = "{sexo.not.blank}") String sexo, Integer idade, Date dataCadastro, String rG,
			@org.hibernate.validator.constraints.br.CPF(message = "{cpf.not.valid}") String cPF, Date dataNascimento,
			@Email(message = "{email.not.valid}") String email, @NotBlank(message = "{bairro.not.blank}") String bairro,
			@NotBlank(message = "{cidade.not.blank}") String cidade, String complemento,
			@NotBlank(message = "{endereco.not.blank}") String endereco,
			@NotBlank(message = "{uf.not.blank}") String uf) {
		super();
		this.id_cliente = id_cliente;
		this.nome = nome;
		this.telefone = telefone;
		this.sexo = sexo;
		this.idade = idade;
		this.dataCadastro = dataCadastro;
		RG = rG;
		CPF = cPF;
		this.dataNascimento = dataNascimento;
		this.email = email;
		this.bairro = bairro;
		this.cidade = cidade;
		this.complemento = complemento;
		this.endereco = endereco;
		this.uf = uf;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CPF == null) ? 0 : CPF.hashCode());
		result = prime * result + ((RG == null) ? 0 : RG.hashCode());
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result + ((dataCadastro == null) ? 0 : dataCadastro.hashCode());
		result = prime * result + ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((id_cliente == null) ? 0 : id_cliente.hashCode());
		result = prime * result + ((idade == null) ? 0 : idade.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
		result = prime * result + ((uf == null) ? 0 : uf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (CPF == null) {
			if (other.CPF != null)
				return false;
		} else if (!CPF.equals(other.CPF))
			return false;
		if (RG == null) {
			if (other.RG != null)
				return false;
		} else if (!RG.equals(other.RG))
			return false;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (dataCadastro == null) {
			if (other.dataCadastro != null)
				return false;
		} else if (!dataCadastro.equals(other.dataCadastro))
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (id_cliente == null) {
			if (other.id_cliente != null)
				return false;
		} else if (!id_cliente.equals(other.id_cliente))
			return false;
		if (idade == null) {
			if (other.idade != null)
				return false;
		} else if (!idade.equals(other.idade))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		if (uf == null) {
			if (other.uf != null)
				return false;
		} else if (!uf.equals(other.uf))
			return false;
		return true;
	}

	public Long getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getRG() {
		return RG;
	}

	public void setRG(String rG) {
		RG = rG;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Cliente() {

	}

}