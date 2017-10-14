package br.com.fiap.tina1.bfy.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.tina1.bfy.bo.gerenciarconta.UsuarioBO;
import br.com.fiap.tina1.bfy.entidades.gerenciarconta.Usuario;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	UsuarioBO usuarioBO = new UsuarioBO();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		Usuario usuario = (Usuario) session.getAttribute("usuario");

		if(usuario != null) {
			resp.sendRedirect("account.jsp");
		}else {
			req.getRequestDispatcher("login.jsp").forward(req,resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String txtUsuario = req.getParameter("txtUsuario");
		String txtSenha = req.getParameter("txtSenha");

		Usuario usuario = new Usuario(txtUsuario, txtSenha);
		try {
			if((txtUsuario.trim().length() > 0) && (txtSenha.trim().length() > 0)){
				if(usuarioBO.loginUsuario(usuario)){

					//Iniciando a sessão
					HttpSession session = req.getSession();
					session.setAttribute("usuario", txtUsuario);

					//Redirecionando caso dê certo
					resp.sendRedirect("account.jsp");
				}
				
			}else{
				String errorLogin = "Usuário ou senha inválidos";
				req.setAttribute("errorLogin", errorLogin);
				req.getRequestDispatcher("login.jsp").forward(req, resp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
