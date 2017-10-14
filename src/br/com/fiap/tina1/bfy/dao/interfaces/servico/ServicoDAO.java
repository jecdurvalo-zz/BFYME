package br.com.fiap.tina1.bfy.dao.interfaces.servico;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.tina1.bfy.entidades.servico.Servico;

public interface ServicoDAO {
	
	//R - READ
	public List<Servico> mostraServicos(String nome) throws SQLException;
}
