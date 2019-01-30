<%-- 
    Document   : cocheListo
    Created on : 29-ene-2019, 13:58:22
    Author     : jose_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Coche configurado</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

    </head>
    <body>
        <div class="container-fluid">
            <h1>Aquí tiene su coche.</h1>
            <img src="img/<%= request.getParameter("color")%><%= request.getParameter("llantas")%>.jpg">
        </div>

    </body>
</html>
