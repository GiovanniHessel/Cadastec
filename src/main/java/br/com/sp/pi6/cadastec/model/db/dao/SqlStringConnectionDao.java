/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.model.db.dao;

import br.com.sp.pi6.cadastec.control.system.Cadastec;
import br.com.sp.pi6.cadastec.model.db.contrato.DbConnection;
import br.com.sp.pi6.cadastec.model.db.entidade.SqlStringConnection;
import br.com.sp.pi6.cadastec.model.entidade.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GIOVANNI
 */
public class SqlStringConnectionDao {
        private DbConnection connection;

    public SqlStringConnectionDao() {
        this.connection = Cadastec.connection;
    }
    
    public boolean insert(SqlStringConnection sqlStringConnection){
        String sql = "insert into StringConnections"
                + "(porta, host, base, login, senha, drive, connectionURL, inativo, nome)"
                + " values (?,?,?,?,?,?,?,?,?)";
        connection.open();
        try {
            // prepared statement para inserção
            
            PreparedStatement stmt = connection.getConnection().prepareStatement(sql);

            // seta os valores
            stmt.setString(1, sqlStringConnection.getPorta());
            stmt.setString(2, sqlStringConnection.getHost());
            stmt.setString(3, sqlStringConnection.getBase());
            stmt.setString(4, sqlStringConnection.getLogin());
            stmt.setString(5, sqlStringConnection.getSenha());
            stmt.setString(6, sqlStringConnection.getDrive());
            stmt.setString(7, sqlStringConnection.getConnectionURL());
            stmt.setInt(8, sqlStringConnection.getInativo());
            stmt.setString(9, sqlStringConnection.getDescricao());
            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            connection.close();
            return false;
        }
        connection.close();
        return true;
    }
    
    public SqlStringConnection getSqlStringConnection(SqlStringConnection sqlStringConnection) {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select * from StringConnections where id = ?");
            stmt.setInt(1, sqlStringConnection.getId());

            ResultSet rs = stmt.executeQuery();
            sqlStringConnection = new SqlStringConnection();
            // criando o objeto Contato
            if (rs.next()){
                

                sqlStringConnection.setId(rs.getInt("id"));
                sqlStringConnection.setPorta(rs.getString("porta"));
                sqlStringConnection.setHost(rs.getString("host"));
                sqlStringConnection.setBase(rs.getString("base"));
                sqlStringConnection.setLogin(rs.getString("login"));
                sqlStringConnection.setSenha(rs.getString("senha"));
                sqlStringConnection.setDrive(rs.getString("drive"));
                sqlStringConnection.setConnectionURL(rs.getString("connectionURL"));
                sqlStringConnection.setInativo(rs.getInt("inativo"));
                sqlStringConnection.setDescricao(rs.getString("descricao"));
                // adicionando o objeto à lista
            }
                
            rs.close();
            stmt.close();
            connection.close();
            return sqlStringConnection;

        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
    
    public List<SqlStringConnection> getSqlStringConnections() {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select * from StringConnections");

            ResultSet rs = stmt.executeQuery();
            List<SqlStringConnection> SqlStringConnections = new ArrayList<SqlStringConnection>();
            // criando o objeto Contato
            while (rs.next()){
                
                SqlStringConnection sqlStringConnection = new SqlStringConnection();
                
                sqlStringConnection.setId(rs.getInt("id"));
                sqlStringConnection.setPorta(rs.getString("porta"));
                sqlStringConnection.setHost(rs.getString("host"));
                sqlStringConnection.setBase(rs.getString("base"));
                sqlStringConnection.setLogin(rs.getString("login"));
                sqlStringConnection.setSenha(rs.getString("senha"));
                sqlStringConnection.setDrive(rs.getString("drive"));
                sqlStringConnection.setConnectionURL(rs.getString("connectionURL"));
                sqlStringConnection.setInativo(rs.getInt("inativo"));
                sqlStringConnection.setDescricao(rs.getString("descricao"));
                // adicionando o objeto à lista
                SqlStringConnections.add(sqlStringConnection);
            }
                
            rs.close();
            stmt.close();
            connection.close();
            return SqlStringConnections;

        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
}
