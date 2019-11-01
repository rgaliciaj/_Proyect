<%-- 
    Document   : index
    Created on : 29/10/2019, 11:05:25 AM
    Author     : Ronald
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"/>
        <title>JSP Page</title>
    </head>
    <body>
        <center>
        <form method="post" action="UsuariosController" >
        <img  src="Logo_UMG.png"  class="img-responsive" width="200" height="150" >
        <br><br>
        <div class="form-group">
            <label >Usuario</label>
            <input name="nick" type="text" placeholder="Escribe tu usuario"  >
        </div>
        
        <div class="form-group">
            <label>Password</label>
            <input name="pass" type="password" placeholder="Escribe tu contraseña">
        </div>
        <button type="submit" class="btn btn-primary">Login</button>
    </form>
    </center>
        <!-- -->
    </body>
</html>
