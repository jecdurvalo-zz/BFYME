package br.com.fiap.tina1.bfy.dao.interfaces.gerenciarconta;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.tina1.bfy.entidades.gerenciarconta.Endereco;

public interface EnderecoDAO {
	
	//C - CREATE
	public void cadastrarEndereco(Endereco endereco) throws SQLException;
	
	//U - UPDATE
	public void atualizarEndereco(Endereco endereco) throws SQLException;
	
	//R - READ
	public List<Endereco> mostraEndereco() throws SQLException;

}
