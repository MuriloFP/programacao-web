<%@page import="aula08.Contador"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Apresenta a quantidade de acessos a esta p�gina</title>
</head>
<body>
<%aula08.Contador.NovoAcesso(); %>

<p>Quantidade de acessos � esta p�gina:
<b><%= aula08.Contador.getQuantidadeAcessos() %></b></p>

<p>Acesso Inicial:
<b><%= aula08.Contador.getDataInicial() %></b></p>

<p>�ltimo Acesso:
<b><%= aula08.Contador.getUltimoAcesso() %></b></p>

<%aula08.Contador.updateUltimoAcesso(); %>


</body>
</html>