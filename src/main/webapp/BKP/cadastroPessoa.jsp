<%-- 
    Document   : cadastroPessoa
    Created on : 13/11/2017, 22:15:21
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

    <body text=”#000000”>
        <c:import url="sys_cabecalho.jsp" />

        <div class="panel panel-default">
            <div class="panel-heading">Cadastro Pessoa</div>

            <div class="panel-body">
                <form action="Pessoa" method="post">
                    <div class="form-group row">
                        <div class="col-xs-4">
                            <label for="inputlg"><b>Nome</b></label>
                            <input type="text" class="form-control input-lg" placeholder="Digite seu nome" name="nome" required>
                        </div>
                    </div>
                    <div class="form-group row">
                        <div class="col-xs-4">
                            <label for="inputlg"><b>Sobrenome</b></label>
                            <input type="text" class="form-control input-lg" placeholder="Digite seu sobrenome" name="sobreNome" required>
                        </div>
                    </div>
                    <div class="form-group row">
                        <div class="col-xs-4">
                            <label for="inputlg"><b>CPF</b></label>
                            <input type="text" class="form-control input-lg" placeholder="Digite seu CPF" name="CPF" required>
                        </div>
                    </div>
                    <div class="form-group row">
                        <div class="col-xs-4">  
                             <label class="control-label" for="date">Data de Nascimento</label>
                             <input class="form-control" id="date" name="dataDeNascimento" placeholder="DD/MM/YYY" type="date" required>
                        </div>
                    </div>

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
                    <div class="form-group">
                        <input type="hidden" name="tipo" value="0" required>
                    </div>
                    <div class="form-group row">
                        <div class="col-xs-4">
                            <div class="btn-group btn-group-justified">
                                <div class="btn-group">
                                    <button class="btn btn-primary" type="submit" >Cadastrar</button>
                                </div>
                                <div class="btn-group">
                                    <button class="btn btn-primary"  type="button" >Cancel</button>
                                </div>
                            </div>
                        </div>
                    </div>
            </div>
        </div>

        <c:import url="sys_rodape.jsp" />
    </body>
</html>
