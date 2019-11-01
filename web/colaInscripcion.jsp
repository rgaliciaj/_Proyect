<%-- 
    Document   : cola-inscripcion
    Created on : 29/10/2019, 03:54:58 PM
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
        <h1>Agregar a la cola de inscripcion!</h1>
        <form method="post" action="InscripcionCOntroller" >
            <input type="hidden" name="hacerIncripcion" value="inscrip">
            <input  type="submit" value="ver elementos para pasar a cola" >
        </form>
        <br><br>
    </body>
</html>
