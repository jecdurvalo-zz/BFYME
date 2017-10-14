package br.com.fiap.tina1.bfy.bo.processocompra;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.tina1.bfy.dao.DAOFactory;
import br.com.fiap.tina1.bfy.dao.interfaces.processocompra.AgendamentoDAO;
import br.com.fiap.tina1.bfy.entidades.processocompra.Agendamento;

public class AgendamentoBO{
	
	/*----------------------------------------------------------------------*/
	//DAO USUARIOBO - persistência de dados

	public void novoAgendamento(Agendamento agendamento) throws Exception {
		AgendamentoDAO agendamentoDAO = DAOFactory.getDAOFactory(DAOFactory.MYSQL).getAgendamentoDAO();
		agendamentoDAO.novoAgendamento(agendamento);
		
	}

	
	public List<Agendamento> mostraAgendamento() throws Exception{
		AgendamentoDAO agendamentoDAO = DAOFactory.getDAOFactory(DAOFactory.MYSQL).getAgendamentoDAO();
		return agendamentoDAO.mostraAgendamento();
	}
	
	//cadastrar a disponibilidade do profissional: se ele estiver livre pode receberAgendamento
	//Criar uma entidade status p/ fazer isso
		
}
