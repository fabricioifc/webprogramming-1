<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fibonacci</title>
    </head>
    <body>

        <%
            Integer numero = request.getParameter("numero") == null ? 1 : Integer.parseInt(request.getParameter("numero"));
        %>

        <%!
            static long fibo(int n) {
                return (n < 2) ? n : fibo(n - 1) + fibo(n - 2);
            }
        %>

        <form action="jsp12_fibonacci.jsp" method="POST">
            Número inteiro: <input type="text" name="numero" value="<%= numero%>" />
            <input type="submit" value="Calcular fibonacci" />
        </form>

        <% if (numero != null) {%>
        <p>
            <% for (int i = 1; i <= numero; i++) {%>
            <%= fibo(i)%><span>, </span>
            <% }%>
        </p>
        <% }%>
    </body>
</html>
