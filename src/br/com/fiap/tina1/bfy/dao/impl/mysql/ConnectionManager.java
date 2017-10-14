package br.com.fiap.tina1.bfy.dao.impl.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Gerenciador de conexão do BD MySQL.
 */

public class ConnectionManager {

	private static ConnectionManager instance;
	
	private static final String STRING_CONNECTION = "jdbc:mysql://localhost:3306/bfyme";
	private static final String USER = "root";
	private static final String PASS = "Kmh.220314";


	private ConnectionManager() throws ClassNotFoundException {

		// Driver de conexão do MySQL
		Class.forName("com.mysql.jdbc.Driver");

	}


	public static ConnectionManager getInstance() throws SQLException{

		try{

			if (instance == null) {
				instance = new ConnectionManager();
			}
		}
		catch(ClassNotFoundException e){

			throw new SQLException("O Driver JDBC nao foi encontrado!");

		}
		return instance;
	}


	// Abrir conexão com BD
	public Connection getConnection() throws SQLException {	


		try{

			return DriverManager.getConnection(STRING_CONNECTION, USER, PASS);

		}
		catch (SQLException e) {

			e.printStackTrace();
			throw new SQLException("Erro ao abrir a conexão com banco de dados", e);

		}
	}
}