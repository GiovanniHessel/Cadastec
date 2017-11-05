/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.model.dao;

import br.com.sp.pi6.cadastec.control.system.Cadastec;
import br.com.sp.pi6.cadastec.model.db.contrato.DbConnection;
import br.com.sp.pi6.cadastec.model.entidade.TipoEvento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GIOVANNI
 */
public class TipoEventoDao {
    private DbConnection connection;

    public TipoEventoDao() {
        this.connection = Cadastec.connection;
    }
    
    public boolean insert(TipoEvento tipoEvento){
        String sql = "insert into TiposEventos"
                + "(tipoEvento, inativo)"
                + " values (?,?)";
        connection.open();
        try {
            // prepared statement para inserção
            
            PreparedStatement stmt = connection.getConnection().prepareStatement(sql);

            // seta os valores
            stmt.setString(1, tipoEvento.getTipoEvento());
            stmt.setInt(2, tipoEvento.getInativo());

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
    
    public TipoEvento getTipoEvento(TipoEvento tipoEvento) {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, tipoEvento, inativo from TiposEventos where id = ?");
            stmt.setInt(1, tipoEvento.getId());
            
            ResultSet rs = stmt.executeQuery();
            tipoEvento = new TipoEvento();
            // criando o objeto Contato
            if (rs.next()){
               
                tipoEvento.setId(rs.getInt("id"));
                tipoEvento.setTipoEvento(rs.getString("tipoEvento"));
                tipoEvento.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
            }
            rs.close();
            stmt.close();
            connection.close();
            return tipoEvento;

        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
    
    public List<TipoEvento> getTiposEventos() {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, tipoEvento, inativo from TiposEventos");
            
            ResultSet rs = stmt.executeQuery();
            List<TipoEvento> tiposEventos = new ArrayList();
            // criando o objeto Contato
            while (rs.next()){
                TipoEvento tipoEvento = new TipoEvento();
                tipoEvento.setId(rs.getInt("id"));
                tipoEvento.setTipoEvento(rs.getString("tipoEvento"));
                tipoEvento.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
                tiposEventos.add(tipoEvento);
            }
            rs.close();
            stmt.close();
            connection.close();
            return tiposEventos;
        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
}
