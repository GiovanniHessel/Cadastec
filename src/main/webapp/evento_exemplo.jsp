<%-- 
    Document   : evento_exemplo
    Created on : 15/11/2017, 16:19:00
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
        <title>CadasTec - Evento</title>

        <link rel="stylesheet" href="css/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>

    </head>
    <body>
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
                        <a class="navbar-brand" href="index.html">CADASTEC</a>
                    </div>
                    <div class="collapse navbar-collapse" id="nav-menu">
                        <ul class="nav navbar-nav navbar-right">
                            <li><a href="index.html">Sobre</a></li>
                            <li><a href="index.html">Cadastro</a></li>
                            <li><a href="eventos.html">Eventos</a></li>
                            <li><a href="index.html">Como Chegar</a></li>
                            <li><a href="index.html">Login</a></li>
                            <li><a href="#modais" data-toggle="modal" data-target="#modais">Atendimento</a></li>
                        </ul>
                    </div>
                </div>
            </nav>
        </header>
        <main>
            <section id="evento-exemplo">
                <div class="container">
                    <div class="row text-center">
                        <h3 class="title">EVENTO</h3>
                    </div>
                    <div class="row">
                        <div class="col-sm-6">
                            <div id="carousel-sobre" class="carousel slide" data-ride="carousel">
                                <div class="carousel-inner">
                                    <div class="item active">
                                        <img src="img/sobre1.jpg" alt="eventos" >
                                    </div>

                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 content">
                            <h3> Evento 01</h3>
                            <br>
                            <p>Avenida Eusebio Stevaux, 666</p>
                            <p>Jardim XXX - Sao Paulo - SP</p>
                            <p>(011) 5500-0055</p>
                            <p>10/10/2018 10:00</p>
                            <p>Descricao: Mussum Ipsum, cacilds vidis litro abertis. Posuere libero varius. Nullam a nisl ut ante blandit hendrerit. Aenean sit amet nisi. Sapien in monti palavris qui num significa nadis i pareci latim. Suco de cevadiss deixa as pessoas mais interessantis. Leite de capivaris, leite de mula manquis sem cabeça.</p>
                        </div>
                    </div>
                </div>
            </section>


            <section id="assine">
                <div class="container">
                    <div class="row text-center">
                        <h3 class="title">FIQUE POR DENTRO</h3>
                    </div>
                    <div class="row">
                        <div class="col-sm-6">
                            <h4>Esteja sempre atualizado sobre os últimos eventos!</h4>
                        </div>
                        <div class="col-sm-6 col-sm-offset-0 col-xs-10 col-xs-offset-1">
                            <form method="POST" action="" target="_blank">
                                <div class="input-group">
                                    <input type="email" class="form-control" name="email" 
                                           placeholder="Digite o seu email" required>
                                    <span class="input-group-btn">
                                        <button class="btn btn-success" type="submit">Enviar!</button>
                                    </span>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </section>
        </main>
        <footer>
            <div class="footer-links">
                <a href="https://www.youtube.com" target="_blank" class="icon-social youtube" 
                   data-toggle="tooltip" data-placement="top" title="Assista"></a>
                <a href="http://twitter.com" target="_blank" class="icon-social twitter" 
                   data-toggle="tooltip" data-placement="top" title="Comente"></a>    
                <a href="https://www.facebook.com/" target="_blank" class="icon-social facebook" 
                   data-toggle="tooltip" data-placement="top" title="Compartilhe"></a>
            </div>
            <p class="text-center">
                © 2017 - CadasTec
            </p>
        </footer>

        <div class="modal fade" id="modais" tabindex="-1">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal"><span>&times;</span></button>
                        <h4 class="modal-title">Deixe o seu contato</h4>
                    </div>
                    <div class="modal-body">
                        <form method="POST" action="" target="_blank">
                            <div class="form-group">
                                <label for="nome" class="control-label">Nome</label>
                                <input type="text" class="form-control" name="nome" placeholder="Digite o seu nome" required>
                            </div>
                            <div class="form-group">
                                <label for="email" class="control-label">Email</label>
                                <input type="email" class="form-control" name="email" 
                                       placeholder="Digite o seu email" required>
                            </div>
                            <div class="form-group">
                                <label for="mensagem" class="control-label">Messagem</label>
                                <textarea class="form-control" name="mensagem" placeholder="Digite a sua mensagem" 
                                          rows="6" required></textarea>
                            </div>
                            <div class="form-group">
                                <button type="submit" class="btn btn-primary">Enviar</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <div class="modal fade" id="modal-login" tabindex="-1">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal"><span>&times;</span></button>
                        <h4 class="modal-title">Login</h4>
                    </div>
                    <div class="modal-body">
                        <form method="POST" action="" target="_blank">
                            <div class="form-group">
                                <label for="login">LOGIN:</label>
                                <input id="login" class="form-control" type="text" name="login"
                                       placeholder="meunome, mnome"
                                       minlength="4"
                                       required="required">
                            </div>

                            <div class="form-group">
                                <label for="senha">SENHA:</label>
                                <input id="senha" class="form-control" type="password" name="senha"
                                       minlength="6"
                                       required="required">
                            </div>
                            <div class="form-group">
                                <button type="submit" class="btn btn-default">Logar</button>
                            </div>
                        </form>
                    </div> 
                </div>
            </div>
        </div>

        <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
        <script type="text/javascript" src="js/js-bootstrap/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/script.js"></script>
    </body>
</html>
