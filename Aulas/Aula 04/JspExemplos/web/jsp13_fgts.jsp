<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FGTS</title>
    </head>
    <body>
        <%!
            String nome = null;
            Double salario = null, resultado = null;
            Integer periodo = null;
        %>

        <fieldset>
            <legend>Calcular FGTS</legend>
            <form action="jsp13_fgts.jsp" method="POST">
                Nome: <input type="text" name="nome" autofocus
                             value="<%= nome == null ? "" : nome%>" />
                Salário: <input type="text" name="salario" 
                                value="<%= salario == null ? "" : salario%>" />
                Período: <input type="text" name="periodo" 
                                value="<%= periodo == null ? "" : periodo%>" />
                <input type="submit" value="Calcular" />
            </form>
        </fieldset>

        <%

            if (!request.getParameter("nome").equals("")
                    && !request.getParameter("salario").equals("")
                    && !request.getParameter("periodo").equals("")) {

                nome = request.getParameter("nome");
                salario = Double.parseDouble(request.getParameter("salario"));
                periodo = Integer.parseInt(request.getParameter("periodo"));
                resultado = salario * periodo * 0.08;
            }

        %>


        <fieldset>
            <legend>Resultado</legend>
            <% if (resultado != null) {%>
                O funcionário <%= nome %> recebeu R$<%= resultado %> de FGTS por <%= periodo %> meses.
            <%}%>
        </fieldset>

    </body>
</html>
