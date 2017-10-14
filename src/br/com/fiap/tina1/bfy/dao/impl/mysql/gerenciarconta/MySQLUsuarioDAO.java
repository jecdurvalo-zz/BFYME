package br.com.fiap.tina1.bfy.dao.impl.mysql.gerenciarconta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.fiap.tina1.bfy.dao.impl.mysql.ConnectionManager;
import br.com.fiap.tina1.bfy.dao.interfaces.gerenciarconta.UsuarioDAO;
import br.com.fiap.tina1.bfy.entidades.gerenciarconta.Usuario;

public class MySQLUsuarioDAO implements UsuarioDAO{

	@Override
	public boolean cadastrarUsuario(Usuario usuario) throws SQLException {
		
		Connection conn = null;
		
		try {
			
			//Obtem a conexao com o SGBDR
			conn = ConnectionManager.getInstance().getConnection();

			PreparedStatement ps = 
					conn.prepareStatement("INSERT INTO T_SBFY_USUARIO (NM_CLIENTE, NM_USUARIO, DS_EMAIL, NR_CPF, DT_NASCIMENTO, DS_SENHA) VALUES(?,?,?,?,?,?)");
			ps.setString(1, usuario.getNome());
			ps.setString(2, usuario.getUsuario());
			ps.setString(3, usuario.getEmail());
			ps.setString(4, usuario.getCpf());
			ps.setString(5, usuario.getDataNascimento());
			ps.setString(6, usuario.getSenha());
			
			ps.executeUpdate();
			 
			//Fecha
			ps.close();
			conn.close();
			
			
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
		return true;	
		
	}

	@Override
	public boolean loginUsuario(Usuario usuario) throws SQLException {
		Connection conn = null;
		
		try {
			
			//Obtem a conexao com o SGBDR
			conn = ConnectionManager.getInstance().getConnection();
			
			PreparedStatement ps = 
					conn.prepareStatement("SELECT * FROM T_SBFY_USUARIO WHERE NM_USUARIO = ? AND DS_SENHA = ?");
			
			ps.setString(1, usuario.getUsuario());
			ps.setString(2, usuario.getSenha());
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				return true;
			}
			
			//Fecha
			ps.close();
			conn.close();
				
			
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
		return true;	
		
	}

	
	
}
