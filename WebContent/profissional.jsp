<%@ page contentType="text/html; charset=ISO-8859-1" language="java" pageEncoding="UTF-8" import="java.sql.*" errorPage="" %>
<!DOCTYPE html>
<html>
  <head>
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>Bfy.me</title>
    <link rel="stylesheet" href="css/styles.css">
  </head>
  <body id="duvidas">
    <div class="foo banner_default">
      <header>
        <div class="container-header"><a class="brand" href="index.html">
            <svg>
              <use xlink:href="images/icons.svg#logo"></use>
            </svg></a>
          <input type="checkbox" id="label-login" name="login">
          <label class="label-login" for="label-login"><span class="icon-hamburguer"></span></label>
          <nav class="menu">
            <ul class="menu-navegation">
              <li class="item hidden-lg"> <a href="login.jsp">Entrar</a></li>
              <li class="item servicos"><a href="#dropdown">Serviços
                  <div class="icon-arrow"></div>
                  <div id="dropdown"><a class="menu-link-dropdown" href="servicos.jsp">Maquiagem</a><a class="menu-link-dropdown" href="servicos.jsp">Massagem</a><a class="menu-link-dropdown" href="servicos.jsp">Manicure</a><a class="menu-link-dropdown" href="servicos.jsp">Podologia</a><a class="menu-link-dropdown" href="servicos.jsp">Penteado</a></div></a></li>
              <li class="item"><a href="duvidas.jsp">Dúvidas</a></li>
              <li class="item"><a href="profissional.jsp">Seja um profissional</a></li>
            </ul>
          </nav><a class="btn btn-login" href="login.jsp">Entrar</a>
          <!--input(type="checkbox" name="menu-account" id="menu-account")-->
          <!--label(for="menu-account").btn.btn-login.label-menu-account
          | Olá, Mariana
          .arrow-menu
          -->
          <!--ul.menu-account
          li: a(href="#") Minha Conta
          li: a(href="#") Conta Profissional
          li: a(href="#") Sair da Conta
          -->
        </div>
      </header>
      <section class="main-banner">
        <h2 class="title_default title_banner">Seja um Profissional</h2>
        <h3 class="subtitle_default subtitle_banner">Lorem ipsum lorem ipsum lorem ipsum</h3>
      </section>
    </div>
    <section class="profissional">
      <div class="container">
        <h3 class="title_default clearflex">Como funciona para o profissional?</h3>
        <h4 class="subtitle_default clearflex">Processos simples que trazem uma renda extra</h4>
        <div class="item-profissional">
          <h5 class="title">Match</h5>
        </div>
        <div class="item-profissional">
          <h5 class="title">Ordem de Serviço</h5>
        </div>
        <div class="item-profissional">
          <h5 class="title">Comissão</h5>
        </div>
      </div>
    </section>
    <section class="cta_profissional">
      <h1 class="title">Conheça todas as nossas vantagens. Seja nosso parceiro.</h1>
      <button class="btn">Seja um parceiro Bfy.me</button>
    </section>
    <section class="advantages">
      <h3 class="title_default clearflex">Vantagens</h3>
      <h4 class="subtitle_default clearflex">É muito simples de usar, vaja abaixo as dicas</h4>
      <article class="card-profissional">
        <h5 class="title">Compromisso</h5>
        <p class="description">Assim que o cliente finalizar o agendamento e seu pagamento enviaremos imediatamente a você a confirmação com todos os dados do serviço.</p>
      </article>
      <article class="card-profissional">
        <h5 class="title">Controle</h5>
        <p class="description">Assim que o cliente finalizar o agendamento e seu pagamento enviaremos imediatamente a você a confirmação com todos os dados do serviço.</p>
      </article>
      <article class="card-profissional">
        <h5 class="title">Tempo</h5>
        <p class="description">Assim que o cliente finalizar o agendamento e seu pagamento enviaremos imediatamente a você a confirmação com todos os dados do serviço.</p>
      </article>
    </section>
    <footer class="foo footer">
      <div class="container">
        <div class="brand"><img src="images/bfyme.svg" alt=""></div>
        <div class="social">
          <p class="description_mini">Conheça nossa plataforma e aproveite as vantagens de utilizar serviços delivery</p>
          <div class="icons"><a class="social-link" href="#" title="Facebook"><img src="images/icons/icon-facebook.svg" alt="Facebook"></a><a class="social-link" href="#" title="Instagram"><img src="images/icons/icon-instagram.svg" alt="Instagram"></a><a class="social-link" href="#" title="Twitter"><img src="images/icons/icon-twitter.svg" alt="Twitter"></a><a class="social-link" href="#" title="Google Plus"><img src="images/icons/icon-google.svg" alt="Google Plus"></a></div><span>Bfy.me - Todos os direitos reservados 2017</span>
        </div>
      </div>
    </footer>
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="js/main.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.7.1/slick.min.js"></script>
  </body>
</html>