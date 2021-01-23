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
import org.hibernate.validator.constraints.br.CNPJ;

@Entity
@Table(name = "fornecedor")
public class Fornecedor {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_fornecedor", length = 80)
	private Long id_fornecedor;
	
	@Column(name = "telefone", length = 200)
	private String telefone;
	
	@NotBlank(message = "{celular.not.blank}")
	@Column(name = "celular", length = 50)
	private String celular;
	
	@CNPJ(message = "{cnpj.not.valid}")
	@Column(name = "cnpj", length = 1)
	private String CNPJ;
	
	@Column(name = "ie", length = 200)
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
	
	@Column(name = "dataCadastro", length = 50)
	@Temporal(TemporalType.DATE)
	private Date dataCadastro;
	
	@Column(name = "email", length = 100)
	private String email;
	
	@Column(name = "observacao", length = 255)
	private String observacao;

	public Long getId_fornecedor() {
		return id_fornecedor;
	}

	public void setId_fornecedor(Long id_fornecedor) {
		this.id_fornecedor = id_fornecedor;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getIE() {
		return IE;
	}

	public void setIE(String iE) {
		IE = iE;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CNPJ == null) ? 0 : CNPJ.hashCode());
		result = prime * result + ((IE == null) ? 0 : IE.hashCode());
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((celular == null) ? 0 : celular.hashCode());
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result + ((dataCadastro == null) ? 0 : dataCadastro.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((id_fornecedor == null) ? 0 : id_fornecedor.hashCode());
		result = prime * result + ((observacao == null) ? 0 : observacao.hashCode());
		result = prime * result + ((telefone == null) ? 0 : telefone.hashCode());
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
		Fornecedor other = (Fornecedor) obj;
		if (CNPJ == null) {
			if (other.CNPJ != null)
				return false;
		} else if (!CNPJ.equals(other.CNPJ))
			return false;
		if (IE == null) {
			if (other.IE != null)
				return false;
		} else if (!IE.equals(other.IE))
			return false;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (celular == null) {
			if (other.celular != null)
				return false;
		} else if (!celular.equals(other.celular))
			return false;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (dataCadastro == null) {
			if (other.dataCadastro != null)
				return false;
		} else if (!dataCadastro.equals(other.dataCadastro))
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
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (id_fornecedor == null) {
			if (other.id_fornecedor != null)
				return false;
		} else if (!id_fornecedor.equals(other.id_fornecedor))
			return false;
		if (observacao == null) {
			if (other.observacao != null)
				return false;
		} else if (!observacao.equals(other.observacao))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Fornecedor [id_fornecedor=" + id_fornecedor + ", telefone=" + telefone + ", celular=" + celular
				+ ", CNPJ=" + CNPJ + ", IE=" + IE + ", endereco=" + endereco + ", bairro=" + bairro + ", cidade="
				+ cidade + ", estado=" + estado + ", cep=" + cep + ", dataCadastro=" + dataCadastro + ", email=" + email
				+ ", observacao=" + observacao + "]";
	}

	public Fornecedor(Long id_fornecedor, String telefone, @NotBlank(message = "{celular.not.blank}") String celular,
			@org.hibernate.validator.constraints.br.CNPJ(message = "{cnpj.not.valid}") String cNPJ, String iE,
			@NotBlank(message = "{endereco.not.blank}") String endereco,
			@NotBlank(message = "{bairro.not.blank}") String bairro,
			@NotBlank(message = "{cidade.not.blank}") String cidade,
			@NotBlank(message = "{estado.not.blank}") String estado, @NotBlank(message = "{cep.not.blank}") String cep,
			@NotBlank(message = "{dataCadastro.not.blank}") Date dataCadastro, String email, String observacao) {
		super();
		this.id_fornecedor = id_fornecedor;
		this.telefone = telefone;
		this.celular = celular;
		CNPJ = cNPJ;
		IE = iE;
		this.endereco = endereco;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.dataCadastro = dataCadastro;
		this.email = email;
		this.observacao = observacao;
	}

	public Fornecedor() {
		
	}


	






	
	




	

}
