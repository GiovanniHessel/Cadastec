<%-- 
    Document   : login
    Created on : 08/10/2017, 12:55:08
    Author     : GIOVANNI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>PI</title>
    </head>
    <body>
        <c:import url="sys_cabecalho.jsp" />
        <div class="panel panel-default">
            <div class="panel-heading">Login</div>

            <div class="panel-body">
                <form action="Login" method="post">
                    <div class="form-group row">
                        <div class="col-xs-4">
                            <label for="inputlg"><b>Usuario</b></label>
                            <input type="text" class="form-control input-lg" placeholder="Digite seu usuario" name="usuario" required>
                        </div>
                    </div>
                    <div class="form-group row">
                        <div class="col-xs-4">
                            <label for="inputlg"><b>Senha</b></label>
                            <input type="password" class="form-control input-lg" placeholder="Digite sua senha" name="chave" required>
                        </div>
                    </div>
                    <div class="form-group row">
                        <div class="col-xs-4">
                            <div class="btn-group btn-group-justified">
                                <div class="btn-group">
                                    <button class="btn btn-primary" type="submit" >Login</button>
                                </div>
                                <div class="btn-group">
                                    <button class="btn btn-primary"  type="button" >Cancel</button>
                                </div>
                            </div>
                        </div>
                    </div>
            </div>
        </div>
        
        <div class="container" style="background-color:#f1f1f1">
            <span class="text">Esqueceu a <a href="#">senha?</a></span>
        </div>
    </form>
    
</div>
</div>
</body>
</html>

<%--
<span > Cadastrar conexão do <a href="cadastroConexao.jsp">banco de dados?</a></span>
    <p></p>
<div class="dropdown">
        <button class="btn btn-default dropdown-toggle" type="button" id="dropstatus" data-toggle="dropdown" aria-haspopup="true" aria-expanded="true">
            Conexões
            <span class="caret"></span>
        </button>
        <ul class="dropdown-menu" aria-labelledby="dropstatus">
            <c:forEach var="con" items="${connections}">
                <li><a href="CadastroConnectionServelet?conexao=${con.id}">${con.descricao}</a></li>
                </c:forEach>

        </ul>
    </div>
--%>