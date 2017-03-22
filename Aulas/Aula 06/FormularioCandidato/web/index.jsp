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
                <br />
                <label>Nome: </label>
                <input type="text" id="nome" name="nome" required />
                <br />
                Masculino: <input type="radio" id="masc" name="sexo" checked />
                Feminino: <input type="radio" id="masc" name="sexo" />
                <br />
                <label>Curso: </label>
                <select id="curso" name="curso" required>
                    <option value="">Selecione o Curso</option>
                    <option value="Curso Técnico em Informática">Curso Técnico em informática</option>
                    <option value="Curso Técnico em Alimentos">Curso Técnico em Alimentos</option>
                    <option value="Curso Técnico em Agropecuária">Curso Técnico em Agropecuária</option>
                </select>
                <br />
                <label>Endereço para correspondência: </label>
                <input type="text" id="endereco" name="endereco" required />
                <br />
                <label>Complemento do endereço: </label>
                <input type="text" id="complemento" name="complemento" required />
                <br />
                <label>CEP: </label>
                <input type="text" id="cep" name="cep" required />
                <br />
                <label>Município: </label>
                <input type="text" id="municipio" name="municipio" required />
                <select id="estado" name="estado" required>
                    <option value="">Selecione o Estado</option>
                    <option value="Santa Catarina">SC</option>
                    <option value="Rio Grande do Sul">RS</option>
                    <option value="Paraná">PR</option>
                </select>
                <br /><br />
                <input type="submit" value="Enviar" />
            </form>
        </fieldset>
    </body>
</html>
