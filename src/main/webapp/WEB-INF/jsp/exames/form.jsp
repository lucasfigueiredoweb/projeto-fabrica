<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro</title>
<style type="text/css">
body {
	background-image: -webkit-gradient(linear, center top, center bottom, from(white),
		to(white));
}
</style>
</head>

<body>

	<br>
	<!-- 	<div style="text-align: center"> -->
	<font color="#00000"><font size=7>Exames Complementares </font></font>
	<br>
	<br>
	<br>
	<br>
	<br>
	<form method="post" action="<c:url value="/exames/save"></c:url>">
		<input type="hidden" name="exame.id" value="${exame.id}"> <label>Nome
			do Exame: </label> <br> <br>
		<textarea name="exame.nome" value="${exame.nome}" rows="2" cols="50"></textarea>
		<div></div>
		<br> <label>Descricao do(s) Resultado(s): </label> <br> <br>
		<textarea name="exame.resultado" value="${exame.resultado}"
			rows="10" cols="100"></textarea>
		<div></div>
		<br> <input type="image"
			src="http://serverlist.atrocity.cz/images/menu/add.png	"
			title="Adicionar" height="4%" width="3%">

		<div></div>
		<br>
	</form>
	</div>
	<br>
	<br>
	<br>

	<table border="1" cellpadding="10">
		<c:forEach items="${exames}" var="exame">
			<tr>
				<th>ID</th>
				<th>Exame</th>
				<th>Resultado</th>
				<th>Acoes</th>
			</tr>
			<tr>
				<td width=50>${exame.id}</td>
				<td width=250>${exame.nome }</td>
				<td width=500>${exame.resultado }</td>
				<td width=100><a href="editar/${exame.id}"><font
						color="red">Editar</font></a> <a href="remover/${exame.id}"><font
						color="red">Excluir</font></a></td>
		</c:forEach>
		</tr>
		<tr>
		</tr>
	</table>
	<tr>

		<!-- <ul> -->
		<%-- 	<c:forEach items="${exames}" var="exame"> --%>
		<!-- 	<label> ID </label>       <label> Exame </label>       <label> Resultado </label>  <label> Acoes </label> -->
		<!-- 	<br> -->
		<%-- 		 ${exame.id} --%>
		<%-- 		 ${exame.nome}  --%>
		<%-- 		 ${exame.resultado} --%>
		<!-- 		<hr> -->
		<%-- 	</c:forEach> --%>
		<!-- </ul> -->