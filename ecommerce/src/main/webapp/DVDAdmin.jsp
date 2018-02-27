<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %> 
<%@ page import="com.uvsq.colinebintou.ecommerce.modele.*" %> 
<%@ page import="com.uvsq.colinebintou.ecommerce.service.*" %> 
<!DOCTYPE html>
<jsp:useBean id="admin" class ="com.uvsq.colinebintou.ecommerce.modele.Administrateur" scope="session"></jsp:useBean>
<jsp:useBean id="lesDVD" class ="com.uvsq.colinebintou.ecommerce.service.ServiceRechercheDVDImpl" scope="session"></jsp:useBean>

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
						<a class="logo" href="adminHome.jsp">
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
				<h4><% if(admin.getNom() != null) {out.println("Bonjour, "+admin.getNom());} %></h4>
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
						<li class="dropdown default-dropdown"><a class="dropdown-toggle" data-toggle="dropdown" aria-expanded="true">Admin <i class="fa fa-caret-down"></i></a>
							<ul class="custom-menu">
								<li><a href="ajoutArticle.jsp">Ajouter</a></li>
							</ul>
						</li>
						</ul>
				    </h3>
				   </div>
				</div>
				<!-- menu nav -->
			</div>
		</div>
		<!-- /container -->
	</div>
	<!-- /NAVIGATION -->
<div id="header">
			<div class="container">
				<div class="">
					<div class="col-lg-12 col-md-12">
						<div class="order-summary clearfix">
							<div class="section-title">
								<h3 class="title">DVD</h3>
							</div>
							
							<table class="shopping-cart-table table">
								
								<tbody>
									<%ArrayList<DVD> ds = lesDVD.findAllDVD();
									for(DVD d : ds){
									      out.println("<tr><td class='thumb'></td><td class='details'><a href='#'>"+d.getNom()+"</a><ul><li><span>de: "+d.getRealisateur()+"</span></li><li></ul></td><td class='price text-center'><a href='' class='btn btn-success '> Modifier <i class='fa fa-arrow-circle-plus'></i></a></td><td class='text-right'><a href='' class='btn btn-danger'> Supprimer </a></td></tr>");}%>
								</tbody>
								
							</table>
							
						</div>

					</div>
				</form>
			</div>
			<!-- /row -->
		</div>
		<!-- /container -->
	</div>
	
		
	<!-- HOME -->
	
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
