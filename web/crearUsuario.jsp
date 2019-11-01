<%-- 
    Document   : form-usuario
    Created on : 29/10/2019, 03:54:04 PM
    Author     : Ronald
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Agrega un nuevo usuario!</h1>
        <form action="CrearUsuario" method="post">
            <input name="user" type="text" placeholder="Escribe el nombre de tu usuario">
            <br>
            <input name="pass" type="text" placeholder="Escribe una contrasena" >
            <br>
            <input type="submit" value="Registra un usuario" >
        </form>
    </body>
</html>
