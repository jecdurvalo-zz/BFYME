package br.com.fiap.tina1.bfy.dao.interfaces.gerenciarconta;

import java.sql.SQLException;

import br.com.fiap.tina1.bfy.entidades.gerenciarconta.Usuario;

public interface UsuarioDAO {
	
	//C - CREATE
	public boolean cadastrarUsuario(Usuario usuario) throws SQLException; 
	
	//R - READ
	public boolean loginUsuario(Usuario usuario) throws SQLException;
	//COLOCAR UM AQUI DE MOSTRAR DADOS, POREM TESTAR PRIMEIRO
	
	
	
}
