
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%
//scriptlet

	// buscando valor enviado pelo forward do servlet NovaEmpresaServlet

	String nomeEmpresa = (String)request.getAttribute("Empresa");
	System.out.println(nomeEmpresa);
%>


<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrada com Sucesso</title>
</head>
<body>
	<p>
		Empresa
		<%= nomeEmpresa %>
		cadastrada com sucesso!
	</p>
</body>
</html>