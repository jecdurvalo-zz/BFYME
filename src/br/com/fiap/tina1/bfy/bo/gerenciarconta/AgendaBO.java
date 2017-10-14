package br.com.fiap.tina1.bfy.bo.gerenciarconta;

import java.util.List;

import br.com.fiap.tina1.bfy.dao.DAOFactory;
import br.com.fiap.tina1.bfy.dao.interfaces.gerenciarconta.AgendaDAO;
import br.com.fiap.tina1.bfy.entidades.gerenciarconta.Agenda;


public class AgendaBO {	
	
	
	//COLOCAR NO BD QUE TEM STATUS E NA SERVLET VALUE= 1 E VALUE= 0
	//COLOCAR UM CHECK BOX, SE ATIVO == TRUE E DESATIVADO == FALSE 
	//1.Verificar se agenda está ativa/Verificar se está ativo para dar match
	//fazer um select nos serviços, se diver algum, volta pro método avisando que ta ativo
	
	// RN 02. O aluno soh poderah ser incluido numa turma ativa
				
			
	/*----------------------------------------------------------------------*/
	//DAO USUARIOBO - persistência de dados

	public List<Agenda> mostrarAgenda () throws Exception{
		//Aqui tem que colocar um método de validação igual o de cima?
		AgendaDAO agendaDAO = DAOFactory.getDAOFactory(DAOFactory.MYSQL).getAgendaDAO();
		
		return agendaDAO.mostrarAgenda();
	}

	public void cadastrarAgenda (Agenda agenda) throws Exception{
		if(agenda.isStatusAgenda() == false) {
			throw new Exception("Não é possível ativar a agenda");
		}
		
		AgendaDAO agendaDAO = DAOFactory.getDAOFactory(DAOFactory.MYSQL).getAgendaDAO();
		agendaDAO.cadastrarAgenda(agenda);
	}

	//Agenda == meus serviços

	//2.Verificar se o usuário tem agenda/horario
	//select nos horários disponíveis do cara

}
