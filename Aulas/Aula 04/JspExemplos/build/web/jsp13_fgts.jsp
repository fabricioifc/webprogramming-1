<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FGTS</title>
    </head>
    <body>
        <h1>Calcular FGTS</h1>

        <%
            String nome = request.getParameter("nome");
            Double salario = request.getParameter("salario") == null
                    ? null
                    : Double.parseDouble(request.getParameter("salario"));
            Integer periodo = request.getParameter("periodo") == null
                    ? null
                    : Integer.parseInt(request.getParameter("periodo"));

            Double resultado = (salario == null || periodo == null)
                    ? null
                    : salario * periodo * 0.08;

        %>

        <form action="jsp13_fgts.jsp" method="POST">
            Nome: <input type="text" name="nome" 
                         value="<%= nome == null ? "" : nome%>" />
            Salário: <input type="text" name="salario" 
                            value="<%= salario == null ? "" : salario%>" />
            Período: <input type="text" name="periodo" 
                            value="<%= periodo == null ? "" : periodo%>" /> <br /> <br />
            <input type="submit" value="Calcular" />
        </form>

        <%if (resultado != null) {%>
            <p>Resultado: <%= resultado%></p>
        <%}%>

    </body>
</html>
