package br.com.fiap.tina1.bfy.entidades.gerenciarconta;

import java.io.Serializable;

import br.com.fiap.tina1.bfy.entidades.servico.Servico;

public class Agenda implements Serializable {
	private int idAgenda;
	private Servico servico;
	private String horario;
	private String diaSemana;
	private boolean statusAgenda;
	
	//Construtores
	
	public Agenda() {
	}

	public Agenda(int idAgenda, Servico servico, String horario, String diaSemana, boolean statusAgenda) {
		setIdAgenda(idAgenda);
		setServico(servico);
		setHorario(horario);
		setDiaSemana(diaSemana);
		setStatusAgenda(statusAgenda);
	}
	
	// Getters and Setters
	public int getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(int idAgenda) {
		this.idAgenda = idAgenda;
	}

	public Servico getServico() {
		return servico;
	}
	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	public boolean isStatusAgenda() {
		return statusAgenda;
	}

	public void setStatusAgenda(boolean statusAgenda) {
		this.statusAgenda = statusAgenda;
	}
	
}
