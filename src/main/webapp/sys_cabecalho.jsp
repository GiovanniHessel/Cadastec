<%-- 
    Document   : sys_cabecalho
    Created on : 10/04/2016, 05:05:54
    Author     : Giovanni
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8">

<link rel="stylesheet" href="css/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/js-bootstrap/bootstrap.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>
<!DOCTYPE html>


<header>
    <nav class="navbar navbar-inverse" id="navbar">
        <div class="container-fluid">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" 
                        data-toggle="collapse" data-target="#nav-menu">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.jsp">CADASTEC</a>
            </div>
            <div class="collapse navbar-collapse" id="nav-menu">
                <ul class="nav navbar-nav navbar-right">
                    <li><a href="index.jsp">Sobre</a></li>

                    <c:if  test="${usuario.id == 0 || usuario.id == null}">
                        <li><a href="Cadastro.jsp">Cadastro</a></li>
                    </c:if>


                    <li><a href="Eventos.jsp">Eventos</a></li>
                    <li><a href="index.jsp">Como Chegar</a></li>
                        <c:choose>
                            <c:when test="${usuario.id == 0 ||  usuario.id == null}">
                            <li><a href="login.jsp">Login</a></li>
                            </c:when>
                            <c:when test="${usuario.id > 0}">
                            <li><a href="Logout">Logout</a></li>
                            </c:when>
                        </c:choose>
                </ul>
            </div>
        </div>
    </nav>
</header>

<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="js/js-bootstrap/bootstrap.min.js"></script>
<script type="text/javascript" src="js/script.js"></script>