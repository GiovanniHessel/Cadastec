/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.model.db.contrato;

/**
 *
 * @author GIOVANNI
 */
public interface DbFactory {
    public DbConnection createConnection();
}
