<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <form method="POST" action="calcularMedia">
                <fieldset>
                    <legend>Calcular a média do aluno</legend>
                    <label for="nome">Nome</label>
                    <input type="text" value="" name="nome" 
                           id="nome" required="true" />
                    <label for="nome">Nota 1</label>
                    <input type="text" value="" name="n1" 
                           id="n1" required="true" />
                    <label for="nome">Nota 2</label>
                    <input type="text" value="" name="n2" 
                           id="n2" required="true" />
                    <label for="nome">Nota 3</label>
                    <input type="text" value="" name="n3" 
                           id="n3" required="true" />
                    <label for="nome">Nota 4</label>
                    <input type="text" value="" name="n4" 
                           id="n4" required="true" />
                    <input type="submit" value="Calcular" 
                           name="acao" id="acao" />
                </fieldset>
            </form>
        </div>
    </body>
</html>
