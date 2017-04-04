<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        
    </head>
    <body>
        <div>
            <p>Fórmula: IMC = PESO / (ALTURA * ALTURA)</p>
        </div>
        <div>
            <p><%= request.getAttribute("mensagens")%></p>
        </div>
        <fieldset>
            <legend>Calcular IMC</legend>
            <form name="formulario" action="CalcularIMC">
                Nome: <input type="text" name="nome" />
                Masculino: <input type="radio" name="sexo" value="M" />
                Feminino: <input type="radio" name="sexo" value="F" />
                Peso: <input type="text" name="peso" />
                Altura: <input type="text" name="altura" />
                <input type="submit" name="salvar" value="Calcular" />
            </form>
        </fieldset>
        <div>
            IMC: <%= request.getAttribute("imc")%>
        </div>
    </body>
</html>
