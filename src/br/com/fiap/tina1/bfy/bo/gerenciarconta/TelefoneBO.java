package br.com.fiap.tina1.bfy.bo.gerenciarconta;

import br.com.fiap.tina1.bfy.dao.DAOFactory;
import br.com.fiap.tina1.bfy.dao.interfaces.gerenciarconta.TelefoneDAO;
import br.com.fiap.tina1.bfy.entidades.gerenciarconta.Telefone;


public class TelefoneBO {
	
	// máscara dos forms para ddd, ddi e telefone	                                     
	
	/*----------------------------------------------------------------------*/
	//DAO USUARIOBO - persistência de dados
	public void cadastrarTelefone(Telefone telefone) throws Exception{
		
		//Não pode ser vazio
		if((telefone.getTelefone() <= 0) || (telefone.getDdd() <= 0) || telefone.getTipoTelefone().length() <=0 ){
			throw new Exception("Os campos não podem ser vazios");
		}
		
		TelefoneDAO telefoneDAO = DAOFactory.getDAOFactory(DAOFactory.MYSQL).getTelefoneDAO();
		telefoneDAO.cadastrarTelefone(telefone);
	}
	
	public void atualizarTelefone(Telefone telefone) throws Exception{
		//Não pode ser vazio
		if((telefone.getTelefone() <= 0) || (telefone.getDdd() <= 0) || telefone.getTipoTelefone().length() <=0 ){
			throw new Exception("Os campos não podem ser vazios");
		}
		TelefoneDAO telefoneDAO = DAOFactory.getDAOFactory(DAOFactory.MYSQL).getTelefoneDAO();
		telefoneDAO.atualizarTelefone(telefone);
	}
}
