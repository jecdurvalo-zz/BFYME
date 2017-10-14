package br.com.fiap.tina1.bfy.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.tina1.bfy.entidades.gerenciarconta.Usuario;

public class AccountServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Usuario usuario = new Usuario();
		req.setAttribute("usuario", usuario);
	}
	
}
