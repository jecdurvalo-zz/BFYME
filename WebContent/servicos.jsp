<%@ page contentType="text/html; charset=ISO-8859-1" language="java"
	pageEncoding="UTF-8" import="java.sql.*" errorPage=""%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="br.com.fiap.tina1.bfy.entidades.servico.Servico"%>
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
	<div class="foo banner_default banner-services">
		<header>
			<div class="container-header">
				<a class="brand" href=""> <svg>
              <use xlink:href="images/icons.svg#logo"></use>
            </svg></a> <input type="checkbox" id="label-login" name="login">
				<label class="label-login" for="label-login"><span
					class="icon-hamburguer"></span></label>
				<nav class="menu">
					<ul class="menu-navegation">
						<li class="item hidden-lg"><a href="#login">Entrar</a></li>
						<li class="item servicos"><a href="#dropdown">Serviços
								<div class="icon-arrow"></div>
								<div id="dropdown">
									<a class="menu-link-dropdown" href="">Maquiagem</a><a
										class="menu-link-dropdown" href="">Massagem</a><a
										class="menu-link-dropdown" href="">Manicure</a><a
										class="menu-link-dropdown" href="">Podologia</a><a
										class="menu-link-dropdown" href="">Penteado</a>
								</div>
						</a></li>
						<li class="item"><a href="duvidas.jsp">Dúvidas</a></li>
						<li class="item"><a href="profissional.jsp">Seja um
								profissional</a></li>
					</ul>
				</nav>
				<a class="btn btn-login" href="#login">Entrar</a>
				<!--input(type="checkbox" name="menu-account" id="menu-account")-->
				<!--label(for="menu-account").btn.btn-login.label-menu-account
          | OlÃ¡, Mariana
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
			<h2 class="title_default title_banner">Conheça os nossos
				serviços de beleza</h2>
			<h3 class="subtitle_default subtitle_banner">Há uma gama de
				serviços diversificados para você conhecer!</h3>
		</section>
	</div>
	<section class="services">
		<div class="wrapper-foo">
			<div class="container">
				<h3 class="title_default clearflex">Maquiagem</h3>
				<h4 class="subtitle_default clearflex">Descubra nossas opções
					de serviço</h4>
				<div class="services-filter">
					<form class="services-form" action="buscar" method="get">
						<fieldset class="field">
							<input class="input-form" type="search" name="buscarServico"
								placeholder="Digite o serviço que gostaria de buscar">
						</fieldset>
						<button class="btn" type="submit">Procurar</button>

					</form>

					<c:if test="${ not empty servicos }">
						<c:forEach var="s"
							items="${servicos}"> 
					${s}
					
					</c:forEach>
					</c:if>

					<c:if test="${ empty servicos }">
						<p  style="color:black">Não há items para exibir!</p>
					</c:if>


				</div>
				<div class="services-box">
					<div class="service-item">
						<div class="service-item-details">
							<h4 class="title">Maquiagem</h4>
							<span class="time">45 minutos</span>
							<p class="text">Festas de casamento, formatura ou aquela
								ocasião especial pedem destaque para sua beleza e a maquiagem é
								uma ótima forma de completar o look</p>
						</div>
						<div class="service-item-price">
							<p class="price">
								R$ <span>110</span>
							</p>
							<button class="btn">Agendar</button>
						</div>
					</div>
					<div class="service-item">
						<div class="service-item-details">
							<h4 class="title">Maquiagem artística</h4>
							<span class="time">45 minutos</span>
							<p class="text">Precisa de uma maquiagem para aquela festa a
								fantasia ou até para uma apresentação no teatro? A maquiagem
								artística é perfeita para essas ocasiões.</p>
						</div>
						<div class="service-item-price">
							<p class="price">
								R$ <span>130</span>
							</p>
							<button class="btn">Agendar</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<footer class="foo footer">
		<div class="container">
			<div class="brand">
				<img src="images/bfyme.svg" alt="">
			</div>
			<div class="social">
				<p class="description_mini">Conheça nossa plataforma e aproveite
					as vantagens de utilizar serviços delivery</p>
				<div class="icons">
					<a class="social-link" href="#" title="Facebook"><img
						src="images/icons/icon-facebook.svg" alt="Facebook"></a><a
						class="social-link" href="#" title="Instagram"><img
						src="images/icons/icon-instagram.svg" alt="Instagram"></a><a
						class="social-link" href="#" title="Twitter"><img
						src="images/icons/icon-twitter.svg" alt="Twitter"></a><a
						class="social-link" href="#" title="Google Plus"><img
						src="images/icons/icon-google.svg" alt="Google Plus"></a>
				</div>
				<span>Bfy.me - Todos os direitos reservados 2017</span>
			</div>
		</div>
	</footer>
	<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
	<script src="js/main.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/slick-carousel/1.7.1/slick.min.js"></script>
</body>
</html>