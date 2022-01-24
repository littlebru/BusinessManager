<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.List, br.com.gerenciador.servlet.Empresa" %>
    
<%
	List<Empresa> empresas = (List<Empresa>)request.getAttribute("EmpresasCadastradas");
	// verificando existencia de empresas cadastradas
	
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2> Empresas Cadastradas</h2>
	<ul>
	<%
		for (Empresa empresa: empresas){
	%>
	
	<li> <%= empresa.getNome() %> </li>
	
	<% 
		}
	%>
	</ul>

</body>
</html>
