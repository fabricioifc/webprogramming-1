<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="resources/css/bootstrap/css/bootstrap.css" type="text/css" rel="stylesheet" />
    </head>
    <body>
        <div class="container">
            <form method="POST" action="calcularMedia" class="form-horizontal">
                <fieldset>
                    <legend>Informações básicas</legend>
                    <!--Nome do aluno-->
                    <div class="form-group">
                        <label for="nome" class="control-label col-md-2">Nome: </label>
                        <div class="col-md-10">
                            <input class="form-control" type="text" value="" name="nome" id="nome" required="true" />
                        </div>
                    </div>
                    <!--Tipo-->
                    <div class="form-group">
                        <label class="control-label col-sm-2">Sexo</label>
                        <div class="col-md-10">
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" id="masculino" name="sexo" value="Masculino" checked>Masculino
                                </label>
                            </div>
                            <div class="checkbox">
                                <label>
                                    <input type="checkbox" id="feminino" name="sexo" value="Feminino">Feminino
                                </label>
                            </div>
                        </div>
                    </div>
                    <!--Disciplina para calcular as notas-->
                    <div class="form-group">
                        <label for="disciplina" class="control-label col-md-2">Disciplina: </label>
                        <div class="col-md-10">
                            <select class="form-control" id="disciplina" name="disciplina" required>
                                <option value="">Selecione a Disciplina</option>
                                <option value="Matemática">Matemática</option>
                                <option value="Português">Português</option>
                                <option value="Biologia">Biologia</option>
                                <option value="Redes">Redes</option>
                                <option value="Geografia">Geografia</option>
                            </select>
                        </div>
                    </div>

                    <!--Professor da disciplina-->
                    <div class="form-group">
                        <label class="control-label" for="professor">Professor: </label>
                        <select id="professor" name="professor" required>
                            <option value="">Selecione o Professor</option>
                            <option value="Maria">Maria</option>
                            <option value="Aline">Aline</option>
                            <option value="Marlon">Marlon</option>
                            <option value="Marcelo">Marcelo</option>
                            <option value="Felipe">Felipe</option>
                        </select>
                    </div>
                </fieldset>

                <!--Quatro notas-->
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

                    <!--Enviar informações do formulário-->
                    <input type="submit" value="Calcular" 
                           name="acao" id="acao" />
                </fieldset>
            </form>
        </div>
    </body>
</html>
