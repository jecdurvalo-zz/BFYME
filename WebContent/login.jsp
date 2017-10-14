<%@ page contentType="text/html; charset=ISO-8859-1" language="java"
	pageEncoding="UTF-8" import="java.sql.*" errorPage=""%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width,initial-scale=1">
<title>Bfy.me</title>
<link rel="stylesheet" href="css/styles.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.7.1/slick.min.css">
</head>
<body>
	<!-- Buscando erros -->
	<%String errorLogin = (String) request.getAttribute("errorLogin"); %>
	<% if(errorLogin != null) { %>
	<div class="error"><%= errorLogin%></div>
	<% } %>
	<!-- Buscando erros -->

	<div class="foo">
		<div class="foo-login"></div>
		<div class="container">
			<div class="modal-login">
				<div class="modal-image">
					<h1 class="title">Entre e aproveite nossos serviços</h1>
					<h2 class="subtitle">Sua beleza a toda hora</h2>
				</div>
				<form class="modal-form" action="login" method="post">
					<fieldset class="login-field">
						<label class="login-label" for="txtUsuario">Usuário</label> <input
							class="login-input" type="text" name="txtUsuario" id="txtUsuario"
							placeholder="Digite seu usuário" required>
					</fieldset>
					<fieldset class="login-field">
						<label class="login-label" for="senha">Senha</label> <input
							class="login-input" type="password" name="txtSenha" id="txtSenha"
							placeholder="Digite sua senha" required>
					</fieldset>
					<button class="btn" type="submit">Entrar</button>
					<a class="forgot-psw" href="#">Esqueci minha senha!</a><span
						class="do-account">Ainda não tem cadastro? <a
						href="cadastro.jsp">Clique aqui</a></span>
				</form>
			</div>
		</div>
	</div>
</body>
</html>