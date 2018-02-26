<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %> 
<%@ page import="java.util.Set" %> 
<%@ page import="java.util.Iterator" %> 

<%@ page import="com.uvsq.colinebintou.ecommerce.modele.*" %> 
<%@ page import="com.uvsq.colinebintou.ecommerce.service.*" %> 
<%@ page import="javax.servlet.http.HttpSession" %> 
<!DOCTYPE html>
<jsp:useBean id="lesLivres" class ="com.uvsq.colinebintou.ecommerce.service.ServiceRechercheLivreImpl" scope="session"></jsp:useBean>
<jsp:useBean id="client" class ="com.uvsq.colinebintou.ecommerce.modele.Client" scope="session"></jsp:useBean>
<jsp:useBean id="sonPanier" class="com.uvsq.colinebintou.ecommerce.modele.Panier" scope="session"></jsp:useBean>

<html lang="en">

<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->

	<title>coline&Bintou</title>

	<!-- Google font -->
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
	<% ArrayList<Livre> livres = lesLivres.findAllLivre();%>
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
						<form>
							<input class="input search-input" type="text" placeholder="Recherche">
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
							
								<li><a href="Login.jsp"><i class="fa fa-unlock-alt"></i>Se Connecter</a></li>
								<li><a href="Login.jsp"><i class="fa fa-user-plus"></i>S'inscrire</a></li>
							</ul>
						</li>
						<!-- /Account -->

						<!-- Cart -->
						 <li class="header-cart dropdown default-dropdown">
							<a class="dropdown-toggle" data-toggle="dropdown" aria-expanded="true">
								<div class="header-btns-icon">
									<i class="fa fa-shopping-cart"></i>
									<span class="qty">3</span>
								</div>
								
							</a>
							<div class="custom-menu">
								<div id="shopping-cart">
									<div class="shopping-cart-list">
									
									<% 
									Iterator<IArticle> iterator = sonPanier.getArticles().iterator();
									while (iterator.hasNext()) {
									      Article myCurrentElement = (Article) iterator.next();
									      out.println("<div class='product product-widget'><div class='product-body'><h3 class='product-price'>"+myCurrentElement.getPrix()+" Euros<span class='qty'>x3</span></h3><h2 class='product-name'><a href='#'>"+myCurrentElement.getNom()+"</a></h2></div><button class='cancel-btn'><i class='fa fa-trash'></i></button></div>");
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
						<li><a href="Livres.html">Collections Livres</a></li>
						<li><a href="CD.html">Collections CD</a></li>
						<li><a href="DVD.html">Collections DVD</a></li>
						</ul>
				    </h3>
				   </div>
				</div>
				<!-- menu nav -->
			</div>
		</div>
		<!-- /container -->
	</div>
	<div class="section">
		<!-- container -->
		<div class="container">
			<!-- row -->
			<div class="row">
				<!-- section title -->
				<div class="col-md-12">
					<div class="section-title">
						<h2 class="title">Vos Livres</h2>
					</div>
				</div>
				<!-- section title -->

				<!-- Product Single -->
				<%for (Livre l : livres){ 
				//HttpSession session =  request.getSession(true);
				//session.setAttribute("livre", l);
				int id = l.getId();
				out.println("<div class='col-md-3 col-sm-6 col-xs-6'> <div class='product product-single'> <div class='product-body'> <h3 class='product-price'>"+l.getPrix()+" Euros</h3><h3 class='product-name'>"+l.getNom()+"</h3><h5 class='product-auteur'>de "+l.getAuteur()+"</h5><h5 class='product-quantite'>Quantite :"+l.getQuantite()+"</h5><div class='product-btns'><form action='ajoutPanierLivre.do?id="+id+"' method='post'><button class='panier' type='submit' class=' btn btn-danger add-to-cart'><i class='fa fa-shopping-cart'></i>Ajouter au panier</button></form></div></div></div></div>");
				}%>
				<!-- /Product Single -->
			</div>
			<!-- /row -->
		</div>
		<!-- /container -->
	</div>
	<div class="col-md-3 col-sm-6 col-xs-6">
					
				</div>
				<!-- /footer subscribe -->
			</div>
			<!-- /row -->
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
