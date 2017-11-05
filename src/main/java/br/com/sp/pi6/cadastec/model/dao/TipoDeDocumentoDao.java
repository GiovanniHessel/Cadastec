/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.model.dao;

import br.com.sp.pi6.cadastec.control.system.Cadastec;
import br.com.sp.pi6.cadastec.model.db.contrato.DbConnection;
import br.com.sp.pi6.cadastec.model.entidade.TipoDeDocumento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GIOVANNI
 */
public class TipoDeDocumentoDao {
    private DbConnection connection;

    public TipoDeDocumentoDao() {
        this.connection = Cadastec.connection;
    }
    
    public boolean insert(TipoDeDocumento tipoDeDocumento){
        String sql = "insert into TiposDeDocumentos"
                + "(tipoDeDocumento, inativo)"
                + " values (?,?)";
        connection.open();
        try {
            // prepared statement para inserção
            
            PreparedStatement stmt = connection.getConnection().prepareStatement(sql);

            // seta os valores
            stmt.setString(1, tipoDeDocumento.getTipoDeDocumento() );
            stmt.setInt(2, tipoDeDocumento.getInativo());

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
    
    public TipoDeDocumento getTipoDeDocumento(TipoDeDocumento tipoDeDocumento) {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, tipoDeDocumento, inativo from TiposDeDocumentos where id = ?");
            stmt.setInt(1, tipoDeDocumento.getId());
            
            ResultSet rs = stmt.executeQuery();
            tipoDeDocumento = new TipoDeDocumento();
            // criando o objeto Contato
            if (rs.next()){
               
                tipoDeDocumento.setId(rs.getInt("id"));
                tipoDeDocumento.setTipoDeDocumento(rs.getString("tipoDeDocumento"));
                tipoDeDocumento.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
            }
                
            rs.close();
            stmt.close();
            connection.close();
            return tipoDeDocumento;

        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
    
    public List<TipoDeDocumento> getTipoDeDocumentos() {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, tipoDeDocumento, inativo from TiposDeDocumentos");
            
            ResultSet rs = stmt.executeQuery();
            List<TipoDeDocumento> tiposDeDocumentos = new ArrayList();
            // criando o objeto Contato
            while (rs.next()){
                TipoDeDocumento tipoDeDocumento = new TipoDeDocumento();
                tipoDeDocumento.setId(rs.getInt("id"));
                tipoDeDocumento.setTipoDeDocumento(rs.getString("tipoDeDocumento"));
                tipoDeDocumento.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
                tiposDeDocumentos.add(tipoDeDocumento);
            }
            rs.close();
            stmt.close();
            connection.close();
            return tiposDeDocumentos;
        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
}
