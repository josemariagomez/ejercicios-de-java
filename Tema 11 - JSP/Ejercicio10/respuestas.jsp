<%-- 
    Document   : respuestas
    Created on : 30-ene-2019, 22:51:23
    Author     : jose_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cuestionario</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

    </head>
    <body>
        <%
          String preguntas[] = new String[10];
          int nota = 0;
          for (int i = 0; i < 10; i++) {
              preguntas[i] = request.getParameter("p" + (i + 1));
            }
          nota = preguntas[0].equals("a")? (nota + 1) : nota;
          nota = preguntas[1].equals("b")? (nota + 1) : nota;
          nota = preguntas[2].equals("c")? (nota + 1) : nota;
          nota = preguntas[3].equals("b")? (nota + 1) : nota;
          nota = preguntas[4].equals("a")? (nota + 1) : nota;
          nota = preguntas[5].equals("b")? (nota + 1) : nota;
          nota = preguntas[6].equals("c")? (nota + 1) : nota;
          nota = preguntas[7].equals("a")? (nota + 1) : nota;
          nota = preguntas[8].equals("c")? (nota + 1) : nota;
          nota = preguntas[9].equals("b")? (nota + 1) : nota;
        %>
        <div class="container-fluid">
            <h1>Cuestionario</h1><br>
            <h3>Tu nota ha sido un <%=nota%></h3>
            
            <a href="index.html"><input class="btn btn-primary" type="button" value="Volver a hacer el test" ></a>
        </div>
    </body>
</html>
