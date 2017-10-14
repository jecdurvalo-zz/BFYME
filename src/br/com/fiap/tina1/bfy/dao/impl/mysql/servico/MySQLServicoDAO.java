package br.com.fiap.tina1.bfy.dao.impl.mysql.servico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.tina1.bfy.dao.impl.mysql.ConnectionManager;
import br.com.fiap.tina1.bfy.dao.interfaces.servico.ServicoDAO;
import br.com.fiap.tina1.bfy.entidades.servico.Servico;

public class MySQLServicoDAO implements ServicoDAO{

	@Override
	public List<Servico> mostraServicos(String nome) throws SQLException {

		List<Servico> servicoLista = new ArrayList<>();

		Connection conn = null;

		try {

			//Obtem a conexao com o SGBDR
			conn = ConnectionManager.getInstance().getConnection();

			PreparedStatement ps = 
					conn.prepareStatement("SELECT * FROM T_SBFY_SERVICO WHERE NM_SERVICO LIKE ?");

			//Valores para pesquisar nos parâmetros
			ps.setString(1, "%" + nome + "%");

			//Executa SQL
			ResultSet rs = ps.executeQuery();

			//Retorno
			while(rs.next()){
				Servico servico = new Servico();

				servico.setIdServico(rs.getInt("cd_servico"));
				servico.setNome(rs.getString("nm_servico"));

				servicoLista.add(servico);
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
		return servicoLista;
	}
}
