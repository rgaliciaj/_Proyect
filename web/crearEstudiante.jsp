<%-- 
    Document   : form-estudiante
    Created on : 29/10/2019, 03:52:21 PM
    Author     : Ronald
    
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Crea un estudiante!</h1>
        <form action="CrearEstudiante" method="post">
            <input name="carnet" type="text" placeholder="Escribe el carnet">
            <br>
            <input name="nombre" type="text" placeholder="Escribe el nombre">
            <br>
            <input name="nacimiento" type="data" placeholder="Fecha de nacimiento">
            <br>
            <input type="submit" value="Registrar">
        </form>
        <br><br>
    </body>
</html>
