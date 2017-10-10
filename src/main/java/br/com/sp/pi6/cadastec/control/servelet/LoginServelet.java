/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.control.servelet;

import br.com.sp.pi6.cadastec.control.entidade.Login;
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
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class LoginServelet extends HttpServlet {

     protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        
        Usuario usuario = new Usuario();
        usuario.setUsuario(request.getParameter("usuario"));
        usuario.setChave(request.getParameter("chave"));
        
        Login login = new Login();
        request.setAttribute("login", login.autenticar(usuario));
          
        request.getRequestDispatcher("loginConfirmacao.jsp").forward(request, response);
    }

}
