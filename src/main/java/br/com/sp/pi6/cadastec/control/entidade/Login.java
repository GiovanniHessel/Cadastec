/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.control.entidade;

import br.com.sp.pi6.cadastec.model.dao.UsuarioDao;
import br.com.sp.pi6.cadastec.model.entidade.Usuario;

/**
 *
 * @author GIOVANNI
 */
public class Login {
    public boolean autenticar(Usuario usuario){
        UsuarioDao usuarioDao = new UsuarioDao();
        Usuario usuarioAtenticar = usuarioDao.getUsuario(usuario);
        
        if (usuario.getUsuario().equals(usuarioAtenticar.getUsuario()) && usuario.getChave().equals(usuarioAtenticar.getChave())){
            return true;
        }else{
            return false;
        }
    } 
}
