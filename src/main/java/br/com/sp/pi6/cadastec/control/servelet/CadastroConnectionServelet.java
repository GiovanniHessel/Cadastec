/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.control.servelet;

import br.com.sp.pi6.cadastec.control.entidade.CadastroConnection;
import br.com.sp.pi6.cadastec.control.entidade.Login;
import br.com.sp.pi6.cadastec.model.db.entidade.SqlStringConnection;
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
@WebServlet(name = "CadastroConnectionServelet", urlPatterns = {"/CadastroConnectionServelet"})
public class CadastroConnectionServelet extends HttpServlet {

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
        request.setCharacterEncoding("UTF-8");
        
        SqlStringConnection sqlStringConnection = new SqlStringConnection();
        
        sqlStringConnection.setPorta(request.getParameter("porta"));
        sqlStringConnection.setHost(request.getParameter("host"));
        sqlStringConnection.setBase(request.getParameter("base"));
        sqlStringConnection.setLogin(request.getParameter("login"));
        sqlStringConnection.setSenha(request.getParameter("senha"));
        sqlStringConnection.setDrive(request.getParameter("drive"));
        sqlStringConnection.setDescricao(request.getParameter("descricao"));
        sqlStringConnection.setConnectionURL(sqlStringConnection.getConnectionURL());
              
        CadastroConnection cadastroConnection = new CadastroConnection();
        request.setAttribute("cadastroConnection", cadastroConnection.cadastrar(sqlStringConnection));
          
        request.getRequestDispatcher("cadastroConexao.jsp").forward(request, response);
    }
}
