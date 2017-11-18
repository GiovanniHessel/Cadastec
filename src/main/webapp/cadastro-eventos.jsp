<%-- 
    Document   : cadastro-eventos
    Created on : 15/11/2017, 16:18:30
    Author     : GIOVANNI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="widht-device-width, initial-scale-1">
        <title>CadasTec - Cadastro de Eventoss</title>
    </head>
    <body>
        <c:import url="sys_cabecalho.jsp" />
        
        <main>

            <section id="cadastro-evento">
                <div class="container">
                    <div class="row text-center">
                        <h3 class="title">CADASTRO DO EVENTO</h3>
                    </div>
                    <div class="row">
                        <div class="tab-content">
                            <div class="tab-pane active" id="aluno">
                                <div class="list-group">
                                    <span class="list-group-item active">
                                        <form method="POST" action="" target="_blank">
                                            <div class="form-group">
                                                <label for="file">FOTO CAPA:</label>
                                                <input id="file" class="form-control" type="file" name="file">

                                                <p class="help-block">JPG, PNG ou GIF.</p>

                                                <img id="capa" data-src="holder.js/180x180" src="" alt="">
                                            </div>
                                            <div class="form-group">
                                                <label for="nome" class="control-label">NOME EVENTO:</label>
                                                <input type="text" class="form-control" name="nome" placeholder="Digite o nome do evento" minlength="2" required>
                                            </div>
                                            <div class="form-group">
                                                <label for="email" class="control-label">ENDEREÇO:</label>
                                                <input type="email" class="form-control" name="email" 
                                                       placeholder="Avenida Eusebio Steveux, 666" required>
                                            </div>
                                            <div class="form-group">
                                                <label for="bairro" class="control-label">BAIRRO:</label>
                                                <input type="bairro" class="form-control" name="bairro" 
                                                       placeholder="Jardim xxx" required>
                                            </div>
                                            <div class="form-group">
                                                <label for="cidade" class="control-label">CIDADE:</label>
                                                <input type="cidade" class="form-control" name="cidade" 
                                                       placeholder="São Paulo" required>
                                            </div>
                                            <div class="form-group">
                                                <label for="uf">UF:</label>
                                                <select id="uf" class="form-control" name="uf">
                                                    <option value="AC">Acre</option>
                                                    <option value="AL">Alagoas</option>
                                                    <option value="AP">Amapá</option>
                                                    <option value="AM">Amazonas</option>
                                                    <option value="BA">Bahia</option>
                                                    <option value="CE">Ceará</option>
                                                    <option value="DF">Distrito Federal</option>
                                                    <option value="ES">Espirito Santo</option>
                                                    <option value="GO">Goiás</option>
                                                    <option value="MA">Maranhão</option>
                                                    <option value="MS">Mato Grosso do Sul</option>
                                                    <option value="MT">Mato Grosso</option>
                                                    <option value="MG">Minas Gerais</option>
                                                    <option value="PA">Pará</option>
                                                    <option value="PB">Paraíba</option>
                                                    <option value="PR">Paraná</option>
                                                    <option value="PE">Pernambuco</option>
                                                    <option value="PI">Piauí</option>
                                                    <option value="RJ">Rio de Janeiro</option>
                                                    <option value="RN">Rio Grande do Norte</option>
                                                    <option value="RS">Rio Grande do Sul</option>
                                                    <option value="RO">Rondônia</option>
                                                    <option value="RR">Roraima</option>
                                                    <option value="SC">Santa Catarina</option>
                                                    <option value="SP">São Paulo</option>
                                                    <option value="SE">Sergipe</option>
                                                    <option value="TO">Tocantins</option>
                                                </select>
                                            </div>
                                            <div class="form-group">
                                                <label for="telefone" class="control-label">TELEFONE:</label>
                                                <input type="telefone" class="form-control" name="telefone" required
                                                       placeholder="(11) 0000-0000">
                                            </div>
                                            <div class="form-group">
                                                <label for="data-evento">DATA E HORARIO:</label>
                                                <input id="data-evento" class="form-control" type="text" name="data-evento"
                                                       placeholder="00/00/0000 00:00">
                                            </div>
                                            <div class="form-group">
                                                <label for="mensagem" class="control-label">DESCRIÇÃO</label>
                                                <textarea class="form-control" name="mensagem" placeholder="Descrição do evento" 
                                                          rows="10" required></textarea>
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

        
    </body>
</html>
