package br.com.fiap.tina1.bfy.entidades.gerenciarconta;

import java.io.Serializable;

public class Endereco implements Serializable {
	private int idEndereco;
	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String estado;
	private int cep;
	private String tipoLogradouro;

	// Construtores

	public Endereco() {}

	public Endereco(int idEndereco, String logradouro, String numero, String complemento, String bairro, String cidade, String estado,
			int cep, String tipoLogradouro) {
		
		setIdEndereco(idEndereco);
		setLogradouro(logradouro);
		setNumero(numero);
		setComplemento(complemento);
		setBairro(bairro);
		setCidade(cidade);
		setEstado(estado);
		setCep(cep);
		setTipoLogradouro(tipoLogradouro);
		
	}
	
	public Endereco(String logradouro, String numero, String complemento, String bairro, int cep, String tipoLogradouro) {	
		setLogradouro(logradouro);
		setNumero(numero);
		setComplemento(complemento);
		setBairro(bairro);
		setCidade(cidade);
		setEstado(estado);
		setCep(cep);
		setTipoLogradouro(tipoLogradouro);
		
	}

	
	// Getters and Setters
	
	
	public int getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
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

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getTipoLogradouro() {
		return tipoLogradouro;
	}

	public void setTipoLogradouro(String tipoLogradouro) {
		this.tipoLogradouro = tipoLogradouro;
	}
	

}
