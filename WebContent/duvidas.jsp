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
        <h2 class="title_default title_banner">Encontre as dúvidas mais comuns aqui</h2>
        <h3 class="subtitle_default subtitle_banner">Respostas às perguntas frequentes de clientes e profissionais</h3>
      </section>
    </div>
    <section class="quests">
      <div class="quest-user">
        <div class="container">
          <h3 class="title_default clearflex">Dúvidas</h3>
          <h4 class="subtitle_default clearflex">Aqui estão as principais dúvidas</h4>
          <h4 class="title_item">Clientes</h4>
          <div class="card card-faq">
            <div class="card-head">
              <h5 class="title">Como funciona?</h5>
              <button class="btn-plus">+</button>
            </div>
            <div class="card-details">
              <p class="text">Nosso e-commerce vende serviços de beleza delivery. O processo acontece desta forma: escolha a região que você está localizado, o serviço que deseja, o horário e o dia podendo agendar para o mesmo dia desde que seja com quatro horas de antecedência. O sistema vai buscar no nosso banco de talentos um profissional que atenda o serviço solicitado e que esteja ente 5 km a 8 km de distância do solicitante, ou seja, na mesma região.</p>
            </div>
          </div>
          <div class="card card-faq">
            <div class="card-head">
              <h5 class="title">Eu posso cancelar no mesmo dia do atendimento?</h5>
              <button class="btn-plus">+</button>
            </div>
            <div class="card-details">
              <p class="text">Sim, porém existe uma taxa de cancelamento de serviço equivalente a 50% do valor do serviço contratado.</p>
            </div>
          </div>
          <div class="card card-faq">
            <div class="card-head">
              <h5 class="title">Quais são as formas de pagamento?</h5>
              <button class="btn-plus">+</button>
            </div>
            <div class="card-details">
              <p class="text">Os pagamentos serão realizados integralmente pela plataforma do PagSeguro. Será aceito como forma de pagamento cartão de crédito e cartão de débito. Verifique no site do PagSeguro as operadoras de cartões aceitas.</p>
            </div>
          </div>
          <div class="card card-faq">
            <div class="card-head">
              <h5 class="title">Posso ser atendida novamente pelo mesmo profissional?</h5>
              <button class="btn-plus">+</button>
            </div>
            <div class="card-details">
              <p class="text">Sim, você poderá ser atendida com o mesmo profissional nos próximos agendamentos.</p>
            </div>
          </div>
          <h4 class="title_item">Profissionais</h4>
          <div class="card card-faq">
            <div class="card-head">
              <h5 class="title">Como eu faço meu cadastro?</h5>
              <button class="btn-plus">+</button>
            </div>
            <div class="card-details">
              <p class="text">Clique na opção do menu "Seja um profissional" para de cadastrar na plataforma do Bfy.me. O cadastro é o primeiro passo para iniciar seu trabalho como prestador de serviço. Após o cadastro completo, você receberá um e-mail de confirmação de cadastro e os seguintes passos. Seu e-mail de cadastro como profissional também pode ser utilizado para agendar um serviço com outro profissional.</p>
            </div>
          </div>
          <div class="card card-faq">
            <div class="card-head">
              <h5 class="title">Eu posso cancelar um atendimento?</h5>
              <button class="btn-plus">+</button>
            </div>
            <div class="card-details">
              <p class="text">Após o match realizado e as mensagens de aviso, você terá 20 minutos para responder ao chamado. Caso não queira, o serviço será passado a diante. Cancelar um serviço após esse processo gera multa para o prestador de serviço equivalente a 50% do valor do serviço que deveria ser prestado.</p>
            </div>
          </div>
          <div class="card card-faq">
            <div class="card-head">
              <h5 class="title">Eu posso fazer mais de um atendimento por dia?</h5>
              <button class="btn-plus">+</button>
            </div>
            <div class="card-details">
              <p class="text">Nosso sistema busca trabalhar de forma que garanta que todos os profissionais cadastrados no raio de distância correspondente de cada área consigam atendimentos, logo isso pode variar. Considerando que todos os profissionais livres na instância solicitada serão considerados para a escolha de um prestador.</p>
            </div>
          </div>
        </div>
      </div>
      <div class="container warn-quest">
        <h1 class="title">Ainda com dúvidas? Mande uma mensagem para nós!</h1>
        <button class="btn open-modal-faq">Enviar mensagem</button>
      </div>
    </section>
    <div class="modal-overlay"></div>
    <div class="modal">
      <button class="btn-close-modal"></button>
      <div class="container">
        <form class="form-faq">
          <fieldset class="form-field">
            <label for="">Digite seu nome</label>
            <input type="text">
          </fieldset>
          <fieldset class="form-field">
            <label for="">Digite seu e-mail</label>
            <input type="text">
          </fieldset>
          <fieldset class="form-field">
            <label for="">Digite o assunto da mensagem</label>
            <input type="text">
          </fieldset>
          <textarea class="text-faq" name="" cols="30" rows="10"></textarea>
          <button class="btn" type="submit">Enviar</button>
        </form>
      </div>
    </div>
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