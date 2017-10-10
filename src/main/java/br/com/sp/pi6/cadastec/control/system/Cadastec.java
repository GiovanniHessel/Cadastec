/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.control.system;

import br.com.sp.pi6.cadastec.model.db.contrato.DbConnection;
import br.com.sp.pi6.cadastec.model.db.contrato.DbFactory;
import br.com.sp.pi6.cadastec.model.db.entidade.SqlFactory;

/**
 *
 * @author GIOVANNI
 */
public class Cadastec {
    public static final DbConnection connection = new SqlFactory().createConnection();
}
