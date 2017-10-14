package br.com.fiap.tina1.bfy.dao.interfaces.gerenciarconta;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.tina1.bfy.entidades.gerenciarconta.Agenda;


public interface AgendaDAO {
	
	//C - CREATE
	public void cadastrarAgenda(Agenda agenda) throws SQLException;
	
	//R - READ
	//public void mostrarAgenda(Agenda agenda) throws SQLException;
	public List<Agenda> mostrarAgenda() throws SQLException;


}
