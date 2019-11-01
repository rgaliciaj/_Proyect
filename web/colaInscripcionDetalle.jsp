<%-- 
    Document   : colaInscripcionDetalle
    Created on : 31/10/2019, 10:48:15 AM
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
        <h1>Pasar valor correspondiente a la cola!</h1>
        <form action="EfectuarInscripcionController" method="post">
            <input type="hidden" name="enviarValor" value="insc">
            <input type="submit" name="enviarEstudianteACola"  value="Enviar estudiante a cola" >
        </form>
    </body>
</html>
