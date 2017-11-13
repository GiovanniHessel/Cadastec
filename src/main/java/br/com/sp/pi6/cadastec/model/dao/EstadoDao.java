/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.model.dao;

import br.com.sp.pi6.cadastec.control.system.Cadastec;
import br.com.sp.pi6.cadastec.model.db.contrato.DbConnection;
import br.com.sp.pi6.cadastec.model.entidade.Estado;
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
public class EstadoDao {
    private DbConnection connection;

    public EstadoDao() {
        this.connection = Cadastec.connection;
    }
    
    public boolean insert(Estado estado){
        String sql = "insert into Estados"
                + "(estado, sigla, idPaises, inativo)"
                + " values (?,?,?,?)";
        connection.open();
        try {
            // prepared statement para inserção
            
            PreparedStatement stmt = connection.getConnection().prepareStatement(sql);

            // seta os valores
            stmt.setString(1, estado.getEstado());
            stmt.setString(2, estado.getSigla());
            stmt.setInt(3, estado.getPais().getId());
            stmt.setInt(4, estado.getInativo());

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
    
    public Estado getEstado(Estado estado) {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, estado, sigla, idPaises, inativo from Estados where id = ?");
            stmt.setInt(1, estado.getId());
            PaisDao paisDao = new PaisDao();
            
            ResultSet rs = stmt.executeQuery();
            estado = new Estado();
            // criando o objeto Contato
            if (rs.next()){
               
                estado.setId(rs.getInt("id"));
                estado.setEstado(rs.getString("estado"));
                estado.setSigla(rs.getString("sigla"));
                Pais pais = paisDao.getPais(rs.getInt("idPaises"));
                estado.setPais(pais);
                estado.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
            }
                
            rs.close();
            stmt.close();
            connection.close();
            return estado;

        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
    
    public Estado getEstado(int id) {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, estado, sigla, idPaises, inativo from Estados where id = ?");
            stmt.setInt(1, id);
            PaisDao paisDao = new PaisDao();
            
            ResultSet rs = stmt.executeQuery();
            Estado estado = new Estado();
            // criando o objeto Contato
            if (rs.next()){
               
                estado.setId(rs.getInt("id"));
                estado.setEstado(rs.getString("estado"));
                estado.setSigla(rs.getString("sigla"));
                Pais pais = paisDao.getPais(rs.getInt("idPaises"));
                estado.setPais(pais);
                estado.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
            }
                
            rs.close();
            stmt.close();
            connection.close();
            return estado;

        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
    
    public List<Estado> getEstados() {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, estado, sigla, idPaises, inativo from Estados");
            
            ResultSet rs = stmt.executeQuery();
            List<Estado> estados = new ArrayList();
            PaisDao paisDao = new PaisDao();
            // criando o objeto Contato
            while (rs.next()){
                Estado estado = new Estado();
                estado.setId(rs.getInt("id"));
                estado.setEstado(rs.getString("estado"));
                estado.setSigla(rs.getString("sigla"));
                Pais pais = paisDao.getPais(rs.getInt("idPaises"));
                estado.setPais(pais);
                estado.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
                estados.add(estado);
            }
            rs.close();
            stmt.close();
            connection.close();
            return estados;
        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
    
    public List<Estado> getEstados(Pais pais) {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, estado, sigla, idPaises, inativo from Estados where idPaises = ?");
            stmt.setInt(1, pais.getId());
            
            ResultSet rs = stmt.executeQuery();
            List<Estado> estados = new ArrayList();
            PaisDao paisDao = new PaisDao();
            // criando o objeto Contato
            while (rs.next()){
                Estado estado = new Estado();
                estado.setId(rs.getInt("id"));
                estado.setEstado(rs.getString("estado"));
                estado.setSigla(rs.getString("sigla"));
                pais = paisDao.getPais(rs.getInt("idPaises"));
                estado.setPais(pais);
                estado.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
                estados.add(estado);
            }
            rs.close();
            stmt.close();
            connection.close();
            return estados;
        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
    
    public List<Estado> getEstados(int idPais) {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, estado, sigla, idPaises, inativo from Estados where idPaises = ?");
            stmt.setInt(1, idPais);
            
            ResultSet rs = stmt.executeQuery();
            List<Estado> estados = new ArrayList();
            PaisDao paisDao = new PaisDao();
            // criando o objeto Contato
            while (rs.next()){
                Estado estado = new Estado();
                estado.setId(rs.getInt("id"));
                estado.setEstado(rs.getString("estado"));
                estado.setSigla(rs.getString("sigla"));
                Pais pais = paisDao.getPais(rs.getInt("idPaises"));
                estado.setPais(pais);
                estado.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
                estados.add(estado);
            }
            rs.close();
            stmt.close();
            connection.close();
            return estados;
        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
}
