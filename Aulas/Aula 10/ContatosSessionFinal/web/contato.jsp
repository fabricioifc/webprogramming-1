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
        <form action="adicionarContato" method="POST">
            <% Contato c = (Contato) request.getAttribute("contato");%>
            Email: <input type="text" name="email" <%= c == null ? "" : "readonly" %>
                          value="<%= c == null ? "" : c.getEmail() %>" />
            <br/>
            Nome: <input type="text" name="nome" 
                         value="<%= c == null ? "" : c.getNome() %>" />
            <br/>

            <input type="submit" value="Gravar"/>
        </form>
    </body>
</html>
