/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.model.db.entidade;

import br.com.sp.pi6.cadastec.model.db.contrato.DbConnection;
import br.com.sp.pi6.cadastec.model.db.contrato.DbFactory;

/**
 *
 * @author GIOVANNI
 */
public class SqlFactory implements DbFactory {
    @Override
    public DbConnection createConnection() {
        return new SqlConnection();
    }
}
