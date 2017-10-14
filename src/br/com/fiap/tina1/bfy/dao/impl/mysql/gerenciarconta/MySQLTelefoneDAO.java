package br.com.fiap.tina1.bfy.dao.impl.mysql.gerenciarconta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.tina1.bfy.dao.impl.mysql.ConnectionManager;
import br.com.fiap.tina1.bfy.dao.interfaces.gerenciarconta.TelefoneDAO;
import br.com.fiap.tina1.bfy.entidades.gerenciarconta.Telefone;

public class MySQLTelefoneDAO implements TelefoneDAO{

	@Override
	public void cadastrarTelefone(Telefone telefone) throws SQLException {
		Connection conn = null;
		
		try {
			
			//Obtem a conexao com o SGBDR
			conn = ConnectionManager.getInstance().getConnection();
			
			PreparedStatement ps = 
					conn.prepareStatement("INSERT INTO T_SBFY_USUARIO_TELEFONE(NR_DDD, NR_TELEFONE, DS_TIPOTELEFONE) VALUES(?,?,?)");
			
			ps.setInt(1, telefone.getDdd());
			ps.setInt(2, telefone.getTelefone());
			ps.setString(3, telefone.getTipoTelefone());
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
		
	}

	@Override
	public void atualizarTelefone(Telefone telefone) throws SQLException {
		Connection conn = null;
		
		try {
			
			//Obtem a conexao com o SGBDR
			conn = ConnectionManager.getInstance().getConnection();
			
			PreparedStatement ps = 
					conn.prepareStatement("UPDATE T_SBFY_TELEFONE SET NR_DDD = ?, NR_TELEFONE = ?, DS_TIPOTELEFONE = ?");
			
			ps.setInt(1, telefone.getDdd());
			ps.setInt(2, telefone.getTelefone());
			ps.setString(3, telefone.getTipoTelefone());
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
		
	}


	@Override
	public void mostraTelefone(Telefone telefone) throws SQLException {
		Connection conn = null;
		
		try {
			
			//Obtem a conexao com o SGBDR
			conn = ConnectionManager.getInstance().getConnection();
			
			PreparedStatement ps = 
					conn.prepareStatement("SELECT * FROM T_SBFY_TELEFONE WHERE NR_NUMERO = ?");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				ps.setInt(1, telefone.getTelefone());
			}
			
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
		
		
	}
	
}
