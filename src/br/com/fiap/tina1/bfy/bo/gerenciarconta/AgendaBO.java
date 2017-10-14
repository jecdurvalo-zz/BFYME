package br.com.fiap.tina1.bfy.bo.gerenciarconta;

import java.util.List;

import br.com.fiap.tina1.bfy.dao.DAOFactory;
import br.com.fiap.tina1.bfy.dao.interfaces.gerenciarconta.AgendaDAO;
import br.com.fiap.tina1.bfy.entidades.gerenciarconta.Agenda;


public class AgendaBO {	
	
	
	//COLOCAR NO BD QUE TEM STATUS E NA SERVLET VALUE= 1 E VALUE= 0
	//COLOCAR UM CHECK BOX, SE ATIVO == TRUE E DESATIVADO == FALSE 
	//1.Verificar se agenda est� ativa/Verificar se est� ativo para dar match
	//fazer um select nos servi�os, se diver algum, volta pro m�todo avisando que ta ativo
	
	// RN 02. O aluno soh poderah ser incluido numa turma ativa
				
			
	/*----------------------------------------------------------------------*/
	//DAO USUARIOBO - persist�ncia de dados

	public List<Agenda> mostrarAgenda () throws Exception{
		//Aqui tem que colocar um m�todo de valida��o igual o de cima?
		AgendaDAO agendaDAO = DAOFactory.getDAOFactory(DAOFactory.MYSQL).getAgendaDAO();
		
		return agendaDAO.mostrarAgenda();
	}

	public void cadastrarAgenda (Agenda agenda) throws Exception{
		if(agenda.isStatusAgenda() == false) {
			throw new Exception("N�o � poss�vel ativar a agenda");
		}
		
		AgendaDAO agendaDAO = DAOFactory.getDAOFactory(DAOFactory.MYSQL).getAgendaDAO();
		agendaDAO.cadastrarAgenda(agenda);
	}

	//Agenda == meus servi�os

	//2.Verificar se o usu�rio tem agenda/horario
	//select nos hor�rios dispon�veis do cara

}
