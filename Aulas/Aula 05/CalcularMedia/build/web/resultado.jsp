<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
        <link href="resources/css/bootstrap/css/bootstrap.css" type="text/css" rel="stylesheet" />
    </head>
    <body>
        <p class="well">
            <%= "A média do aluno "
                    + request.getParameter("nome")
                    + " do sexo "
                    + request.getParameter("sexo")
                    + ", na disciplina de "
                    + request.getParameter("disciplina")
                    + ", com o professor "
                    + request.getParameter("professor")
                    + ", referente as notas ("
                    + request.getParameter("n1") + ", "
                    + request.getParameter("n2") + ", "
                    + request.getParameter("n3") + ", "
                    + request.getParameter("n4")
                    + ") foi de: " + request.getAttribute("media")%>
        </p>
        <p><a href="index.jsp">Página inicial</a></p>
    </body>
</html>
