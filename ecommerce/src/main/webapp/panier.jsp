<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %> 
<%@ page import="java.util.Set" %> 
<%@ page import="java.util.Iterator" %> 

<%@ page import="com.uvsq.colinebintou.ecommerce.modele.*" %> 
<%@ page import="com.uvsq.colinebintou.ecommerce.service.*" %> 
<%@ page import="javax.servlet.http.HttpSession" %> 
<!DOCTYPE html>
<jsp:useBean id="sonPanier" class="com.uvsq.colinebintou.ecommerce.modele.Panier" scope="session"></jsp:useBean>
<jsp:useBean id="client" class="com.uvsq.colinebintou.ecommerce.modele.Client" scope="session"></jsp:useBean>

<html lang="en">

<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

	<title>coline&Bintou</title>

	<!-- Google font -->
	<link type="text/css" rel="stylesheet" href="css/css-perso.css" />
	<link href="https://fonts.googleapis.com/css?family=Hind:400,700" rel="stylesheet">

	<!-- Bootstrap -->
	<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css" />

	<!-- Slick -->
	<link type="text/css" rel="stylesheet" href="css/slick.css" />
	<link type="text/css" rel="stylesheet" href="css/slick-theme.css" />

	<!-- nouislider -->
	<link type="text/css" rel="stylesheet" href="css/nouislider.min.css" />

	<!-- Font Awesome Icon -->
	<link rel="stylesheet" href="css/font-awesome.min.css">

	<!-- Custom stlylesheet -->
	<link type="text/css" rel="stylesheet" href="css/style.css" />

	<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
	<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
	<!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
		  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->

</head>

<body>
	<!-- HEADER -->
	<header>

		<!-- header -->
		<div id="header">
			<div class="container">
				<div class="pull-left">
					<!-- Logo -->
					<div class="header-logo">
						<a class="logo" href="index.jsp">
							<h1>Coline&Bintou</h1>
						</a>
					</div>
					<!-- /Logo -->

					<!-- Search -->
					<div class="header-search">
						<form action="recherche.do" method="post">
							<!-- <input class="input search-input" type="text" placeholder="Recherche"> -->
							<!--<select class="input search-categories">
								<option value="0">Toutes Categories</option>
								<option value="1">Livres</option>
								<option value="1">CD</option>
							</select>-->
							<button class="search-btn"><i class="fa fa-search"></i></button>
						</form>
					</div>
					<!-- /Search -->
				</div>
				<div class="pull-right">
		<h4><% if(client.getNom() != null) {out.println("Bonjour, "+client.getNom());} %></h4>
					<ul class="header-btns">
						<!-- Account -->
						<li class="header-account dropdown default-dropdown">
							<div class="dropdown-toggle" role="button" data-toggle="dropdown" aria-expanded="true">
								<div class="header-btns-icon">
									<i class="fa fa-user-o"></i>
								</div>
								<strong class="text-uppercase">Mon compte<i class="fa fa-caret-down"></i></strong>
							</div>
							
							<ul class="custom-menu">
							
								<%if(client.getNom() == null){out.println("<li><a href='Login.jsp'><i class='fa fa-unlock-alt'></i>Se Connecter</a></li><li><a href='Login.jsp'><i class='fa fa-user-plus'></i>S'inscrire</a></li>");
								}else{out.println("<li><form action='deconnexion.do' method='post'><i class='fa fa-unlock-alt'></i><button type='submit'>Se Déconnecter</button></form></li>");}%>
								</ul>
						</li>
						<!-- /Account -->

						<!-- Cart -->
					<li class="header-cart dropdown default-dropdown">
							<a class="dropdown-toggle" data-toggle="dropdown" aria-expanded="true">
								<div class="header-btns-icon">
									<i class="fa fa-shopping-cart"></i>
									<span class="qty"><%out.println(sonPanier.getArticles().size());%></span>
								</div>
								
							</a>
							<div class="custom-menu">
								<div id="shopping-cart">
									<div class="shopping-cart-list">
									
									<% 
									Iterator<IArticle> iterator = sonPanier.getArticles().iterator();
									while (iterator.hasNext()) {
									      Article myCurrentElement = (Article) iterator.next();
									      out.println("<div class='product product-widget'><div class='product-body'><h3 class='product-price'>"+myCurrentElement.getPrix()+" Euros</h3><h2 class='product-name'><a href='#'>"+myCurrentElement.getNom()+"</a></h2></div><button class='cancel-btn'><i class='fa fa-trash'></i></button></div>");
										}%>
									<div class="shopping-cart-btns">
										
										<form action="afficherPanier.do" method="post"><button type="submit" class="primary-btn"> Acheter <i class="fa fa-arrow-circle-right"></i></button></form>
									</div>
								</div>
							</div>
						</li>
						<!-- /Cart -->

						<!-- Mobile nav toggle-->
						<li class="nav-toggle">
							<button class="nav-toggle-btn main-btn icon-btn"><i class="fa fa-bars"></i></button>
						</li>
						<!-- / Mobile nav toggle -->
					</ul>
				</div>
			</div>
			<!-- header -->
		</div>
		<!-- container -->
	</header>
	<!-- /HEADER -->

	<!-- NAVIGATION -->
	<div id="navigation" >
		<!-- container -->
		<div class="container" >
			<div id="responsive-nav">
				<!-- category nav -->		
				<!-- /category nav -->

				<!-- menu nav -->
				<div class="menu-nav">
					<span class="menu-header">Menu<i class="fa fa-bars"></i></span>
					<div ALIGN="CENTER">
					<h3>
						<ul class="menu-list">
						<li><form action="afficheLivres.do" method="post"><button type="submit"  class="perso">Collections Livres</button></form></li>
						<li><form action="afficheCD.do" method="post"><button type="submit" class="perso">Collections CD</button></form></li>
						<li><form action="afficheDVD.do" method="post"><button type="submit" class="perso">Collections DVD</button></form></li>
						</ul>
				    </h3>
				   </div>
				</div>
				<!-- menu nav -->
			</div>
		</div>
		<!-- /container -->
	</div>
	<div id="header">
			<div class="container">
				<div class="">
					<div class="col-lg-12 col-md-12">
						<div class="order-summary clearfix">
							<div class="section-title">
								<h3 class="title">Votre Panier</h3>
							</div>
							
							<table class="shopping-cart-table table">
								<thead>
									<tr>
										<th>Articles</th>
										<th></th>
										<th class="text-center">Prix</th>
										<th class="text-center">Quantité</th>
										<th class="text-center">Total</th>
										<th class="text-right"></th>
									</tr>
								</thead>
								<tbody>
									<%Iterator<IArticle> iterator1 = sonPanier.getArticles().iterator();
									while (iterator1.hasNext()) {
									      Article myCurrentElement = (Article) iterator1.next();
									      int id = myCurrentElement.getId();
									      out.println("<tr><td class='thumb'></td><td class='details'>"+myCurrentElement.getNom()+"<ul><li><span></span></li></ul></td><td class='price text-center'><strong>"+myCurrentElement.getPrix()+"</strong></td><td class='qty text-center'><input class='input' type='number' value='1'></td><td class='total text-center'><strong class='primary-color'>"+myCurrentElement.getPrix()+" Euros</strong></td><td class='text-right'></td></tr>");}%>
								</tbody>
								<tfoot>
									<tr>
										<th class="empty" colspan="3"></th>
										<th>TOTAL</th>
										<th colspan="2" class="total"><%out.println(sonPanier.calculPrix()+" Euros");%></th>
									</tr>
								</tfoot>
							</table>
							<div class="pull-right">
								<form action="valider.do" method="post"><button type="submit" class="primary-btn">Valider votre commande</button></form>
							</div>
						</div>

					</div>
				</form>
			</div>
			<!-- /row -->
		</div>
		<!-- /container -->
	</div>
	
			<hr>
			<!-- row -->
			<div class="row">
				<div class="col-md-8 col-md-offset-2 text-center">
					<!-- footer copyright -->
					<div class="footer-copyright">
						<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
						Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | Coline&Bintou Projet JEE <i class="fa fa-heart-o" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Master 2 AMIS</a>
						<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
					</div>
					<!-- /footer copyright -->
				</div>
			</div>
			<!-- /row -->
		</div>
		<!-- /container -->
	</footer>
	<!-- /FOOTER -->

	<!-- jQuery Plugins -->
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/slick.min.js"></script>
	<script src="js/nouislider.min.js"></script>
	<script src="js/jquery.zoom.min.js"></script>
	<script src="js/main.js"></script>

</body>

</html>
