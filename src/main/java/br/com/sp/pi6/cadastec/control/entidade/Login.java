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
    private Usuario usuario;

    public Login() {
        this.usuario = new Usuario();
    }
   
    public boolean autenticar(Usuario usuario){
        UsuarioDao usuarioDao = new UsuarioDao();
        this.usuario = usuarioDao.getUsuario(usuario);
        
        if (this.usuario.getId() != 0){
            return true;
        }else{
            return false;
        }
    } 

    public Usuario getUsuario() {
        return usuario;
    }
}
