package br.com.fiap.tina1.bfy.dao.impl.mysql.servico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.tina1.bfy.dao.impl.mysql.ConnectionManager;
import br.com.fiap.tina1.bfy.dao.interfaces.servico.CategoriaDAO;
import br.com.fiap.tina1.bfy.entidades.servico.Categoria;

public class MySQLCategoriaDAO implements CategoriaDAO{

	
	@Override
	public List<Categoria> mostraCategoria() throws SQLException {
		
		List<Categoria> categoriaLista = new ArrayList<>();
		
		Connection conn = null;
		
		try {
			
			//Obtem a conexao com o SGBDR
			conn = ConnectionManager.getInstance().getConnection();
			
			PreparedStatement ps = 
					conn.prepareStatement("SELECT NM_CATEGORIA FROM T_SBFY_CATEGORIA WHERE NM_CATEGORIA LIKE ?");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Categoria categoria = new Categoria();
				
				categoria.setIdCategoria(rs.getInt("cd_categoria"));
				categoria.setNome(rs.getString("nm_categoria"));
				categoriaLista.add(categoria);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			throw new SQLException("Erro ao conectar ou manipular o banco de dados!", e);
			
		} finally {

			if (conn != null) {
				try {
					conn.close();
										
				} catch (SQLException e) {
					
					e.printStackTrace();
					throw new SQLException("Erro ao fechar a conexao com o banco de dados!", e);
				}
			}		
		}
		return categoriaLista;	
	}
	
}
