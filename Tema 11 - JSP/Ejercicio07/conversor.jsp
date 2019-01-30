<%-- 
    Document   : conversor
    Created on : 30-ene-2019, 10:02:03
    Author     : jose_
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conversor de euros y pesetas</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

    </head>
    <body style="background-image: url('img/tile.png')" class="text-center">
        <%
          double cantidad = Double.parseDouble(request.getParameter("cantidad"));
          String moneda1 = request.getParameter("tipoDeConversion").equals("pesetasAEuros")? "pesetas" : "euros";
          String moneda2 = moneda1.equals("pesetas")? "euros" : "pesetas";
          DecimalFormat dosDecimales = new DecimalFormat("0.00");
          double cantidadFinal = moneda1.equals("pesetas")? (cantidad / 166.386) : (cantidad * 166.386);
        %>
        <div class="container-fluid" style="background-color: rgba(255, 255, 255, 0.7); height: 100vh; padding: 1vh;">
            <h1>Conversor de euros y pesetas</h1>
            <h3 style="margin: 5vh"><%=dosDecimales.format(cantidad) + " " + moneda1%> son <%=(dosDecimales.format(cantidadFinal) + " " + moneda2)%></h3>
            <a href="index.html"><input class="btn btn-primary" type="button" value="Convertir otra cantidad" ></a>
        </div>
    </body>
</html>
