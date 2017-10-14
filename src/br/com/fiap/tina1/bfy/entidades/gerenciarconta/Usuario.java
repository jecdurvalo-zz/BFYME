package br.com.fiap.tina1.bfy.entidades.gerenciarconta;

import java.io.Serializable;
import java.util.Calendar;

import br.com.fiap.tina1.bfy.entidades.servico.Servico;


public class Usuario implements Serializable {
	private int idUsuario;
	private String nome; 
	private String email;
	private String usuario;
	private String senha;
	private String cpf;
	private String dataNascimento;
	private String sexo;	
	private Servico servico;
	private Agenda agenda;
	private Telefone telefone;
	private Endereco endereco;	

	// Construtores

	public Usuario() {}
	
	public Usuario(String usuario, String senha) {
		setUsuario(usuario);
		setSenha(senha);
	}

	//Cadastro
	public Usuario(String nome, String usuario, String email, String cpf, String dataNascimento,String senha) {
		setNome(nome);
		setUsuario(usuario);
		setEmail(email);
		setCpf(cpf);
		setDataNascimento(dataNascimento);
		setSenha(senha);
	}

	public Usuario(int idUsuario, String nome, String email,String usuario, String dataNascimento, String cpf, Endereco endereco,
			Telefone telefone, String sexo, String senha, Servico servico, Agenda agenda) {
		setIdUsuario(idUsuario);
		setNome(nome);
		setEmail(email);
		setUsuario(usuario);
		setDataNascimento(dataNascimento);
		setCpf(cpf);
		setEndereco(endereco);
		setTelefone(telefone);
		setSexo(sexo);
		setSenha(senha);
		setServico(servico);
		setAgenda(agenda);
	}

	// Getters and Setters
	

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email.toLowerCase();
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}
	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	
	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Servico getServico() {
		return servico;
	}
	public void setServico(Servico servico) {
		this.servico = servico;
	}
	public Agenda getAgenda() {
		return agenda;
	}
	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}

}


