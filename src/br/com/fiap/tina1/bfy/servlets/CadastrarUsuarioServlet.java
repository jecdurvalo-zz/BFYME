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

@WebServlet("/CadastroUsuario")
public class CadastrarUsuarioServlet extends HttpServlet{
	
	UsuarioBO usuarioBO = new UsuarioBO();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		Usuario usuario = (Usuario) session.getAttribute("usuario");
			
		if(usuario!=null) {
			resp.sendRedirect("account.jsp");
		}else {
			req.getRequestDispatcher("index.jsp").forward(req,resp);
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nomeCadastro = req.getParameter("nomeCadastro");
		String usuarioCadastro = req.getParameter("usuarioCadastro");
		String emailCadastro = req.getParameter("emailCadastro");
		String cpfCadastro = req.getParameter("cpfCadastro");
		String dataNascCadastro = req.getParameter("dataNascCadastro");
		String senhaCadastro = req.getParameter("senhaCadastro");	
		//Comparar
		String senhaConfirma = req.getParameter("senhaConfirma");
	
		
		Usuario usuario = new Usuario(nomeCadastro, usuarioCadastro, emailCadastro, cpfCadastro, dataNascCadastro, senhaCadastro);
		
		try {
			if((usuarioCadastro.trim().length() > 0) && (senhaCadastro.trim().length() > 0)){
				if(senhaCadastro.equals(senhaConfirma)){
					if(usuarioBO.cadastrarUsuario(usuario)){
						
						//Iniciando a sessão
						HttpSession session = req.getSession();
						session.setAttribute("usuario", usuario);
						
						//Redirecionando caso dê certo
						resp.sendRedirect("account.jsp");
					}
				}else{
					//ARRUMAR ERRO
					String errorSenha = "Senhas incompatíveis";
					req.setAttribute("errorSenha", errorSenha);
					req.getRequestDispatcher("index.jsp").forward(req, resp);	
				}
					
			}else{
				//ARRUMAR ERRO
				String errorCadastro = "Erro ao cadastrar. Tente novamente.";
				req.setAttribute("errorCadastro", errorCadastro);
				req.getRequestDispatcher("index.jsp").forward(req, resp);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
