<%@page import="java.util.List"%>
<%@page import="br.com.ifc.entidades.Contato"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p><a href="adicionarContato?acao=inserir">Adicionar</a></p>
        <table border="1">
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
    </body>
</html>
