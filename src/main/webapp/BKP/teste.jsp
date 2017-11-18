<%-- 
    Document   : teste
    Created on : 14/11/2017, 19:50:03
    Author     : GIOVANNI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="widht-device-width, initial-scale-1" >
        
        <title>CadasTec</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <header><div id="banner">
                <h1>DEVCON</h1>
                <h2>CadasTec</h2>
            </div>
            <nav class="navbar navbar-inverse" id="navbar">
                <div class="container-fluid">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle collapsed" 
                                data-toggle="collapse" data-target="#nav-menu">
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="#banner">DEVCON</a>
                    </div>
                    <div class="collapse navbar-collapse" id="nav-menu">
                        <ul class="nav navbar-nav navbar-right">
                            <li><a href="#sobre">Sobre</a></li>
                            <li><a href="#agenda">Agenda</a></li>
                            <li><a href="#palestrantes">Palestrantes</a></li>
                            <li><a href="#local">Como Chegar</a></li>
                            <li><a href="" data-toggle="modal" data-target="#modais">Contato</a></li>
                        </ul>
                    </div>
                </div>
            </nav>
        </header>
        <main>
            <section id="sobre">

                <div class="container">
                    <div class="row text-center">
                        <h3 class="title">SOBRE</h3>
                    </div>
                    <div class="row">
                        <div class="col-sm-6">
                            <div id="carousel-sobre" class="carousel slide" data-ride="carousel">
                                <div class="carousel-inner">
                                    <div class="item active">
                                        <img src="img/curso_00.png" alt=".net" >
                                    </div>
                                    <div class="item">
                                        <img src="img/curso_01.png" alt="java jsf">
                                    </div>
                                    <div class="item">
                                        <img src="img/curso_02.png" alt="css3">
                                    </div>
                                </div>
                                <a class="left carousel-control" href="#carousel-sobre" data-slide="prev">
                                    <span class="icon-prev"></span>
                                </a>
                                <a class="right carousel-control" href="#carousel-sobre" data-slide="next">
                                    <span class="icon-next"></span>
                                </a>
                            </div>
                        </div>

                        <div class="col-sm-6 content">

                        </div>
                    </div>
                </div>

            </section>

            <section id="agenda">

                <div class="container">
                    <div class="row text-center">
                        <h3 class="title">SOBRE</h3>
                    </div>
                    <div class="row">
                        <div class="col-sm-12">
                            <ul class="nav nav-tabs">
                                <li class="active"><a href="#net" data-toggle="tab">.Net</a></li>
                                <li><a href="#java" data-toggle="tab">Java</a></li>
                                <li><a href="#php" data-toggle="tab">PHP</a></li>
                                <li><a href="#delphi" data-toggle="tab">Delphi</a></li>
                            </ul>
                            <div class="tab-content">
                                <div class="tab-pane active" id="net">
                                    <div class="list-group">
                                        <span class="list-group-item active">
                                            <h4 class="list-group-item-heading">2/6 10:00h</h4>
                                            <p class="list-group-item-text">Aleatorio0</p>
                                        </span>
                                        <span class="list-group-item"></span>
                                        <span class="list-group-item"></span>
                                    </div>
                                </div>
                                <div class="tab-pane" id="java">
                                    <div class="list-group">
                                        <span class="list-group-item active">
                                            <h4 class="list-group-item-heading">5/6 11:00h</h4>
                                            <p class="list-group-item-text">Aleatorio1</p>
                                        </span>
                                        <span class="list-group-item"></span>
                                        <span class="list-group-item"></span>
                                    </div>
                                </div>
                                <div class="tab-pane" id="php">
                                    <div class="list-group">
                                        <span class="list-group-item active">
                                            <h4 class="list-group-item-heading">6/6 12:00h</h4>
                                            <p class="list-group-item-text">Aleatorio1</p>
                                        </span>
                                        <span class="list-group-item"></span>
                                        <span class="list-group-item"></span>
                                    </div>
                                </div>
                                <div class="tab-pane" id="delphi">
                                    <div class="list-group">
                                        <span class="list-group-item active">
                                            <h4 class="list-group-item-heading">7/6 13:00h</h4>
                                            <p class="list-group-item-text">Aleatorio3</p>
                                        </span>
                                        <span class="list-group-item"></span>
                                        <span class="list-group-item"></span>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>

            </section>
            <section id="palestrantes">
                <div class="container">
                    <div class="row text-center">
                        <h3 class="title">PALESTRANTE</h3>
                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-md-3">
                            <div class="thumbnail">
                                <img src="./img/pelestrante_03.png" alt="Joel Rodrigues">
                                <div class="caption">
                                    <h3>Joel - C#</h3>
                                    <p>Editor e consultor no portal DevMedia.</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-md-3">
                            <div class="thumbnail">
                                <img src="./img/pelestrante_03.png" alt="Joel Rodrigues">
                                <div class="caption">
                                    <h3>Joel - C#</h3>
                                    <p>Editor e consultor no portal DevMedia.</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-md-3">
                            <div class="thumbnail">
                                <img src="./img/pelestrante_03.png" alt="Joel Rodrigues">
                                <div class="caption">
                                    <h3>Joel - C#</h3>
                                    <p>Editor e consultor no portal DevMedia.</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-md-3">
                            <div class="thumbnail">
                                <img src="./img/pelestrante_03.png" alt="Joel Rodrigues">
                                <div class="caption">
                                    <h3>Joel - C#</h3>
                                    <p>Editor e consultor no portal DevMedia.</p>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>

            </section>
            <section id="local">
                <div class="container-fluid">
                    <div class="row text-center">
                        <h3 class="title">COMO CHEGAR</h3>
                    </div>
                    <div class="row iframe-container">
                        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d117012.75966247315!2d-46.72402934612887!3d-23.581055904014676!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x94ce5036539648d5%3A0x78501a72680ea23a!2sCentro+Universit%C3%A1rio+Senac+-+Santo+Amaro!5e0!3m2!1spt-BR!2sbr!4v1510330550815" frameborder="0" allowfullscreen></iframe>
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
                            <form method="POST" action="http://arquivo.devmedia.com.br/projeto/requisicao.php" target="_blank">
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
                <a href="https://www.youtube.com/c/DevmediaBrasil" target="_blank" class="icon-social youtube" 
                   data-toggle="tooltip" data-placement="top" title="Assista"></a>
                <a href="http://twitter.com/devmedia" target="_blank" class="icon-social twitter" 
                   data-toggle="tooltip" data-placement="top" title="Comente"></a>    
                <a href="https://www.facebook.com/devmedia.com.br/" target="_blank" class="icon-social facebook" 
                   data-toggle="tooltip" data-placement="top" title="Compartilhe"></a>
            </div>
            <p class="text-center">
                © 2017 - CadasTec
            </p>
        </footer>

        <div class="modal fade" id="modais">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal"><span>&times;</span></button>
                        <h4 class="modal-title">Deixe o seu contato</h4>
                    </div>
                    <div class="modal-body">
                        <form method="POST" action="http://arquivo.devmedia.com.br/projeto/requisicao.php" target="_blank">
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
        </div

        <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
        <script type="text/javascript" src="js/js-bootstrap/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/script.js"></script>
    </body>
</html>