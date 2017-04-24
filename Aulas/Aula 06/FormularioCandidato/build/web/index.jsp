<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <fieldset>
            <legend>Formulário de cadastro de candidatos</legend>
            <form action="CandidatoServlet" method="POST">
                <label>Endereço de e-mail: </label>
                <input type="text" id="email" name="email" required />
                <label>Nome: </label>
                <input type="text" id="nome" name="nome" required />
                Masculino: <input type="radio" id="masc" name="sexo" value="M" checked />
                Feminino: <input type="radio" id="fem" name="sexo" value="F" />
                <label>Curso: </label>
                <select id="curso" name="curso" required>
                    <option value="">Selecione o Curso</option>
                    <option value="Curso Técnico em Informática">Curso Técnico em informática</option>
                    <option value="Curso Técnico em Alimentos">Curso Técnico em Alimentos</option>
                    <option value="Curso Técnico em Agropecuária">Curso Técnico em Agropecuária</option>
                </select>
                <br /><br />
                <input type="submit" value="Enviar" />
            </form>
        </fieldset>
    </body>
</html>
