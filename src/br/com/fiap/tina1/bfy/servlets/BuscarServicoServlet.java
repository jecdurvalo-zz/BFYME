package br.com.fiap.tina1.bfy.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.fiap.tina1.bfy.bo.servico.ServicoBO;
import br.com.fiap.tina1.bfy.entidades.servico.Servico;

@WebServlet("/buscar")
public class BuscarServicoServlet extends HttpServlet{
		
	ServicoBO servicoBO = new ServicoBO();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		
		//Pegando o parâmetro do form
		String busca = req.getParameter("buscarServico");
		
		try {
			List<Servico> servicos = new ArrayList<>();
			servicos.add() //servicoBO.mostraServicos(busca);
			req.setAttribute("servicos", servicos);
			
			req.getRequestDispatcher("servicos.jsp").forward(req, resp);
			
			
		} catch (Exception e) {
			String error = e.getMessage();
			req.setAttribute("erros", error); //mandando pro JSP	
			req.getRequestDispatcher("servicos.jsp").forward(req, resp);
		}	
	}
}
