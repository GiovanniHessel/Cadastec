/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.control.servelet;

import br.com.sp.pi6.cadastec.control.entidade.PessoaControl;
import br.com.sp.pi6.cadastec.control.entidade.UsuarioControl;
import br.com.sp.pi6.cadastec.model.entidade.Pessoa;
import br.com.sp.pi6.cadastec.model.entidade.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Formatter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author GIOVANNI
 */
@WebServlet(name = "Pessoa", urlPatterns = {"/Pessoa"})
public class PessoaServelet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

            PessoaControl pessoaControl = new PessoaControl();
            UsuarioControl usuarioControl = new UsuarioControl();
            Pessoa pessoa = new Pessoa();
            Usuario usuario = new Usuario();
            
            
            pessoa.setNome(request.getParameter("nome"));
            pessoa.setSobrenome(request.getParameter("sobreNome"));
            pessoa.setCPF(request.getParameter("CPF"));
            
            String dataDeNascimento = request.getParameter("dataDeNascimento"); 
            String[] data = dataDeNascimento.split("-");
            dataDeNascimento = data[0] + data[1] + data[2];
            pessoa.setDataDeNascimento(dataDeNascimento);
            
            usuario.setUsuario(request.getParameter("usuario"));
            usuario.setChave(request.getParameter("chave"));
            usuario.setEmail(request.getParameter("email"));
            usuario.setTipo(1);
            
            usuario = usuarioControl.cadastrar(usuario);
            request.getSession().setAttribute("usuario", usuario);
            
            if (usuario.getId() == 0){
                request.getRequestDispatcher("loginConfirmacao.jsp").forward(request, response);
            }
          
            pessoa.setUsuario(usuario);
            if (! pessoaControl.cadastrar(pessoa)){
                usuario.setId(0);
            }
            request.getSession().setAttribute("usuario", usuario);
            
            request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
