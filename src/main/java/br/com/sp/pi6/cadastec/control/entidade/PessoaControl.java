/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.control.entidade;

import br.com.sp.pi6.cadastec.model.dao.PessoaDao;
import br.com.sp.pi6.cadastec.model.dao.UsuarioDao;
import br.com.sp.pi6.cadastec.model.entidade.Pessoa;
import br.com.sp.pi6.cadastec.model.entidade.Usuario;

/**
 *
 * @author GIOVANNI
 */
public class PessoaControl {
    private PessoaDao pessoaDao;
    
    public PessoaControl() {
        pessoaDao = new PessoaDao();
        
    }
    
    public boolean cadastrar(Pessoa pessoa){
        return pessoaDao.insert(pessoa);
    }
    
    
    
}
