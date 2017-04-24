<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Confirmação das informações</h1>
        <form action='Confirmacao' method='POST'>
            Nome: <%= request.getParameter("nome")%><br />
            E-mail: <%= request.getParameter("email")%><br />
            <br />
            <input type='submit' value='Sim' name='sim' />
            <input type='submit' value='Não' name='nao' />
        </form>
    </body>
</html>
