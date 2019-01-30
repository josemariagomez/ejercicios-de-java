<%-- 
    Document   : tabla
    Created on : 30-ene-2019, 18:31:03
    Author     : jose_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tablas de multiplicar</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

    </head>
    <body>

        <div class="container-fluid">
            <h1>Tablas de multiplicar</h1>
            <table>
                <%
                  int numero = Integer.parseInt(request.getParameter("numero"));
                  for (int i = 1; i < 11; i++) {
                    out.print("<tr><th>" + numero + "</th><th>X</th><th>" + i + "</th><th>" + (numero * i) + "</th></tr>");
                  }
                %> 
            </table>
            <a href="index.html"><input class="btn btn-primary" type="button" value="Elegir otro número" ></a>
        </div>
    </body>
</html>
