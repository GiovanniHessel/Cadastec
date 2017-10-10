<%-- 
    Document   : cadadastroConexao
    Created on : 08/10/2017, 11:44:29
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
        <form id="cadastroConexao" action="CadastroConnectionServelet" method="POST" enctype="multipart/form-data">
            <div class="form-group">
                <label for="porta">Numero da porta:</label><br />
                <input id="porta" class="form-control" name="porta" type="text" value="1433"  maxlength="5"/><br />
            </div>
            <div class="form-group">
                <label for="Descricao">Descrição:</label><br />
                <input id="descricao" class="form-control" name="descricao" type="text" value=""  maxlength="50"/><br />
            </div>
            <div class="form-group">
                <label for="host">Host</label><br />
                <input id="host" class="form-control" name="host" type="text" value="localHost"  maxlength="30"/><br />
            </div>
            <div class="form-group">
                <label for="base">Nome do banco:</label><br />
                <input id="base" class="form-control" name="base" type="text" value="DB_EVENTOS"  maxlength="30"/><br />
            </div>
            <div class="form-group">
                <label for="login">Nome do Logon:</label><br />
                <input id="login" class="form-control" name="login" type="text" value="sa"  maxlength="30"/><br />
            </div>
            <div class="form-group">
                <label for="senha">Senha:</label><br />
                <input id="senha" class="form-control" name="senha" type="password" value="" maxlength="30"/><br />
            </div>
            <div class="form-group">
                <label for="drive">Drive:</label><br />
                <input id="drive" class="form-control" name="drive" type="text" value="com.microsoft.sqlserver.jdbc.SQLServerDriver" size="30" maxlength="300"/><br />
            </div>
            <input id="bntGravar" class="btn btn-success" type="submit" value="Gravar" />
        </form>	
    </body>
</html>
