<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.lang.String" %> 
<!DOCTYPE html>
<jsp:useBean id="password1" class ="java.lang.String" scope="session"></jsp:useBean>
<jsp:useBean id="password2" class ="java.lang.String" scope="session"></jsp:useBean>

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
	<!-- HEADER -->
	<header>

		<!-- header -->
		<div id="header">
			<div class="container">
				<div class="pull-left">
					<!-- Logo -->
					<div class="header-logo">
						<a class="logo" href="index.html">
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
						<!-- <li class="header-cart dropdown default-dropdown">
							<a class="dropdown-toggle" data-toggle="dropdown" aria-expanded="true">
								<div class="header-btns-icon">
									<i class="fa fa-shopping-cart"></i>
									<span class="qty"></span>
								</div>
								
							</a>
							<div class="custom-menu">
								<div id="shopping-cart">
									<div class="shopping-cart-list">
										<div class="product product-widget">
											<div class="product-thumb">
												<img src="./img/thumb-product01.jpg" alt="">
											</div>
											<div class="product-body">
												<h3 class="product-price">$32.50 <span class="qty">x3</span></h3>
												<h2 class="product-name"><a href="#">Product Name Goes Here</a></h2>
											</div>
											<button class="cancel-btn"><i class="fa fa-trash"></i></button>
										</div>
										<div class="product product-widget">
											<div class="product-thumb">
												<img src="./img/thumb-product01.jpg" alt="">
											</div>
											<div class="product-body">
												<h3 class="product-price">$32.50 <span class="qty">x3</span></h3>
												<h2 class="product-name"><a href="#">Product Name Goes Here</a></h2>
											</div>
											<button class="cancel-btn"><i class="fa fa-trash"></i></button>
										</div>
									</div>
									<div class="shopping-cart-btns">
										
										<a href="panier.html" class="primary-btn"> Acheter <i class="fa fa-arrow-circle-right"></i></a>
									</div>
								</div>
							</div>
						</li> -->
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
	<div class="section">
		<!-- container -->
		<div class="container">
			<!-- row -->
			<div class="row">
				
					<div class="col-md-6">
						<form action="connexion.do" method="post" id="checkout-form" class="clearfix">
						<div class="billing-details">
							
							<div class="section-title">
								<h3 class="title">Connexion</h3>
							</div>
							<div class="form-group">
								<input required class="input" type="email" name="email" placeholder="Email">
							</div>
							<div class="form-group">
									
							<input required class="input" type="password" name="password" placeholder="Entrez votre mot de passe">
							</div>
							<button type="submit" class="btn btn-success btn-lg">Se Connecter</button>
						</div>
					</form>
					</div>

				
				<form action="inscription.do" method="post" id="checkout-form" class="clearfix">
					<div class="col-md-6">
						<div class="billing-details">
							
							<div class="section-title">
								<h3 class="title">Créer votre compte</h3>
							</div>
							<% if(password1 != null && password2 != null){
						if(!password1.equals(password2)){
							out.println("<div class='alert alert-danger fade in'> <a href='#' class='close' data-dismiss='alert'>&times;</a> <strong>Error!</strong> <a href='#' class='alert-link'>problem</a>: Les mots de passe ne sont pas identiques. </div>");
} }%>
							<div class="form-group">
								<input required class="input" type="text" name="nom" placeholder="Nom">
							</div>
							<div class="form-group">
								<input required class="input" type="email" name="email" placeholder="Email">
							</div>
							<div class="form-group">
									
							<input required class="input" type="password" name="password" placeholder="Entrez votre mot de passe">
							
						</div>
						<div class="form-group">
									
							<input required class="input" type="password" name="confirmPassword" placeholder="Confirmez votre mot de passe">
							</div>
							<button type="submit" class="btn btn-primary btn-lg">S'inscrire</button>
					</div>
				</form>
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
