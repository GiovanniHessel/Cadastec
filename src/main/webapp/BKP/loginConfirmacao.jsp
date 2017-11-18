<%-- 
    Document   : loginConfirmacao
    Created on : 02/10/2017, 22:56:00
    Author     : GIOVANNI
--%>

<%@page contentType="text/html"  pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PI</title>
    </head>
    <body>
        <c:choose>
            <c:when test="${login}">
                <h1>Login efetuado com sucesso</h1>
            </c:when>
            <c:when test="${! login}">
                <h1>Usuario ou senha incorretos</h1>
            </c:when>
        </c:choose>
        <c:choose>
            <c:when test="${afonso}">
                <h1>Login efetuado com sucesso</h1>
            </c:when>
            <c:when test="${! afonso}">
                <h1>Usuario ou senha incorretos</h1>
            </c:when>
        </c:choose>
    </body>
</html>
