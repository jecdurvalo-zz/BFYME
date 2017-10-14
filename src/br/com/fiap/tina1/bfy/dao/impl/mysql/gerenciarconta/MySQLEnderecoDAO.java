package br.com.fiap.tina1.bfy.dao.impl.mysql.gerenciarconta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.tina1.bfy.dao.impl.mysql.ConnectionManager;
import br.com.fiap.tina1.bfy.dao.interfaces.gerenciarconta.EnderecoDAO;
import br.com.fiap.tina1.bfy.entidades.gerenciarconta.Endereco;

public class MySQLEnderecoDAO implements EnderecoDAO{

	@Override
	public void cadastrarEndereco(Endereco endereco) throws SQLException {
		Connection conn = null;
		
		try {
			
			//Obtem a conexao com o SGBDR
			conn = ConnectionManager.getInstance().getConnection();
			
			PreparedStatement ps = 
					conn.prepareStatement("");
			
			ps.setString(1, endereco.getEstado());
			ps.setString(2, endereco.getCidade());
			ps.setString(3, endereco.getBairro());
			ps.setString(4, endereco.getLogradouro());
			ps.setString(5, endereco.getTipoLogradouro());
			ps.setString(6, endereco.getNumero());
			ps.setInt(7, endereco.getCep());
			ps.setString(8, endereco.getComplemento());
			
			ps.executeUpdate();
			
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
	public void atualizarEndereco(Endereco endereco) throws SQLException {
		Connection conn = null;
		
		try {
			
			//Obtem a conexao com o SGBDR
			conn = ConnectionManager.getInstance().getConnection();
			
			PreparedStatement ps = 
					conn.prepareStatement(" INNER JOIN ENDERECO "
					+ "SELECT E.sg_estado,"
							+ "E.nm_estado,"
							+ "C.nm_cidade,"
							+ "B.nm_bairro,"
							+ "L.nr_cep,"
							+ "L.ds_logradouro,"
							+ "UE.nr_logradouro,"
							+ "UE.ds_complemento,"
							+ "U.nm_usuario"
					+ "FROM T_SBFY_ESTADO E INNER JOIN T_SBFY_CIDADE C"
							+ "ON (E.CD_ESTADO = C.CD_ESTADO)"
							+ "INNER JOIN T_SBFY_BAIRRO B"
							+ " ON (C.CD_CIDADE = B.CD_CIDADE)"
							+ "INNER JOIN T_SBFY_LOGRADOURO L"
							+ "ON (B.CD_BAIRRO = L.CD_BAIRRO)"
							+ "INNER JOIN T_SBFY_USUARIO_ENDERECO UE"
							+ "ON (L.NR_CEP = UE.NR_CEP)"
							+ "INNER JOIN T_SBFY_USUARIO U"
							+ "ON (U.CD_USUARIO = UE.CD_USUARIO)");
			
			ps.setString(1, endereco.getEstado());
			ps.setString(2, endereco.getCidade());
			ps.setString(3, endereco.getBairro());
			ps.setString(4, endereco.getLogradouro());
			ps.setString(5, endereco.getTipoLogradouro());
			ps.setString(6, endereco.getNumero());
			ps.setInt(7, endereco.getCep());
			ps.setString(8, endereco.getComplemento());
			
			ps.executeUpdate();
			
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
	public List<Endereco> mostraEndereco() throws SQLException {
		
		List<Endereco> enderecoLista = new ArrayList<Endereco>();
		
		Connection conn = null;
		
		try {
			
			//Obtem a conexao com o SGBDR
			conn = ConnectionManager.getInstance().getConnection();
			
			PreparedStatement ps = 
					conn.prepareStatement("SELECT COM INNER JOIN");
			
			ResultSet rs = ps.executeQuery();
			
			
			while(rs.next()){
				
				Endereco endereco = new Endereco();
				endereco.setIdEndereco(rs.getInt("idEndereco"));
				endereco.setBairro(rs.getString("bairro"));
				endereco.setLogradouro(rs.getString("logradouro"));
				endereco.setTipoLogradouro(rs.getString("tipoLogradouro"));
				endereco.setNumero(rs.getString("numero"));
				endereco.setCep(rs.getInt("cep"));
				endereco.setComplemento(rs.getString("complemento"));
				
				//Inserindo na lista
				enderecoLista.add(endereco);
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
		return enderecoLista;	
	}
	
}
