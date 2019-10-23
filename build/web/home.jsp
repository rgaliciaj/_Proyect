<%-- 
    Document   : homee
    Created on : 13/10/2019, 07:43:50 PM
    Author     : Ronald Galicia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"/>
        <nav class="navbar navbar-light bg-light">
        <a class="navbar-brand" href="#">
            <img src="/docs/4.3/assets/brand/bootstrap-solid.svg" width="30" height="30" class="d-inline-block align-top" alt="">
            Bienvenido : <%= session.getAttribute("username") %>
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
                    <a href="#" class="btn btn-primary">Entrar</a>
                </div>
            </div>
            </div>
            <div class="col-sm-6">
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title">Special title treatment</h5>
                    <p class="card-text">Registra un estudiantet.</p>
                    <a href="#" class="btn btn-primary">Entrar</a>
                </div>
            </div>
            </div>
        </div>
        <div class="row">
         <div class="col-sm-6">
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title">Special title treatment</h5>
                    <p class="card-text">Agrega una inscripcion</p>
                    <a href="#" class="btn btn-primary">Entrar</a>
                </div>
            </div>
            </div>
            <div class="col-sm-6">
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title">Special title treatment</h5>
                    <p class="card-text">Inscribir estudiante.</p>
                    <a href="#" class="btn btn-primary">Entrar</a>
                </div>
            </div>
            </div>
        </div>
        <div class="row">
         <div class="margen-personalizado">
            <div class="card">
                <form method="POST" action="UsersController"  > 
                    <div class="card-body">
                        <h5 class="card-title">Special title treatment </h5>
                        <p class="card-text">te apreciamos :3.</p>
                        <a href="index.html" class="btn btn-primary" name="expire" >Salir</a>
                    </div>
                </form>
                
            </div>
            </div>
        </div>
    </body>
    <style>
        .margen-personalizado {
            display: flex;
            justify-content : center;
        }
    </style>
</html>
