/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.model.dao;

import br.com.sp.pi6.cadastec.control.system.Cadastec;
import br.com.sp.pi6.cadastec.model.db.contrato.DbConnection;
import br.com.sp.pi6.cadastec.model.entidade.Pais;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GIOVANNI
 */
public class PaisDao {
    private DbConnection connection;

    public PaisDao() {
        this.connection = Cadastec.connection;
    }
    
    public boolean insert(Pais pais){
        String sql = "insert into Paises"
                + "(pais, sigla, inativo)"
                + " values (?,?,?)";
        connection.open();
        try {
            // prepared statement para inserção
            
            PreparedStatement stmt = connection.getConnection().prepareStatement(sql);

            // seta os valores
            stmt.setString(1, pais.getPais());
            stmt.setString(2, pais.getSigla());
            stmt.setInt(3, pais.getInativo());

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
    
    public Pais getPais(Pais pais) {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, pais, sigla, inativo from Paises where id = ?");
            stmt.setInt(1, pais.getId());
            
            ResultSet rs = stmt.executeQuery();
            pais = new Pais();
            // criando o objeto Contato
            if (rs.next()){
               
                pais.setId(rs.getInt("id"));
                pais.setPais(rs.getString("pais"));
                pais.setSigla(rs.getString("sigla"));
                pais.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
            }
                
            rs.close();
            stmt.close();
            connection.close();
            return pais;

        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
    
    public Pais getPais(int id) {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, pais, sigla, inativo from Paises where id = ?");
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            Pais pais = new Pais();
            // criando o objeto Contato
            if (rs.next()){
               
                pais.setId(rs.getInt("id"));
                pais.setPais(rs.getString("pais"));
                pais.setSigla(rs.getString("sigla"));
                pais.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
            }
                
            rs.close();
            stmt.close();
            connection.close();
            return pais;

        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
    
    public List<Pais> getPaises() {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, pais, sigla, inativo from Paises");
            
            ResultSet rs = stmt.executeQuery();
            List<Pais> paises = new ArrayList();
            // criando o objeto Contato
            while (rs.next()){
                Pais pais = new Pais();
                pais.setId(rs.getInt("id"));
                pais.setPais(rs.getString("pais"));
                pais.setSigla(rs.getString("sigla"));
                pais.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
                paises.add(pais);
            }
            rs.close();
            stmt.close();
            connection.close();
            return paises;
        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
}
