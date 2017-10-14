package br.com.fiap.tina1.bfy.dao;

import br.com.fiap.tina1.bfy.dao.impl.mysql.gerenciarconta.MySQLAgendaDAO;
import br.com.fiap.tina1.bfy.dao.impl.mysql.gerenciarconta.MySQLEnderecoDAO;
import br.com.fiap.tina1.bfy.dao.impl.mysql.gerenciarconta.MySQLTelefoneDAO;
import br.com.fiap.tina1.bfy.dao.impl.mysql.gerenciarconta.MySQLUsuarioDAO;
import br.com.fiap.tina1.bfy.dao.impl.mysql.processocompra.MySQLAgendamentoDAO;
import br.com.fiap.tina1.bfy.dao.impl.mysql.servico.MySQLCategoriaDAO;
import br.com.fiap.tina1.bfy.dao.impl.mysql.servico.MySQLServicoDAO;
import br.com.fiap.tina1.bfy.dao.interfaces.gerenciarconta.AgendaDAO;
import br.com.fiap.tina1.bfy.dao.interfaces.gerenciarconta.EnderecoDAO;
import br.com.fiap.tina1.bfy.dao.interfaces.gerenciarconta.TelefoneDAO;
import br.com.fiap.tina1.bfy.dao.interfaces.gerenciarconta.UsuarioDAO;
import br.com.fiap.tina1.bfy.dao.interfaces.processocompra.AgendamentoDAO;
import br.com.fiap.tina1.bfy.dao.interfaces.servico.CategoriaDAO;
import br.com.fiap.tina1.bfy.dao.interfaces.servico.ServicoDAO;

/**
 * Factory de DAOs para o MySQL
 */
public class MySQLDAOFactory extends DAOFactory{

	@Override
	public UsuarioDAO getUsuarioDAO() {
		return new MySQLUsuarioDAO();
	}

	@Override
	public AgendaDAO getAgendaDAO() {
		return new MySQLAgendaDAO();
	}

	@Override
	public EnderecoDAO getEnderecoDAO() {
		return new MySQLEnderecoDAO();
	}

	@Override
	public TelefoneDAO getTelefoneDAO() {
		return new MySQLTelefoneDAO();
	}

	@Override
	public AgendamentoDAO getAgendamentoDAO() {
		return new MySQLAgendamentoDAO();
	}

	@Override
	public ServicoDAO getServicoDAO() {
		return new MySQLServicoDAO();
	}

	@Override
	public CategoriaDAO getCategoriaDAO() {
		return new MySQLCategoriaDAO();
	}
}
