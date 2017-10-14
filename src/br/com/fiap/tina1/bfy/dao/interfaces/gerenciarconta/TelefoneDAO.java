package br.com.fiap.tina1.bfy.dao.interfaces.gerenciarconta;

import java.sql.SQLException;
import java.util.List;

import br.com.fiap.tina1.bfy.entidades.gerenciarconta.Telefone;

public interface TelefoneDAO {
	
	//C - CREATE
	public void cadastrarTelefone(Telefone telefone) throws SQLException;
	
	//U - UPDATE
	public void atualizarTelefone(Telefone telefone) throws SQLException;
	
	//R - READ
	public void mostraTelefone(Telefone telefone) throws SQLException;
}
