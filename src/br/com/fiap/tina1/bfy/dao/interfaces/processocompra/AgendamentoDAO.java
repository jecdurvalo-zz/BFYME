package br.com.fiap.tina1.bfy.dao.interfaces.processocompra;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.tina1.bfy.entidades.processocompra.Agendamento;

public interface AgendamentoDAO {
	//C - CREATE
	public void novoAgendamento(Agendamento agendamento) throws SQLException;
	public void ordemServicoAgendamento(Agendamento agendamento)throws SQLException; 
	
	//R - READ
	public List<Agendamento> mostraAgendamento() throws SQLException;
	
}
