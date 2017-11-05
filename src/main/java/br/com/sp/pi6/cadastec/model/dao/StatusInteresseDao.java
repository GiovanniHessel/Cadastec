/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.model.dao;

import br.com.sp.pi6.cadastec.control.system.Cadastec;
import br.com.sp.pi6.cadastec.model.db.contrato.DbConnection;
import br.com.sp.pi6.cadastec.model.entidade.StatusInteresse;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GIOVANNI
 */
public class StatusInteresseDao {
    private DbConnection connection;

    public StatusInteresseDao() {
        this.connection = Cadastec.connection;
    }
    
    public boolean insert(StatusInteresse statusInteresse){
        String sql = "insert into Paises"
                + "(statusInteresse, inativo)"
                + " values (?,?)";
        connection.open();
        try {
            // prepared statement para inserção
            
            PreparedStatement stmt = connection.getConnection().prepareStatement(sql);

            // seta os valores
            stmt.setString(1, statusInteresse.getStatusInteresse());
            stmt.setInt(2, statusInteresse.getInativo());

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
    
    public StatusInteresse getStatusInteresse(StatusInteresse statusInteresse) {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, statusInteresse, inativo from StatusInteresses where id = ?");
            stmt.setInt(1, statusInteresse.getId());
            
            ResultSet rs = stmt.executeQuery();
            statusInteresse = new StatusInteresse();
            // criando o objeto Contato
            if (rs.next()){
               
                statusInteresse.setId(rs.getInt("id"));
                statusInteresse.setStatusInteresse(rs.getString("statusInteresse"));
                statusInteresse.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
            }
                
            rs.close();
            stmt.close();
            connection.close();
            return statusInteresse;

        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
    
    public List<StatusInteresse> getStatusInteresses() {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, statusInteresse, inativo from StatusInteresses");
            
            ResultSet rs = stmt.executeQuery();
            List<StatusInteresse> statusInteresses = new ArrayList();
            // criando o objeto Contato
            while (rs.next()){
                StatusInteresse statusInteresse = new StatusInteresse();
                statusInteresse.setId(rs.getInt("id"));
                statusInteresse.setStatusInteresse(rs.getString("statusInteresse"));
                statusInteresse.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
                statusInteresses.add(statusInteresse);
            }
            rs.close();
            stmt.close();
            connection.close();
            return statusInteresses;
        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
}
