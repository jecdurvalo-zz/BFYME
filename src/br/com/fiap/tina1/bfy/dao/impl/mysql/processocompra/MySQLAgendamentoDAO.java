package br.com.fiap.tina1.bfy.dao.impl.mysql.processocompra;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.tina1.bfy.dao.impl.mysql.ConnectionManager;
import br.com.fiap.tina1.bfy.dao.interfaces.processocompra.AgendamentoDAO;
import br.com.fiap.tina1.bfy.entidades.gerenciarconta.Usuario;
import br.com.fiap.tina1.bfy.entidades.processocompra.Agendamento;

public class MySQLAgendamentoDAO implements AgendamentoDAO{

	@Override
	public void novoAgendamento(Agendamento agendamento) throws SQLException {
		Connection conn = null;
		
		try {
			
			//Obtem a conexao com o SGBDR
			conn = ConnectionManager.getInstance().getConnection();
			
			PreparedStatement ps = 
					conn.prepareStatement("INSERT INTO T_SBFY_AGENDAMENTO(DT_AGENDAMENTO, HR_AGENDAMENTO) VALUES(?,?)");
			
			ps.setString(1, agendamento.getDataAgendamento());
			ps.setString(2, agendamento.getHorarioAgendamento());
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
	public void ordemServicoAgendamento(Agendamento agendamento) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Agendamento> mostraAgendamento() throws SQLException {
		
		List<Agendamento> agendamentoLista = new ArrayList<>();
		
		Connection conn = null;
		
		try {
			
			//Obtem a conexao com o SGBDR
			conn = ConnectionManager.getInstance().getConnection();
			
			PreparedStatement ps = 
					conn.prepareStatement("SELECT  FROM T_SBFY_AGENDAMENTO WHERE DT_AGENDAMENTO = ? AND HR_AGENDAMENTO = ?");
			
			PreparedStatement ps2 = 
					conn.prepareStatement("SELECT  FROM T_SBFY_AGENDAMENTO WHERE DT_AGENDAMENTO = ? AND HR_AGENDAMENTO = ?");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Agendamento agendamento = new Agendamento();
				Usuario usuario = new Usuario();
				
				//agendamento.set...(rs.get...("agenda"));
				agendamento.setDataAgendamento(rs.getString("dataAgendamento"));
				agendamento.setHorarioAgendamento(rs.getString("horarioAgendamento"));
				
				
				agendamentoLista.add(agendamento);
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
		return agendamentoLista;	
	}

}
