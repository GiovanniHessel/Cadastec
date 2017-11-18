/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.control.servelet;

import br.com.sp.pi6.cadastec.control.entidade.EmpresaControl;
import br.com.sp.pi6.cadastec.control.entidade.UsuarioControl;
import br.com.sp.pi6.cadastec.model.entidade.Empresa;
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
@WebServlet(name = "Empresa", urlPatterns = {"/Empresa"})
public class EmpresaServelet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        EmpresaControl empresaControl = new EmpresaControl();
        UsuarioControl usuarioControl = new UsuarioControl();
        Empresa empresa = new Empresa();
        Usuario usuario = new Usuario();

        empresa.setNomeFantasia(request.getParameter("nomeFantasia"));
        empresa.setRazaoSocial(request.getParameter("razaoSocial"));
        empresa.setCNPJ(request.getParameter("CNPJ"));
        
        String dataDeCriacao = request.getParameter("dataDeCriacao");
        String[] data = dataDeCriacao.split("-");
        dataDeCriacao = data[0] + data[1] + data[2];
        empresa.setDataDeCriacao(dataDeCriacao);
        
        usuario.setUsuario(request.getParameter("usuario"));
        usuario.setChave(request.getParameter("chave"));
        usuario.setEmail(request.getParameter("email"));
        usuario.setTipo(1);

        usuario = usuarioControl.cadastrar(usuario);
        request.getSession().setAttribute("usuario", usuario);
        
        if (usuario.getId() == 0) {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }

        empresa.setUsuario(usuario);
        if (!empresaControl.cadastrar(empresa)){
            usuario.setId(0);
        }
        request.getSession().setAttribute("usuario", usuario);
        
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
