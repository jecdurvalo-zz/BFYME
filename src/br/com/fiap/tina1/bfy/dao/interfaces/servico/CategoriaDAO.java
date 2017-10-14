package br.com.fiap.tina1.bfy.dao.interfaces.servico;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.tina1.bfy.entidades.servico.Categoria;

public interface CategoriaDAO {
	
	//R - READ
	public List<Categoria> mostraCategoria() throws SQLException;
}
