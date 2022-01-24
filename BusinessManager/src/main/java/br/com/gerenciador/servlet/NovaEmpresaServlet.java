package br.com.gerenciador.servlet;

import java.awt.geom.RoundRectangle2D;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
		
		// trabalhando com par�metros
		String nomeEmpresa = request.getParameter("nome");
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		
		// simulando um banco
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		// chamando o JSP para visualizar a mensagem com um despachador de requisi��o
		RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
		
		// utilizando a requisi��o e setar o valor para a requisi��o
		request.setAttribute("Empresa", empresa.getNome());
		
		// envia os dois objetos ao caminho especificado
		rd.forward(request, response);
		
		System.out.println("Empresa: "+ nomeEmpresa +"\nStatus: registrada");
	}

}
