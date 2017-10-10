/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.control.servelet;

import br.com.sp.pi6.cadastec.control.entidade.CadastroConnection;
import br.com.sp.pi6.cadastec.model.db.dao.SqlStringConnectionDao;
import br.com.sp.pi6.cadastec.model.db.entidade.SqlStringConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GIOVANNI
 */
@WebServlet(name = "ConnectionServelet", urlPatterns = {"/ConnectionServelet"})
public class ConnectionServelet extends HttpServlet {

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
        
        SqlStringConnectionDao SqlStringConnectionDao = new SqlStringConnectionDao();
        
        List<SqlStringConnection> sqlStringConnections = SqlStringConnectionDao.getSqlStringConnections();
        
        request.setAttribute("connections", sqlStringConnections);
                
          
        request.getRequestDispatcher("cadastroConexao.jsp").forward(request, response);
    }

}
