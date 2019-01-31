<%-- 
    Document   : piramide
    Created on : 30-ene-2019, 19:18:33
    Author     : jose_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pinta pirámide</title>
        <style>
            * {
                padding: 0!important;
                margin: 0!important;
            }
        </style>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
    </head>
    <body>
        <div class="container-fluid">
            <h1>Pirámide construida.</h1>
            <table>
                <%
                  int alturaIntroducida = Integer.parseInt(request.getParameter("altura"));
                  int altura = 1;
                  int i = 0;
                  int espaciosPorDelante = alturaIntroducida - 1;
                  int espaciosInternos = 0;
                  String pico = "<th><img src='img/pico.png'></th>";
                  String relleno = "<th><img src='img/relleno1.png'></th>";
                  String derecha = "<th><img src='img/derecha.png'></th>";
                  String izquierda = "<th><img src='img/izquierda.png'></th>";

                  if (alturaIntroducida == 1) {
                    out.print(pico);
                  } else{
                  while (altura < alturaIntroducida) {
                    out.print("<tr>");
                    for (i = 1; i <= espaciosPorDelante; i++) {
                      out.print("<th> </th>");
                    }
                    if (altura == 1){
                      out.print(pico);
                    }else {
                      out.print(izquierda);
                    }
                    
                    for (i = 1; i < espaciosInternos; i++) {
                      out.print(relleno);
                    }

                    if (altura > 1) {
                      out.print(derecha);
                    }

                    out.println();
                    altura++;
                    espaciosPorDelante--;
                    espaciosInternos += 2;
                    out.print("</tr>");
                  }

                  for (i = 1; i < altura * 2; i++) {
                    if (i == 1){
                      out.print(izquierda);
                    } else if (i == (altura * 2) - 1){
                      out.print(derecha);
                    }else{
                      out.print(relleno);
                    }
                  }
                  }
                %> 
            </table>
            <a href="index.html"><input class="btn btn-primary" type="button" value="Elegir otro número" style="padding: 1%!important; margin: 1%!important;"></a>
        </div>
    </body>
</html>
