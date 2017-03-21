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
                    <legend>Informações básicas</legend>
                    <label for="nome">Nome: </label>
                    <input type="text" value="" name="nome" id="nome" required="true" />
                    <label for="masculino">Masculino</label>
                    <input type="radio" name="sexo" id="masculino" value="Masculino" checked>
                    <label for="feminino">Feminino</label>
                    <input type="radio" name="sexo" id="feminino" value="Feminino">
                    <label for="disciplina">Disciplina: </label>
                    <select id="disciplina" name="disciplina" required>
                        <option value="">Selecione a Disciplina</option>
                        <option value="Matemática">Matemática</option>
                        <option value="Português">Português</option>
                        <option value="Biologia">Biologia</option>
                        <option value="Redes">Redes</option>
                        <option value="Geografia">Geografia</option>
                    </select>
                    <label for="professor">Professor: </label>
                    <select id="professor" name="professor" required>
                        <option value="">Selecione o Professor</option>
                        <option value="Maria">Maria</option>
                        <option value="Aline">Aline</option>
                        <option value="Marlon">Marlon</option>
                        <option value="Marcelo">Marcelo</option>
                        <option value="Felipe">Felipe</option>
                    </select>
                </fieldset>
                <fieldset>
                    <legend>Notas</legend>
                    <label for="n1">Nota 1</label>
                    <input type="text" value="" name="n1" 
                           id="n1" required="true" />
                    <label for="n2">Nota 2</label>
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
