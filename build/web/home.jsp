<%-- 
    Document   : menu
    Created on : 29/10/2019, 11:48:55 AM
    Author     : Ronald
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"/>
        <nav class="navbar navbar-light bg-light">
        <a class="navbar-brand" href="#">
            Bienvenido :  <%= session.getAttribute("user") %>
        </a>
        </nav>
        <title>JSP Page</title>
    </head>
        <body>
    <br>
        <div class="row">
         <div class="col-sm-6">
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title">Special title treatment</h5>
                    <p class="card-text">Registra un nuevo usuario.</p>
                    <a href="crearUsuario.jsp"  class="btn btn-primary">Entrar</a>
                </div>
            </div>
            </div>
            <div class="col-sm-6">
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title">Special title treatment</h5>
                    <p class="card-text">Registra un estudiantet.</p>
                    <a href="crearEstudiante.jsp" class="btn btn-primary">Entrar</a>
                </div>
            </div>
            </div>
        </div>
        <div class="row">
         <div class="col-sm-6">
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title">Special title treatment</h5>
                    <p class="card-text">Agrega un estudiante a la cola </p>
                    <a href="colaInscripcion.jsp" class="btn btn-primary">Entrar</a>
                </div>
            </div>
            </div>
            <div class="col-sm-6">
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title">Special title treatment</h5>
                    <p class="card-text">Inscripciones.</p>
                    <a  href="inscribirEstudiante.jsp" class="btn btn-primary">Entrar</a>
                </div>
            </div>
            </div>
        </div>
        <div class="row">
         <div class="margen-personalizado">
            <div class="card">
                <form method="post" action="UsuariosController" >
                    <div class="card-body">
                        <h5 class="card-title">Special title treatment </h5>
                        <p class="card-text">te apreciamos :3.</p>
                        <input type="hidden" name="outSession" value="out" >
                        <input type="submit" class="btn btn-primary" value="Salir" >
                    </div>
                </form>                 
            </div>
            </div>
        </div>
    </body>
    
</html>
