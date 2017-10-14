package br.com.fiap.tina1.bfy.bo.gerenciarconta;

import br.com.fiap.tina1.bfy.dao.DAOFactory;
import br.com.fiap.tina1.bfy.dao.interfaces.gerenciarconta.UsuarioDAO;
import br.com.fiap.tina1.bfy.entidades.gerenciarconta.Usuario;

public class UsuarioBO{

	/*----------------------------------------------------------------------*/
	//DAO USUARIOBO - persist�ncia de dados
	
	public boolean cadastrarUsuario(Usuario usuario) throws Exception{
		/*
		// Tirar os espa�os na hora do cadastro
		if((usuario.getNome().trim().length() <= 0) || (usuario.getCpf() <= 0) || 
			   (usuario.getEmail().trim().length() <= 0) || (usuario.getUsuario().trim().length() <= 0) ||
					usuario.getSenha().trim().length() <= 0){
			
			throw new Exception("Os campos precisam ser preenchidos");
			
		}
		*/
		UsuarioDAO usuarioDAO = DAOFactory.getDAOFactory(DAOFactory.MYSQL).getUsuarioDAO();
		return usuarioDAO.cadastrarUsuario(usuario);
		
		
	}
	
	public boolean loginUsuario(Usuario usuario) throws Exception{
		/*
		//Login n�o pode ficar vazio
		if((usuario.getUsuario().trim().length() <= 0 && usuario.getSenha().trim().length() <= 0) ||
				(usuario.getUsuario().trim().length() <= 0 || usuario.getSenha().trim().length() <= 0) ){
			
			throw new Exception("Erro ao fazer login. Existem campos obrigat�rios varios");
		}
		*/
		UsuarioDAO usuarioDAO = DAOFactory.getDAOFactory(DAOFactory.MYSQL).getUsuarioDAO();
		return usuarioDAO.loginUsuario(usuario);
	}
	
	
	
}


		// ver com o Humberto m�todos para converter a data de nascimento
		/*

		 private String recIdadeCliente(Date dataNasc){
	        if(dataNasc == null)
	            return "";
	        Date hoje = new Date();
	        int idade = hoje.getYear() - dataNasc.getYear();
	        if((hoje.getMonth() < dataNasc.getMonth())
	                || (hoje.getMonth() == dataNasc.getMonth() && hoje.getDate() < dataNasc.getDate()))
	            idade--;
	      return idade + " anos";
    	}

		 */

		/*RN01. Maiores de 18 anos (front e back)
		if(usuario.getDataNascimento() < 18 ){ // ask cabral 
			throw new Exception("A idade m�nima para cadastro � 18 anos");
		}*/
