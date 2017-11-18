/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.control.servelet;

import br.com.sp.pi6.cadastec.control.entidade.EventoControl;
import br.com.sp.pi6.cadastec.control.entidade.PessoaControl;
import br.com.sp.pi6.cadastec.model.dao.EmpresaDao;
import br.com.sp.pi6.cadastec.model.dao.EnderecoDao;
import br.com.sp.pi6.cadastec.model.entidade.Empresa;
import br.com.sp.pi6.cadastec.model.entidade.Endereco;
import br.com.sp.pi6.cadastec.model.entidade.Evento;
import br.com.sp.pi6.cadastec.model.entidade.Pessoa;
import br.com.sp.pi6.cadastec.model.entidade.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GIOVANNI
 */
@WebServlet(name = "EventoServelet", urlPatterns = {"/Evento"})
public class EventoServelet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
            EventoControl eventoControl= new EventoControl();
            Evento evento = new Evento();
            
            evento.setTitulo(request.getParameter("nome"));
            evento.setDescricao(request.getParameter("sobreNome"));
            
            Empresa empresa = new EmpresaDao().getEmpresa(Integer.parseInt(request.getParameter("empresa")));
            evento.setEmpresa(empresa);
            evento.setDataHoraInicial(request.getParameter("dataHoraFinal"));      
            evento.setDataHoraFinal(request.getParameter("dataHoraFinal"));
            Endereco endereco = new EnderecoDao().getEndereco(Integer.parseInt(request.getParameter("endereco")));
            evento.setEndereco(endereco);
        
            boolean a = eventoControl.cadastrar(evento);
          
            request.setAttribute("login", a);
            
            request.getRequestDispatcher("loginConfirmacao.jsp").forward(request, response);
    }
}
