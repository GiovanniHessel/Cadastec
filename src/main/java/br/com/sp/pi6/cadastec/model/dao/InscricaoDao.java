/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.model.dao;

import br.com.sp.pi6.cadastec.control.system.Cadastec;
import br.com.sp.pi6.cadastec.model.db.contrato.DbConnection;
import br.com.sp.pi6.cadastec.model.entidade.Inscricao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GIOVANNI
 */
public class InscricaoDao {
    private DbConnection connection;

    public InscricaoDao() {
        this.connection = Cadastec.connection;
    }
    
    public boolean insert(Inscricao inscricao){
        String sql = "insert into Inscricoes"
                + "(idPessoas, idStatusInteresses, idEventos, inativo)"
                + " values (?,?,?,?)";
        connection.open();
        try {
            // prepared statement para inserção
            
            PreparedStatement stmt = connection.getConnection().prepareStatement(sql);

            // seta os valores
            stmt.setInt(1, inscricao.getIdPessoas());
            stmt.setInt(2, inscricao.getIdStatusInteresses());
            stmt.setInt(3, inscricao.getIdEventos());
            stmt.setInt(4, inscricao.getInativo());
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
    
    public Inscricao getInscricao(Inscricao inscricao) {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, idPessoas, idStatusInteresses, idEventos, inativo from Inscricoes where id = ?");
            stmt.setInt(1, inscricao.getId());
            
            ResultSet rs = stmt.executeQuery();
            inscricao = new Inscricao();
            // criando o objeto Contato
            if (rs.next()){
               
                inscricao.setId(rs.getInt("id"));
                inscricao.setIdPessoas(rs.getInt("idPessoas"));
                inscricao.setIdStatusInteresses(rs.getInt("idStatusInteresses"));
                inscricao.setIdEventos(rs.getInt("idEventos"));
                inscricao.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
            }
            rs.close();
            stmt.close();
            connection.close();
            return inscricao;

        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
    
    public List<Inscricao> getInscricoes() {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, idPessoas, idStatusInteresses, idEventos, inativo from Inscricoes");
            
            ResultSet rs = stmt.executeQuery();
            List<Inscricao> inscricoes = new ArrayList();
            // criando o objeto Contato
            while (rs.next()){
                Inscricao inscricao = new Inscricao();
                
                inscricao.setId(rs.getInt("id"));
                inscricao.setIdPessoas(rs.getInt("idPessoas"));
                inscricao.setIdStatusInteresses(rs.getInt("idStatusInteresses"));
                inscricao.setIdEventos(rs.getInt("idEventos"));
                inscricao.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
                inscricoes.add(inscricao);
            }
            rs.close();
            stmt.close();
            connection.close();
            return inscricoes;
        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
}
