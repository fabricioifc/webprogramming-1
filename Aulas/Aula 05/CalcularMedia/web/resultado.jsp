<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
    </head>
    <body>
        <p>
            <%= "A média do aluno "
                    + request.getParameter("nome") + " referente as notas ("
                    + request.getParameter("n1") + ", "
                    + request.getParameter("n2") + ", "
                    + request.getParameter("n3") + ", "
                    + request.getParameter("n4")
                    + ") foi de: " + request.getAttribute("media")%>
        </p>
        <p><a href="index.jsp">Página inicial</a></p>
    </body>
</html>
