package br.com.fiap.tina1.bfy.bo.gerenciarconta;

import br.com.fiap.tina1.bfy.dao.DAOFactory;
import br.com.fiap.tina1.bfy.dao.interfaces.gerenciarconta.EnderecoDAO;
import br.com.fiap.tina1.bfy.entidades.gerenciarconta.Endereco;


public class EnderecoBO {
	
	//máscara para o cep
	
	
	/*----------------------------------------------------------------------*/
	//DAO USUARIOBO - persistência de dados
		
	public boolean cadastrarEndereco(Endereco endereco) throws Exception{
		
		//Campos não podem ser vazios
		if((endereco.getBairro().length() <= 0 )  || (endereco.getLogradouro().length()  <= 0) || 
				(endereco.getTipoLogradouro().length() <= 0) || (endereco.getNumero().length() <= 0) ||      
						endereco.getCep() <= 0  ){
			
				throw new Exception("É preciso preencher os campos acima");
			
		}
			
		EnderecoDAO enderecoDAO = DAOFactory.getDAOFactory(DAOFactory.MYSQL).getEnderecoDAO();
		enderecoDAO.cadastrarEndereco(endereco);
		return false;
		 	
	}
	public void atualizarEndereco(Endereco endereco) throws Exception{
		
		//Campos não podem ser vazios
		if((endereco.getBairro().length() <= 0 )  || (endereco.getLogradouro().length()  <= 0) || 
				(endereco.getTipoLogradouro().length() <= 0) || (endereco.getNumero().length() <= 0) ||      
						endereco.getCep() <= 0  ){
			
				throw new Exception("É preciso preencher os campos acima");
			
		}
		EnderecoDAO enderecoDAO = DAOFactory.getDAOFactory(DAOFactory.MYSQL).getEnderecoDAO();
		enderecoDAO.atualizarEndereco(endereco);
	}
}
