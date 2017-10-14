package br.com.fiap.tina1.bfy.entidades.processocompra;

import java.io.Serializable;

import br.com.fiap.tina1.bfy.entidades.gerenciarconta.Agenda;
import br.com.fiap.tina1.bfy.entidades.gerenciarconta.Endereco;
import br.com.fiap.tina1.bfy.entidades.gerenciarconta.Usuario;
import br.com.fiap.tina1.bfy.entidades.servico.Servico;

public class Agendamento implements Serializable {
	private int idAgendamento;
	private String dataAgendamento;
	private String horarioAgendamento;
	private Servico servico;
	private String codOrdemServico;
	private Usuario usuario;
	private Endereco endereco;
	private Agenda agenda;

	
	// Construtores
	
	public Agendamento() {
	}

	public Agendamento(int idAgendamento,String dataAgendamento, String horarioAgendamento, 
			Servico servico, String codOrdemServico, Usuario usuario, Endereco endereco, Agenda agenda) {
		setIdAgendamento(idAgendamento);
		setDataAgendamento(dataAgendamento);
		setHorarioAgendamento(horarioAgendamento);
		setServico(servico);
		setCodOrdemServico(codOrdemServico);
		setUsuario(usuario);
		setEndereco(endereco);
		setAgenda(agenda);
	}

	
	// Getters and Setters
	
	public int getIdAgendamento() {
		return idAgendamento;
	}

	public void setIdAgendamento(int idAgendamento) {
		this.idAgendamento = idAgendamento;
	}

	public String getDataAgendamento() {
		return dataAgendamento;
	}
	         
	public void setDataAgendamento(String dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}
	
	public String getHorarioAgendamento() {
		return horarioAgendamento;
	}
	
	public void setHorarioAgendamento(String horarioAgendamento) {
		this.horarioAgendamento = horarioAgendamento;
	}
	
	public Servico getServicos() {
		return servico;
	}
	
	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public String getCodOrdemServico() {
		return codOrdemServico;
	}

	public void setCodOrdemServico(String codOrdemServico) {
		this.codOrdemServico = codOrdemServico;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}
	
	
	
	
}
