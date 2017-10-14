package br.com.fiap.tina1.bfy.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.tina1.bfy.bo.gerenciarconta.TelefoneBO;
import br.com.fiap.tina1.bfy.entidades.gerenciarconta.Telefone;

@WebServlet("/CadastrarTelefone")
public class CadastrarTelefoneServlet extends HttpServlet{
	
	TelefoneBO telefoneBO = new TelefoneBO();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int telefoneContato = Integer.parseInt(req.getParameter("telefone"));
		int ddd = Integer.parseInt(req.getParameter("ddd"));
		String tipoTelefone = req.getParameter("tipoTelefone");
		//tipo
		
		Telefone telefone = new Telefone(telefoneContato,ddd, tipoTelefone);
		

	}
		
}
