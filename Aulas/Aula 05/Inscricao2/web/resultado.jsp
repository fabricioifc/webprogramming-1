<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h3>Prezado <%= request.getSession().getAttribute("nome")%></h3>
        <% if (request.getParameter("sim") != null) { %>
        <p>Sua inscrição foi confirmada com sucesso!</p>
        <% } else {%>
        <p>Sua inscrição não foi confirmada! Tente novamente!</p>
        <%}%>
        <p><a href='#' onclick='history.back()'>Voltar</a></p>
    </body>
</html>
