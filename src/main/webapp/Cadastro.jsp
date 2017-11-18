<%-- 
    Document   : Cadastro
    Created on : 17/11/2017, 18:18:20
    Author     : GIOVANNI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="widht-device-width, initial-scale-1"
              >
        <title>CadasTec</title>


    </head>
    <body>
        <c:import url="sys_cabecalho.jsp" />

        <div class="container">
            <div class="row text-center">
                <h3 class="title">CADASTRO</h3>
            </div>
            <div class="row">
                <div class="col-sm-12">
                    <ul class="nav nav-tabs">
                        <li class="active"><a href="#aluno" data-toggle="tab">Aluno</a></li>
                        <li><a href="#instituicao" data-toggle="tab">Instituicao</a></li>
                    </ul>
                    <div class="tab-content">
                        <div class="tab-pane active" id="aluno">
                            <div class="list-group">
                                <span class="list-group-item active">
                                    <form method="POST" action="Pessoa" target="_blank" >
                                        <div class="form-group row">
                                            <div class="col-xs-4"> 
                                                <label for="nome" class="control-label">Nome:</label>
                                                <input type="text" class="form-control" name="nome" placeholder="Digite seu nome" minlength="6" maxlength="100" required>
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <div class="col-xs-4"> 
                                                <label for="sobreNome" class="control-label">Sobrenome:</label>
                                                <input type="text" class="form-control" name="sobreNome" placeholder="Digite seu sobrenome" minlength="6" maxlength="100" required>
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <div class="col-xs-4"> 
                                                <label for="email" class="control-label">Email:</label>
                                                <input type="email" class="form-control" name="email" 
                                                       placeholder="nome@mail.com" required>
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <div class="col-xs-4"> 
                                                <label for="login">LOGIN:</label>
                                                <input id="login" class="form-control" type="text" name="usuario"
                                                       placeholder="Digite seu Login"
                                                       minlength="4"
                                                       required="required">
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <div class="col-xs-4"> 
                                                <label for="senha">SENHA:</label>
                                                <input id="senha" class="form-control" type="password" name="chave"
                                                       minlength="6"
                                                       required="required">
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <div class="col-xs-4"> 
                                                <label for="senha-confirmacao">CONFIRMAÇÃO DE SENHA:</label>
                                                <input id="senha-confirmacao" class="form-control" type="password"
                                                       name="senha-confirmacao"
                                                       equalTo="#chave" required="required">
                                            </div>
                                        </div>

                                        <div class="form-group row">
                                            <div class="col-xs-4"> 
                                                <label for="cpf" class="control-label">CPF:</label>
                                                <input type="text" class="form-control" name="CPF" maxlength="14"  required>
                                            </div>
                                        </div>

                                        <div class="form-group row">
                                            <div class="col-xs-4">  
                                                <label class="control-label" for="date">Data de Nascimento</label>
                                                <input class="form-control" id="date" name="dataDeNascimento" placeholder="DD/MM/YYY" type="date" required>
                                            </div>
                                        </div>


                                        <div class="form-group">
                                            <input type="hidden" name="tipo" value="1" required>
                                        </div>
                                        <div class="form-group">
                                            <button type="submit" class="btn btn-default">Enviar</button>
                                        </div>
                                    </form>
                                </span>
                            </div>
                        </div>
                        <div class="tab-pane" id="instituicao">
                            <div class="list-group active">
                                <span class="list-group-item active">
                                    <form method="POST" action="Empresa" target="_blank">
                                        <div class="form-group row">
                                            <div class="col-xs-4"> 
                                                <label for="nome" class="control-label">Nome Fantasia:</label>
                                                <input type="text" class="form-control" name="nomeFantasia" placeholder="Digite o nome fantasia" minlength="6" maxlength="100" required>
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <div class="col-xs-4"> 
                                                <label for="sobreNome" class="control-label">Razão Social:</label>
                                                <input type="text" class="form-control" name="razaoSocial" placeholder="Digite a razão social" minlength="6" maxlength="100" required>
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <div class="col-xs-4"> 
                                                <label for="email" class="control-label">Email:</label>
                                                <input type="email" class="form-control" name="email" 
                                                       placeholder="nome@mail.com" required>
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <div class="col-xs-4"> 
                                                <label for="login">LOGIN:</label>
                                                <input id="login" class="form-control" type="text" name="usuario"
                                                       placeholder="Digite seu Login"
                                                       minlength="4"
                                                       required="required">
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <div class="col-xs-4"> 
                                                <label for="senha">SENHA:</label>
                                                <input id="senha" class="form-control" type="password" name="chave"
                                                       minlength="6"
                                                       required="required">
                                            </div>
                                        </div>
                                        <div class="form-group row">
                                            <div class="col-xs-4"> 
                                                <label for="senha-confirmacao">CONFIRMAÇÃO DE SENHA:</label>
                                                <input id="senha-confirmacao" class="form-control" type="password"
                                                       name="senha-confirmacao"
                                                       equalTo="#chave" required="required">
                                            </div>
                                        </div>

                                        <div class="form-group row">
                                            <div class="col-xs-4"> 
                                                <label for="cnpj" class="control-label">CNPJ</label>
                                                <input type="text" class="form-control" name="CNPJ" maxlength="11"  required>
                                            </div>
                                        </div>

                                        <div class="form-group row">
                                            <div class="col-xs-4">  
                                                <label class="control-label" for="date">Data de Criação</label>
                                                <input class="form-control" id="date" name="dataDeCriacao" placeholder="DD/MM/YYY" type="date" required>
                                            </div>
                                        </div>

                                        <div class="form-group">
                                            <input type="hidden" name="tipo" value="1" required>
                                        </div>
                                        <div class="form-group">
                                            <button type="submit" class="btn btn-default">Enviar</button>
                                        </div>
                                    </form>
                                </span>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

    </body>
    <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="js/js-bootstrap/bootstrap.min.js"></script>
    <script type="text/javascript" src="js/script.js"></script>
</html>
