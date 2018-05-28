<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="es">

<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<!-- Mindty CSS -->
<link rel="stylesheet" href="./css/style.css">

<!-- Font Awesome -->
<script defer
	src="https://use.fontawesome.com/releases/v5.0.9/js/all.js"
	integrity="sha384-8iPTk2s/jMVj81dnzb/iFR2sdA7u06vHJyyLlAd4snFpCl/SnyUjRrbdJsw1pGIl"
	crossorigin="anonymous"></script>

<title>Mindty</title>
</head>

<body>
	<!-- Enlaçe del header -->
	<jsp:include page="./utils/header.jsp"></jsp:include>
	<!-- Fin header -->

	<!-- Breadcrumb -->
	<nav class="breadcrumb">
		<div>
			<a class="breadcrumb-item" href="#" title="Incio" alt="Incio"
				aria-label="Inicio"> <i class="fas fa-home"></i>
			</a> <a class="breadcrumb-item" href="#" title="Curso" alt="Curso">Contenido</a>
			<span class="breadcrumb-item active" title="Añadir modulo"
				alt="Añadir modulo">Modulos</span>
		</div>
	</nav>

	<!-- Nombre seccion -->
	<section>
		<div id="ok"></div>
		<h2>Añadir modulo:</h2>
		<hr>

		<div class="row">
			<div class="col-10 col-sm-10 col-sm-10">
				<form class="form-inline" action="" method="POST">
					<div class="form-group mx-sm-3 mb-2">
						<div id="mensajes"></div>
						<!-- ExpReg= /[A-Z]{3,} \d/ -->
						<!-- ivan -->
						<input type="text" pattern="[A-Z]{3,} \d" maxlength="5"
							class="form-control" id="code_modulo" placeholder="Código modulo"
							aria-label="Código modulo" required>


					</div>
					<div class="form-group mx-sm-3 mb-2">
						<!-- ExpReg= /[aA-zZ]/ -->
						<!-- ivan -->
						<input type="text" minlength="4" class="form-control"
							id="nombre_modulo" placeholder="Nombre modulo"
							aria-label="Nombre modulo" required>

					</div>


					<!-- <div id="btn_form" class="text-center"> -->
					<button id="btn_form" class="botons" aria-label="Guardar">
						<i class="fas fa-save fa-3x align-middle"></i>
					</button>
					<!-- </div>
                     <button id="btn_form">
                         <img id="prof_save" src="images/users/aqua-save-256.gif" alt=""></button>
                     <!-- ivan nombre boton -->



				</form>
			</div>
		</div>
	</section>

	<hr>

	<div class="row">
		<div id="modulos" class="col-sm-10 col-md-10">

			<ol class="nav nav-tabs">
				<li class="nav-item"><a class="nav-link moduloactive modulo"
					href="#">Modulo 1</a></li>
				<li class="nav-item"><a class="nav-link modulo" href="#">Modulo
						2</a></li>
				<li class="nav-item"><a class="nav-link modulo" href="#">Modulo
						3</a></li>

			</ol>


			<!-- bloque de modulos -->
			<div id="unidades" class="col-sm-7">
				<ol>
					<li><a href="#">Arquitectura de las apps</a></li>
					<li><a href="#">Gestion de software</a></li>
					<li><a href="#">Fundamentos UX</a></li>
					<li><a href="#">Fundamentos desarrollo</a></li>
					<li><a href="#">Fundamentos Java</a></li>
					<!-- <ol>Boton-->
					<button type="button" id="add" class="btn btn-success"
						aria-label="AÃ±adir alumno">
						<i class="fas fa-plus"></i>
					</button>
				</ol>
			</div>
		</div>

		<div id="calendario">

			</head>

			<body>
				<div id="formC">
					<h3>Calendario</h3>
					<!-- ivan -->
					<table id="calendar">
						<caption></caption>
						<thead>
							<tr>
								<th>Lun</th>
								<th>Mar</th>
								<th>Mie</th>
								<th>Jue</th>
								<th>Vie</th>
								<th>Sab</th>
								<th>Dom</th>
							</tr>
						</thead>
						<tbody>
						</tbody>
					</table>

				</div>
		</div>

		<!-- Copy right -->
		<!-- Inicio footer -->
		<!-- Enlaçe footer -->
		<jsp:include page="./utils/footer.jsp"></jsp:include>
		<!-- fin footer -->
</body>
<!-- Optional JavaScript -->
<script src="./js/jquery-3.3.1.min.js"></script>
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js "
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q "
	crossorigin="anonymous "></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js "
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl "
	crossorigin="anonymous "></script>
<script src="./js/formValidationProfe.js"></script>
<script src="./js/calendario.js"></script>


</html>