<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
    </head>
    <body>
        <p><a href="index.jsp">Página inicial</a></p>

        <% if (session.getAttribute("alunos") != null) {%>
        <table border="1">
            <thead>
                <tr>
                    <th>Nome</th>
                    <th>Sexo</th>
                    <th>Disciplina</th>
                    <th>Professor</th>
                    <th>Notas</th>
                    <th>Média</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="aluno" items="<%= session.getAttribute("alunos")%>">
                    <tr>
                        <td>${aluno.nome}</td>
                        <td>${aluno.sexo == 'M' ? 'Masculino' : 'Feminino'}</td>
                        <td>${aluno.disciplina}</td>
                        <td>${aluno.professor}</td>
                        <td>
                            <c:forEach items="${aluno.notas}" var="nota">
                                <c:out value="${nota}" />
                            </c:forEach>
                        </td>
                        <td>${aluno.media}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
        <% } else {%>
        <p>Nenhum aluno encontrado!</p>
        <% }%>
    </body>
</html>
