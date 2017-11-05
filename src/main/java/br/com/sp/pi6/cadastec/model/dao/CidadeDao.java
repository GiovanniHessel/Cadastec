/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.model.dao;

import br.com.sp.pi6.cadastec.control.system.Cadastec;
import br.com.sp.pi6.cadastec.model.db.contrato.DbConnection;
import br.com.sp.pi6.cadastec.model.entidade.Cidade;
import br.com.sp.pi6.cadastec.model.entidade.Estado;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GIOVANNI
 */
public class CidadeDao {
    private DbConnection connection;

    public CidadeDao() {
        this.connection = Cadastec.connection;
    }
    
    public boolean insert(Cidade cidade){
        String sql = "insert into Cidades"
                + "(cidade, sigla, idEstados, idPaises, inativo)"
                + " values (?,?,?,?,?)";
        connection.open();
        try {
            // prepared statement para inserção
            
            PreparedStatement stmt = connection.getConnection().prepareStatement(sql);

            // seta os valores
            stmt.setString(1, cidade.getCidade());
            stmt.setString(2, cidade.getSigla());
            stmt.setInt(3, cidade.getIdEstados());
            stmt.setInt(4, cidade.getIdPais());
            stmt.setInt(5, cidade.getInativo());
            
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
    
    public Cidade getCidade(Cidade cidade) {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, cidade, sigla, idEstados, idPaises, inativo from Cidades where id = ?");
            stmt.setInt(1, cidade.getId());
            
            ResultSet rs = stmt.executeQuery();
            cidade = new Cidade();
            // criando o objeto Contato
            if (rs.next()){
                cidade.setId(rs.getInt("id"));
                cidade.setCidade(rs.getString("cidade"));
                cidade.setSigla(rs.getString("sigla"));
                cidade.setIdEstados(rs.getInt("idEstados"));
                cidade.setIdPais(rs.getInt("idPaises"));
                cidade.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
            }
                
            rs.close();
            stmt.close();
            connection.close();
            return cidade;

        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
    
    public List<Cidade> getCidades() {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, cidade, sigla, idEstados, idPaises, inativo from Cidades");
            
            ResultSet rs = stmt.executeQuery();
            List<Cidade> cidades = new ArrayList();
            // criando o objeto Contato
            while (rs.next()){
                Cidade cidade = new Cidade();
                cidade.setId(rs.getInt("id"));
                cidade.setCidade(rs.getString("cidade"));
                cidade.setSigla(rs.getString("sigla"));
                cidade.setIdEstados(rs.getInt("idEstados"));
                cidade.setIdPais(rs.getInt("idPaises"));
                cidade.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
                cidades.add(cidade);
            }
            rs.close();
            stmt.close();
            connection.close();
            return cidades;
        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
    
    public List<Cidade> getCidades(Estado estado) {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, cidade, sigla, idEstados, idPaises, inativo from Cidades where idEstados = ?");
            stmt.setInt(1, estado.getId());
            
           ResultSet rs = stmt.executeQuery();
            List<Cidade> cidades = new ArrayList();
            // criando o objeto Contato
            while (rs.next()){
                Cidade cidade = new Cidade();
                cidade.setId(rs.getInt("id"));
                cidade.setCidade(rs.getString("cidade"));
                cidade.setSigla(rs.getString("sigla"));
                cidade.setIdEstados(rs.getInt("idEstados"));
                cidade.setIdPais(rs.getInt("idPaises"));
                cidade.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
                cidades.add(cidade);
            }
            rs.close();
            stmt.close();
            connection.close();
            return cidades;
        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
}
