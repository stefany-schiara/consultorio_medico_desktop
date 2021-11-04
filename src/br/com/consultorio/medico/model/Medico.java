package br.com.consultorio.medico.model;

import java.util.Date;

/**
 *
 * @author esqui
 */
public class Medico {

	private Integer idMedico;
	private String nome;
	private Date dtNascimento;
	private String cpf;
	private String email;
	private String telefone;
	private String celular;
	private String especialidade;
	private String crm;

	public Medico() {
		super();
	}

	public Medico(String nome, Date dtNascimento, String cpf, String email, String telefone, String celular,
			String especialidade, String crm) {
		super();
		this.nome = nome;
		this.dtNascimento = dtNascimento;
		this.cpf = cpf;
		this.email = email;
		this.telefone = telefone;
		this.celular = celular;
		this.especialidade = especialidade;
		this.crm = crm;
	}

	public Integer getIdMedico() {
		return idMedico;
	}

	public void setIdMedico(Integer idMedico) {
		this.idMedico = idMedico;
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

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

}
