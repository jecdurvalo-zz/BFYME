<%@ page contentType="text/html; charset=ISO-8859-1" language="java" pageEncoding="UTF-8" import="java.sql.*" errorPage="" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>Bfy.me - Minha Conta</title>
    <link rel="stylesheet" href="css/styles.css">
  </head>
  <body>
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
        </nav><a class="btn btn-login" href="login.jsp">Entra</a>
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
    <main class="wrapper-account">
      <div class="wrapper-header-account">
        <div class="container-account"></div>
      </div>
      <div class="container-account">
        <ul class="tabs" role="tablist">
          <li>
            <input type="radio" name="tabs" id="tab1" checked>
            <label for="tab1" role="tab" ria-selected="true" aria-controls="panel1" tabindex="0">CLIENTE</label>
            <div class="tabs-content" role="tabpanel" aria-labelledby="cliente" aria-hidden="false" id="tab-content1">
              <ul class="tab">
                <li>
                  <input class="tab-input" type="radio" name="tabs2" checked id="tab-ag">
                  <label class="label-tab" for="tab-ag">Agendamento</label>
                  <div class="tab-content">
                    <div class="header-account">Meus Agendamentos</div>
                    <div class="content-account"> 
                      <div class="tb-account">
                        <div class="tb-account-cell"> 
                          <div class="tb-title">Profissional</div>
                          <div class="tb-content">
                            <h3>Tania Ferreira</h3>
                            <p>Manicure</p>
                            <p>Estrela</p>
                          </div>
                        </div>
                        <div class="tb-account-cell"> 
                          <div class="tb-title">Serviços</div>
                          <div class="tb-content">
                            <h3>Maquiagem Simples</h3>
                            <p>09/10/2017 à 17:00</p>
                            <p>Minha Casa</p>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                </li>
                <li>
                  <input class="tab-input" type="radio" name="tabs2" id="tab-dados">
                  <label class="label-tab" for="tab-dados">Dados Cadastrais</label>
                  <div class="tab-content">
                    <div class="header-account">Meus Dados Cadastrais</div>
                    <div class="content-account">
                      <div class="tb-account">
                        <div class="tb-account-cell"> 
                          <div class="tb-content">
                            <h4>Mantenha seu cadastro sempre atualizado</h4>
                            <input type="text" name="tabs2" placeholder="Nome">
                            <input type="text" name="tabs2" placeholder="CPF">
                            <input type="text" name="tabs2" placeholder="E-mail">
                            <input type="text" name="tabs2" placeholder="Telefone de contato">
                            <button class="btn">Salvar</button>
                          </div>
                        </div>
                        <div class="tb-account-cell"> 
                          <div class="tb-content">
                            <h4>Altere sua senha</h4>
                            <input type="text" name="tabs2" placeholder="Login">
                            <input type="password" name="tabs2" placeholder="Senha">
                            <input type="password" name="tabs2" placeholder="Confirme sua senha">
                            <button class="btn">Confirmar</button>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                </li>
                <li>
                  <input class="tab-input" type="radio" name="tabs2" id="tab-end">
                  <label class="label-tab" for="tab-end">Endereços</label>
                  <div class="tab-content tab-address">
                    <div class="header-welcome">
                      <h2 class="title">Olá Mariana!</h2>
                    </div>
                    <div class="header-account">
                      <h3 class="title">Meus endereços</h3>
                      <h4 class="subtitle">Informe abaixo o local onde deseja ser atendido, o profissional irá até o local.</h4>
                    </div>
                    <div class="content-account">
                      <div class="register-address">
                        <h3 class="title">Novo endereço:</h3>
                        <form class="form-address" action="">
                          <fieldset class="form-field">
                            <input class="form-input" type="text" placeholder="Logradouro">
                          </fieldset>
                          <fieldset class="form-field">
                            <input class="form-input" type="text" placeholder="Número">
                          </fieldset>
                          <fieldset class="form-field">
                            <input class="form-input" type="text" placeholder="Complemento">
                          </fieldset>
                          <fieldset class="form-field">
                            <input class="form-input" type="text" placeholder="Tipo de logradouro">
                          </fieldset>
                          <fieldset class="form-field">
                            <input class="form-input" type="text" placeholder="Bairro">
                          </fieldset>
                          <fieldset class="form-field">
                            <input class="form-input" type="text" placeholder="Digite o CEP">
                          </fieldset>
                          <button class="btn">Salvar Dados</button>
                        </form>
                      </div>
                      <div class="registered-address">
                        <h3 class="title">Meus endereços:</h3>
                        <div class="address active">
                          <div class="address-header">
                            <h4 class="title">Padrão</h4>
                            <div class="options"><a class="address-option edit" href="">editar</a><a class="address-option delete" href="">excluir</a></div>
                          </div>
                          <div class="address-body">
                            <h5 class="title">Minha casa</h5>
                            <p class="description">Rua Maria Candida 358</p>
                            <p class="description">Vila Guilherme</p>
                            <p class="description">11 941847444</p>
                          </div>
                        </div>
                        <div class="address">
                          <div class="address-header">
                            <h4 class="title">Secundário</h4>
                            <div class="options"><a class="address-option edit" href="">editar</a><a class="address-option delete" href="">excluir</a></div>
                          </div>
                          <div class="address-body">
                            <h5 class="title">Minha casa</h5>
                            <p class="description">Rua Maria Candida 358</p>
                            <p class="description">Vila Guilherme</p>
                            <p class="description">11 941847444</p>
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
                </li>
                <li>
                  <input class="tab-input" type="radio" name="tabs2" id="tab-desc">
                  <label class="label-tab" for="tab-desc">Código de desconto</label>
                  <div class="tab-content">
                    <div class="header-account">Meu Código de desconto</div>
                    <div class="content-account">Lorem ipsum dolor sit amet</div>
                  </div>
                </li>
              </ul>
            </div>
          </li>
          <li>
            <input type="radio" name="tabs" id="tab2">
            <label for="tab2" role="tab" aria-selected="false" aria-controls="panel2" tabindex="0">PROFISSIONAL</label>
            <div class="tabs-content" role="tabpanel" aria-labelledby="profissional" aria-hidden="true" id="tab-content2">
              <ul class="tab">
                <li>
                  <input class="tab-input" type="radio" name="tabs2" id="tab-agenda">
                  <label class="label-tab" for="tab-agenda">Agenda</label>
                  <div class="tab-content">
                    <div class="header-account">Agenda Profissional</div>
                    <div class="content-account">Lorem ipsum dolor sit amet</div>
                  </div>
                </li>
                <li>
                  <input class="tab-input" type="radio" name="tabs2" id="tab-serv">
                  <label class="label-tab" for="tab-serv">Meus serviços</label>
                  <div class="tab-content">
                    <div class="header-account">Serviços Prestados</div>
                    <div class="content-account">Lorem ipsum dolor sit amet</div>
                  </div>
                </li>
                <li>
                  <input class="tab-input" type="radio" name="tabs2" id="tab-hist">
                  <label class="label-tab" for="tab-hist">Histórico</label>
                  <div class="tab-content">
                    <div class="header-account">Hitstórico de Atendimentos</div>
                    <div class="content-account">Lorem ipsum dolor sit amet</div>
                  </div>
                </li>
                <li>
                  <input class="tab-input" type="radio" name="tabs2" id="tab-prof">
                  <label class="label-tab" for="tab-prof">Dados profissionais</label>
                  <div class="tab-content">
                    <div class="header-account">Meu Dados profissionais</div>
                    <div class="content-account">Lorem ipsum dolor sit amet</div>
                  </div>
                </li>
              </ul>
            </div>
          </li>
        </ul>
      </div>
    </main>
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