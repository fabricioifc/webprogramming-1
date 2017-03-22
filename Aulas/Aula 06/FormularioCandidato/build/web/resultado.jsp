<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <fieldset>
            <legend>Informações do candidato</legend>
            <ul>
                <li>E-mail: <%= request.getParameter("email") %></li>
                <li>Nome: <%= request.getParameter("nome") %></li>
                <li>Sexo: <%= request.getParameter("sexo") %></li>
                <li>Curso: <%= request.getParameter("curso") %></li>
                <li>Endereço: <%= request.getParameter("endereco") %></li>
                <li>Complemento: <%= request.getParameter("complemento") %></li>
                <li>Cep: <%= request.getParameter("cep") %></li>
                <li>Município: <%= request.getParameter("municipio") %></li>
                <li>Estado: <%= request.getParameter("estado") %></li>
            </ul>
        </fieldset>
    </body>
</html>
