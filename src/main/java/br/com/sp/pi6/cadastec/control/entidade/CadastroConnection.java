/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.control.entidade;

import br.com.sp.pi6.cadastec.model.db.dao.SqlStringConnectionDao;
import br.com.sp.pi6.cadastec.model.db.entidade.SqlStringConnection;

/**
 *
 * @author GIOVANNI
 */
public class CadastroConnection {

    public CadastroConnection() {
    }
    
    public boolean cadastrar(SqlStringConnection sqlStringConnection){
        SqlStringConnectionDao sqlStringConnectionDao = new SqlStringConnectionDao();
        return sqlStringConnectionDao.insert(sqlStringConnection);
    }
}
