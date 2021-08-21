<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form class="form-agenda" method="post" action="ServletAgenda">
	<div class ="form-titulo">
		<h1>Registre seus dados</h1>
	</div>
	
	<div class="form-row">
		<label>
			<span>Nome</span>
			<input type="text" name="nome">
		</label>
	</div>
	<div class="form-row">
		<label>
			<span>Número de Telefone</span>
			<input type="text" name="telefone">
		</label>
	</div>
	<div class="form-row">
		<label>
			<span>Data de Nascimento</span>
			<input type="text" name="datanasc">
		</label>
	</div>
	<div class="form-row">
		<button type="submit">Registrar</button>
	</div>
</form>

</body>
</html>