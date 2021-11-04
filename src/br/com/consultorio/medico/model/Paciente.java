package br.com.consultorio.medico.model;

import java.util.Date;

/**
 *
 * @author esqui
 */
public class Paciente {

	private Integer id;
	private String nome;
	private Date dtNascimento;
	private String cpf;
	private String email;
	private String telefone;
	private String celular;
	private String cep;
	private String logradouro;
	private String numero;
	private String complemento;
	private String estado;
	private String bairro;

	public Paciente() {
		super();
	}

	public Paciente(String nome, Date dtNascimento, String cpf, String email, String telefone, String celular,
			String cep, String logradouro, String numero, String complemento, String estado, String bairro) {		
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.celular = celular;
		this.cep = cep;
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.estado = estado;
		this.bairro = bairro;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDtNascimento() {
		return dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

}
