<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Cadastro de Cliente</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <script src="<c:url value="/resources/jquery-3.4.1.min.js" />" type="text/javascript" ></script>
        <script src="<c:url value="/resources/jquery.validate.js" />" type="text/javascript"></script>
        <script src="<c:url value="/resources/validacao.js" />" type="text/javascript" charset="UTF-8"></script>
    </head>

    <body>
        <h1>Cadastro de Cliente</h1>
        <hr>   

        <form action=" <c:url value="/cadastrar" />" method="post" id="formCliente">
            <label for="txtNome">Nome</label><br>
            <input type="text" name="nome" id="txtNome" required><br><br>

            <label for="txtCPF" >CPF (apenas números)</label><br>
            <input type="number" name="cpf" id="txtCPF" required><br><br>

            <label for="txtEmail">Email</label><br>
            <input type="email" name="email" id="txtEmail" required><br><br>

            <label for="sexo">Sexo:</label><br>
            <select name="sexo" id="sexo" required>
                <option value="">Selecione</option>
                <option value="Masculino">Masculino</option>
                <option value="Feminino">Feminino</option>
            </select><br><br>

            <button type="submit" id="bt">Cadastrar</button>
            <input type="reset" value="Limpar">
        </form>
    </body>
</html>
