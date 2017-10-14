package br.com.fiap.tina1.bfy.entidades.servico;

public class Categoria {
	private int idCategoria;
	private String nome;
	private Servico servico;

	//Construtores

	public Categoria() {}

	public Categoria(int idCategoria, String nome, Servico servico) {
		setIdCategoria(idCategoria);
		setNome(nome);
		setServico(servico);
	}

	//Getters & Setters

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public Servico getServico() {
		return servico;
	}

	public String getNome() {
		return nome;
	}

}
