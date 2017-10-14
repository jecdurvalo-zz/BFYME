package br.com.fiap.tina1.bfy.entidades.gerenciarconta;

import java.io.Serializable;

public class Telefone implements Serializable {
	private int idTelefone;
	private int telefone;
	private int ddd;
	private String tipoTelefone;
	
	
	// Construtores
	
	
	public Telefone() {}
	

	public Telefone(int idTelefone,int telefone, int ddd, String tipoTelefone) {
		setIdTelefone(idTelefone);
		setTelefone(telefone);
		setDdd(ddd);
		setTipoTelefone(tipoTelefone);
	}
	
	public Telefone(int telefone, int ddd, String tipoTelefone) {
		setTelefone(telefone);
		setDdd(ddd);
		setTipoTelefone(tipoTelefone);
	}
	
	
	// Getters and Setters
	
	
	public int getIdTelefone() {
		return idTelefone;
	}

	public void setIdTelefone(int idTelefone) {
		this.idTelefone = idTelefone;
	}
	
	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public int getDdd() {
		return ddd;
	}
	
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	
	public String getTipoTelefone() {
		return tipoTelefone;
	}
	
	public void setTipoTelefone(String tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}

}
