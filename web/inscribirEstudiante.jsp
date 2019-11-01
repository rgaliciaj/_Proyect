<%-- 
    Document   : inscribir-estudiante
    Created on : 29/10/2019, 03:55:58 PM
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
        <h1>Aqui se encuentran todas las inscripciones realizadas Clickea !</h1>
        <form action="VerIncripcionesController" method="post">
            <input type="hidden" name="enviarValor" value="insc">
            <input type="submit" name="enviarEstudianteACola"  value="Realizar inscripcion" >
        </form>
    </body>
</html>
