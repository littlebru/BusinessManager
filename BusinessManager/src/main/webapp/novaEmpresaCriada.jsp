<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastrada com Sucesso</title>
</head>
<body>
	<p align="center">
		<c:if test="${not empty empresa}">
				Empresa ${ empresa } cadastrada com sucesso!
				
				<a url="">Visualizar empresas cadastradas</a>
		</c:if>
		
		<c:if test="${empty empresa}">
	
				ERRO: N�o foi possivel realizar o cadastro  <br>
				( O nome da empresa n�o foi informado )
		</c:if>
	</p>
	
</body>
</html>