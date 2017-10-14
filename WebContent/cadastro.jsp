<%@ page contentType="text/html; charset=ISO-8859-1" language="java" pageEncoding="UTF-8" import="java.sql.*" errorPage="" %>
<!DOCTYPE html>
<html>
  <head>
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>Bfy.me</title>
    <link rel="stylesheet" href="css/styles.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.7.1/slick.min.css">
  </head>
  <body>
    <div class="foo">
      <div class="foo-login"></div>
      <div class="container">
        <div class="modal-login">
          <div class="modal-image">
            <h1 class="title">Entre e aproveite nossos serviços</h1>
            <h2 class="subtitle">Sua beleza a toda hora</h2>
          </div>
          <form class="modal-form register-form" action="CadastroUsuario" method="post">
            <h3 class="title">Cadastro de novo usuário</h3>
            <fieldset class="register-field">
              <label class="login-label" for="nomeCadastro">Qual seu nome?</label>
              <input class="login-input" type="text" name="nomeCadastro" id="nomeCadastro" placeholder="Digite seu nome" required>
            </fieldset>
            <fieldset class="register-field">
              <label class="login-label" for="usuarioCadastro">Crie um nome de usuário</label>
              <input class="login-input" type="text" name="usuarioCadastro" id="usuarioCadastro" placeholder="Digite um nome de usuÃ¡rio" required>
            </fieldset>
            <fieldset class="register-field">
              <label class="login-label" for="emailCadastro">Qual seu e-mail?</label>
              <input class="login-input" type="text" name="emailCadastro" id="emailCadastro" placeholder="Digite seu e-mail" required>
            </fieldset>
            <fieldset class="register-field">
              <label class="login-label" for="dataNascCadastro">Data de Nascimento</label>
              <input class="login-input" type="date" name="dataNascCadastro" id="dataNascCadastro" placeholder="Digite seu e-mail" required>
            </fieldset>
            <fieldset class="register-field">
              <label class="login-label" for="cpfCadastro">Informe seu CPF</label>
              <input class="login-input" type="text" name="cpfCadastro" id="cpfCadastro" placeholder="Digite seu CPF" required>
            </fieldset>
            <fieldset class="register-field">
              <label class="login-label" for="senhaCadastro">Crie sua senha</label>
              <input class="login-input" type="password" name="senhaCadastro" id="senhaCadastro" placeholder="Digite sua senha" required>
            </fieldset>
            <fieldset class="register-field">
              <label class="login-label" for="senhaConfirma">Confirme sua senha</label>
              <input class="login-input" type="password" name="senhaConfirma" id="senhaConfirma" placeholder="Digite novamente sua senha" required>
            </fieldset>
            <button class="btn" type="submit">Salvar meus dados</button>
          </form>
        </div>
        <button class="btn btn-back-login"><a href="index.html">Voltar</a></button>
      </div>
    </div>
  </body>
</html>