<%-- 
    Document   : index
    Created on : 02/03/2016, 00:41:27
    Author     : Giovanni
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
                                        <img src="img/sobre1.jpg" alt="sobre1" >
                                    </div>
                                    <div class="item">
                                        <img src="img/sobre2.jpg" alt="sobre2">
                                    </div>
                                    <div class="item">
                                        <img src="img/sobre3.jpg" alt="sobre3">
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
                            <h4>
                                CadasTec
                            </h4>
                            <p>
                                Mais de 15 anos de treinamento online.
                                <br>
                                Com cursos focados na funcionalidade do código. Na DevMedia você aprende com quem programa de verdade!
                                <br>
                                Agora você poderá aprender com os melhores profissionas do mercado ao vivo.
                            </p>
                        </div>
                    </div>
                </div>
            </section>

       
            <section id="eventos">
                <div class="container">
                    <div class="row text-center">
                        <h3 class="title"><a href="eventos.html">EVENTOS</a></h3>
                    </div>
                    <div class="row">
                        <div class="col-sm-6 col-md-3">
                            <div class="thumbnail">
                                <img src="./img/evento1.jpg" alt="evento1">
                                <div class="caption">
                                    <h3>Evento 01</h3>
                                    <p>Descricao do evento.</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-md-3">
                            <div class="thumbnail">
                                <img src="./img/evento2.jpg" alt="Joel Rodrigues">
                                <div class="caption">
                                    <h3>Evento 02</h3>
                                    <p>Descricao do evento.</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-md-3">
                            <div class="thumbnail">
                                <img src="./img/evento3.jpg" alt="Joel Rodrigues">
                                <div class="caption">
                                    <h3>Evento 03</h3>
                                    <p>Descricao do evento.</p>
                                </div>
                            </div>
                        </div>
                        <div class="col-sm-6 col-md-3">
                            <div class="thumbnail">
                                <img src="./img/evento4.jpg" alt="Joel Rodrigues">
                                <div class="caption">
                                    <h3>Evento 04</h3>
                                    <p>Descricao do evento.</p>
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



    </body>
</html>