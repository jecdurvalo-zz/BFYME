package br.com.fiap.tina1.bfy.entidades.servico;

public class Servico {
	private int idServico;
	private String nome;
	private String descricao;
	private String foto;
	private int duracaoMaxima;
	private double valorServico;
	private Categoria categoria;

	//Construtores

	public Servico() {}

	public Servico(int idServico,String nome, String descricao, String foto, int duracaoMaxima, double valorServico,
			Categoria categoria) {
		
		setIdServico(idServico);
		setNome(nome);
		setDescricao(descricao);
		setFoto(foto);
		setDuracaoMaxima(duracaoMaxima);
		setValorServico(valorServico);
		setCategoria(categoria);
	}

	//Getters & Setters
	public int getIdServico() {
		return idServico;
	}

	public void setIdServico(int idServico) {
		this.idServico = idServico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public int getDuracaoMaxima() {
		return duracaoMaxima;
	}

	public void setDuracaoMaxima(int duracaoMaxima) {
		this.duracaoMaxima = duracaoMaxima;
	}

	public double getValorServico() {
		return valorServico;
	}

	public void setValorServico(double valorServico) {
		this.valorServico = valorServico;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}	

}
