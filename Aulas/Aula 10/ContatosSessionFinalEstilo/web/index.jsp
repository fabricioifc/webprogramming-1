<%@page import="java.util.List"%>
<%@page import="br.com.ifc.entidades.Contato"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link type="text/css" rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css">
        <script type="text/javascript" src="resources/bootstrap/js/bootstrap.min.js"></script>
        <style type="text/css">
            body {
                margin-top: 60px;
                background-color: #f5f5f5;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <p><a href="adicionarContato?acao=inserir">Adicionar</a></p>
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Nome</th>
                        <th>E-mail</th>
                        <th colspan="2">Ações</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="contato" items="${contatos}" >
                        <tr>
                            <td>${contato.nome}</td>
                            <td>${contato.email}</td>
                            <td><a href="adicionarContato?acao=editar&email=<c:out value="${contato.email}"/>">Editar</a></td>
                            <td><a href="adicionarContato?acao=excluir&email=<c:out value="${contato.email}"/>">Excluir</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
