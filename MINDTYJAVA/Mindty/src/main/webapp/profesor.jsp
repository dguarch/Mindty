<!doctype html>
<html lang="es">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
        crossorigin="anonymous">

    <!-- Mindty CSS -->
    <link rel="stylesheet" href="./css/style.css">

    <!-- Font Awesome -->
    <script defer src="https://use.fontawesome.com/releases/v5.0.9/js/all.js" integrity="sha384-8iPTk2s/jMVj81dnzb/iFR2sdA7u06vHJyyLlAd4snFpCl/SnyUjRrbdJsw1pGIl"
        crossorigin="anonymous"></script>

    <title>Mindty</title>
</head>

<body>
    <!-- Navegación principal -->
    <nav id="menu" class="navbar navbar-expand-lg navbar-light">
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03"
            aria-expanded="false" aria-label="Toggle navigation">
            <i class="fas fa-bars"></i>
        </button>
        <a class="navbar-brand logo" href="./index.html">
            <h1>MINDTY</h1>
            <!-- ivan -->
        </a>
        <div>
            <img clas="cara" src="./images/if_user_318585.png" alt="user">
            <!-- ivan alt -->
            <img class="cara arrow" src="./images/flecha-desplegable.png" alt="desplegable">
            <!-- ivan -->
        </div>
        <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
            <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                <li class="nav-item">
                    <a class="nav-link" href="./coordinador.html">Coordinador
                    </a>
                </li>
                <li class="nav-item">
                    <a class="nav-link activeNav">Profesor</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="./alumno.html">Alumno</a>
                </li>
            </ul>
        </div>
    </nav>

    <!-- Breadcrumb -->
    <nav class="breadcrumb">
        <div>
            <a class="breadcrumb-item" href="#" title="Incio" alt="Incio" aria-label="Inicio">
                <i class="fas fa-home"></i>
            </a>
            <a class="breadcrumb-item" href="#" title="Curso" alt="Curso">Contenido</a>
            <span class="breadcrumb-item active" title="Añadir módulo" alt="Añadir módulo">Módulos</span>
        </div>
    </nav>

    <!-- Nombre seccion -->
    <section>
        <div id="ok"></div>
        <h2>Añadir módulo:</h2>
        <hr>

        <div class="row">
            <div class="col-10 col-sm-10 col-sm-10">
                <form class="form-inline">
                    <div class="form-group mx-sm-3 mb-2">
                        <div id="mensajes"></div>
                        <!-- ExpReg= /[A-Z]{3,} \d/ -->
                        <!-- ivan -->
                        <input type="text" pattern="[A-Z]{3,} \d" maxlength="5" class="form-control" id="code_modulo" placeholder="Código modulo" aria-label="Código modulo" required>


                    </div>
                    <div class="form-group mx-sm-3 mb-2">
                        <!-- ExpReg= /[aA-zZ]/ -->
                        <!-- ivan -->
                        <input type="text" minlength="4" class="form-control" id="nombre_modulo" placeholder="Nombre modulo" aria-label="Nombre modulo" required>

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
                <li class="nav-item">
                    <a class="nav-link moduloactive modulo" href="#">Modulo 1</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link modulo" href="#">Modulo 2</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link modulo" href="#">Modulo 3</a>
                </li>

            </ol>


            <!-- bloque de modulos -->
            <div id="unidades" class="col-sm-7">
                <ol>
                    <li>
                        <a href="#">Arquitectura de las apps</a>
                    </li>
                    <li>
                        <a href="#">Gestión de software</a>
                    </li>
                    <li>
                        <a href="#">Fundamentos UX</a>
                    </li>
                    <li>
                        <a href="#">Fundamentos desarrollo</a>
                    </li>
                    <li>
                        <a href="#">Fundamentos Java</a>
                    </li>
                    <!-- <ol>Boton-->
                            <button type="button" id="add" class="btn btn-success" aria-label="Añadir alumno">
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
        <footer>
            <div>
                <p>Diseñado por OVERFLOW
                    <br>&copy 2018</p>
            </div>
        </footer>
        </body>
        <!-- Optional JavaScript -->
        <script src="./js/jquery-3.3.1.min.js"></script>
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js " integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q "
            crossorigin="anonymous "></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js " integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl "
            crossorigin="anonymous "></script>
        <script src="./js/formValidationProfe.js"></script>
        <script src="./js/calendario.js"></script>


</html>