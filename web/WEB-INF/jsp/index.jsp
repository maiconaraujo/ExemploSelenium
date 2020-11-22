<%-- 
    Document   : index
    Created on : 05/07/2019, 10:27:32
    Author     : MAICON
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Sistema</h1>
        
        <a id="linkCadastro" href="<c:url value="/form" />">Cadastrar Cliente</a>
    </body>
</html>
