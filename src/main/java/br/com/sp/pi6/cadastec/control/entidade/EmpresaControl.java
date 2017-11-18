/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.control.entidade;

import br.com.sp.pi6.cadastec.model.dao.EmpresaDao;
import br.com.sp.pi6.cadastec.model.dao.PessoaDao;
import br.com.sp.pi6.cadastec.model.entidade.Empresa;
import br.com.sp.pi6.cadastec.model.entidade.Pessoa;

/**
 *
 * @author GIOVANNI
 */
public class EmpresaControl {
    private EmpresaDao empresaDao;
    
    public EmpresaControl() {
        empresaDao = new EmpresaDao();
        
    }
    
    public boolean cadastrar(Empresa empresa){
        return empresaDao.insert(empresa);
    }
    
}
