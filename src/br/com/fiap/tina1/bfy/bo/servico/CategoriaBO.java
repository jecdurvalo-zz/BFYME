package br.com.fiap.tina1.bfy.bo.servico;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.tina1.bfy.dao.DAOFactory;
import br.com.fiap.tina1.bfy.dao.interfaces.servico.CategoriaDAO;
import br.com.fiap.tina1.bfy.entidades.servico.Categoria;


public class CategoriaBO {
	
	public List<Categoria> mostraCategoria() throws Exception{
		CategoriaDAO categoriaDAO = DAOFactory.getDAOFactory(DAOFactory.MYSQL).getCategoriaDAO();
		return categoriaDAO.mostraCategoria();
	}
		
}
