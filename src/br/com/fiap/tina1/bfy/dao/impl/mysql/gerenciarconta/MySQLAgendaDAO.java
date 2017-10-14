package br.com.fiap.tina1.bfy.dao.impl.mysql.gerenciarconta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.tina1.bfy.dao.impl.mysql.ConnectionManager;
import br.com.fiap.tina1.bfy.dao.interfaces.gerenciarconta.AgendaDAO;
import br.com.fiap.tina1.bfy.entidades.gerenciarconta.Agenda;

public class MySQLAgendaDAO implements AgendaDAO{

	@Override
	public void cadastrarAgenda(Agenda agenda) throws SQLException {
		
		Connection conn = null;
		
		try {
			
			//Obtem a conexao com o SGBDR
			conn = ConnectionManager.getInstance().getConnection();
			
			PreparedStatement ps = 
					conn.prepareStatement("");
			//COLOCAR OS SETATRIBUTES
			
			
			ps.executeUpdate();
			
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
	public List<Agenda> mostrarAgenda() throws SQLException {
		
		//Lista p/ retornar
		List<Agenda> listaAgenda = new ArrayList<Agenda>();
		
		Connection conn = null;
		
		try {
			
			//Obtem a conexao com o SGBDR
			conn = ConnectionManager.getInstance().getConnection();
			
			PreparedStatement ps = 
					conn.prepareStatement("");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Agenda agenda = new Agenda();
				
				agenda.setIdAgenda(rs.getInt("idAgenda"));
				//como chamar os atributos tipo Servico servico
				
				listaAgenda.add(agenda);
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
		return listaAgenda;	
	}

}
