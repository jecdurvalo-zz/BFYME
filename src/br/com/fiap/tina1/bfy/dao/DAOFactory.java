package br.com.fiap.tina1.bfy.dao;

import br.com.fiap.tina1.bfy.dao.interfaces.gerenciarconta.AgendaDAO;
import br.com.fiap.tina1.bfy.dao.interfaces.gerenciarconta.EnderecoDAO;
import br.com.fiap.tina1.bfy.dao.interfaces.gerenciarconta.TelefoneDAO;
import br.com.fiap.tina1.bfy.dao.interfaces.gerenciarconta.UsuarioDAO;
import br.com.fiap.tina1.bfy.dao.interfaces.processocompra.AgendamentoDAO;
import br.com.fiap.tina1.bfy.dao.interfaces.servico.CategoriaDAO;
import br.com.fiap.tina1.bfy.dao.interfaces.servico.ServicoDAO;

/**
 * Factory de DAOs.
 */
public abstract class DAOFactory {

	//
	//Repositorios
	//
	public static final int MYSQL = 1;

	//
	//Factory especifico de cada repositorio
	//
	private static DAOFactory mysqlDAOFactory = null;

	/**
	 * @param repositorio A constante que representa o repositorio a ser manipulado: <code>DAOFactory.ORACLE</code> ou <code>DAOFactory.XML</code>
	 * @return Um <code>DAO Factory</code> especifico do repositorio a ser manipulado.
	 */
	public static DAOFactory getDAOFactory(int repositorio) {

		switch (repositorio) {

		case MYSQL:{
		
			if (mysqlDAOFactory == null)
				mysqlDAOFactory = new MySQLDAOFactory();

			return mysqlDAOFactory;
		}
		default:
			return null;
		}
	}
	
	//
	//DAOs disponiveis
	//

	//gerenciarConta
	public abstract UsuarioDAO getUsuarioDAO();
	public abstract AgendaDAO getAgendaDAO();
	public abstract EnderecoDAO getEnderecoDAO();
	public abstract TelefoneDAO getTelefoneDAO();
	
	//processoCompra
	public abstract AgendamentoDAO getAgendamentoDAO();
	
	//servico
	public abstract ServicoDAO getServicoDAO();
	public abstract CategoriaDAO getCategoriaDAO();


}
