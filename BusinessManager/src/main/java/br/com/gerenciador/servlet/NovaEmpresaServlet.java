package br.com.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Cadastrando nova empresa...");
		
		// trabalhando com parâmetros
		String nomeEmpresa = request.getParameter("nome");
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		
		// simulando um banco
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		// Mensagem que aparecerá no browser
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<p> Empresa "+ nomeEmpresa +" cadastrada com sucesso! </p>");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("Empresa: "+ nomeEmpresa +"\nStatus: registrada");
	}

}
