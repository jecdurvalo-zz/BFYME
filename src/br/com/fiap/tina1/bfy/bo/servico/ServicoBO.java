package br.com.fiap.tina1.bfy.bo.servico;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.tina1.bfy.dao.DAOFactory;
import br.com.fiap.tina1.bfy.dao.interfaces.servico.ServicoDAO;
import br.com.fiap.tina1.bfy.entidades.servico.Servico;


public class ServicoBO{

	/*----------------------------------------------------------------------*/
	//DAO USUARIOBO - persistência de dados

	
	public List<Servico> mostraServicos(String nome) throws Exception{
		if(nome.trim().length() == 0){
			throw new Exception("É necessário informar algo para a busca.");
		}
		
		
		ServicoDAO servicoDAO = DAOFactory.getDAOFactory(DAOFactory.MYSQL).getServicoDAO();
		return servicoDAO.mostraServicos(nome);
	}

}
