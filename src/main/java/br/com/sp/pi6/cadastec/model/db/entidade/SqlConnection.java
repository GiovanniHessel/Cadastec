/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.model.db.entidade;

import br.com.sp.pi6.cadastec.model.db.contrato.DbConnection;
import java.sql.*;
/**
 *
 * @author GIOVANNI
 */
public class SqlConnection implements DbConnection{

    private SqlStringConnection stringConnection;
    private Connection connection;
    private boolean isConnected;
    
    public SqlConnection() {
       stringConnection = new SqlStringConnection();
       isConnected = false;
    }
    
    @Override
    public void open() {
        try {
            if (! isConnected){
                Class.forName(stringConnection.getDrive()).newInstance();
                this.connection = DriverManager.getConnection(stringConnection.getConnectionURL(), stringConnection.getLogin(), stringConnection.getSenha() );
                isConnected = true;
            }
        } catch( SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException e ) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void close() {
            try {
                if (isConnected){
                    this.connection.close();
                    isConnected = false;
                }
            } catch( SQLException e ) {
                System.out.println(e.getMessage());
            }
    }
  
    @Override
    public Connection getConnection() {
        return this.connection;
    }
    
}
