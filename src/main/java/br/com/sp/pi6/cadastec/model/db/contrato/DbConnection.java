/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.model.db.contrato;

import java.sql.Connection;

/**
 *
 * @author GIOVANNI
 */
public interface DbConnection {
    public void open();
    public void close();
    public Connection getConnection();
}
