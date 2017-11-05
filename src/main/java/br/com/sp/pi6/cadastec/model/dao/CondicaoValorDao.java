/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.model.dao;

import br.com.sp.pi6.cadastec.control.system.Cadastec;
import br.com.sp.pi6.cadastec.model.db.contrato.DbConnection;
import br.com.sp.pi6.cadastec.model.entidade.CondicaoValor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GIOVANNI
 */
public class CondicaoValorDao {
    private DbConnection connection;

    public CondicaoValorDao() {
        this.connection = Cadastec.connection;
    }
    
    public boolean insert(CondicaoValor condicaoValor){
        String sql = "insert into CondicoesValores"
                + "(descricao, preco, dataInicio, dataTermino, inativo)"
                + " values (?,?,?,?,?)";
        connection.open();
        try {
            // prepared statement para inserção
            
            PreparedStatement stmt = connection.getConnection().prepareStatement(sql);

            // seta os valores
            stmt.setString(1, condicaoValor.getDescricao());
            stmt.setFloat(2, condicaoValor.getPreco());
            stmt.setString(3, condicaoValor.getDataInicio());
            stmt.setString(4, condicaoValor.getDataTermino());
            stmt.setInt(5, condicaoValor.getInativo());
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
    
    public CondicaoValor getCondicaoValor(CondicaoValor condicaoValor) {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, descricao, preco, dataInicio, dataTermino, inativo from CondicoesValores where id = ?");
            stmt.setInt(1, condicaoValor.getId());
            
            ResultSet rs = stmt.executeQuery();
            condicaoValor = new CondicaoValor();
            // criando o objeto Contato
            if (rs.next()){
               
                condicaoValor.setId(rs.getInt("id"));
                condicaoValor.setDescricao(rs.getString("descricao"));
                condicaoValor.setPreco(rs.getFloat("preco"));
                condicaoValor.setDataInicio(rs.getString("dataInicio"));
                condicaoValor.setDataTermino(rs.getString("dataTermino"));
                condicaoValor.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
            }
                
            rs.close();
            stmt.close();
            connection.close();
            return condicaoValor;

        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
    
    public List<CondicaoValor> getCondicoesValores() {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, descricao, preco, dataInicio, dataTermino, inativo from CondicoesValores");
            
            ResultSet rs = stmt.executeQuery();
            List<CondicaoValor> condicoesValores = new ArrayList();
            // criando o objeto Contato
            while (rs.next()){
                CondicaoValor condicaoValor = new CondicaoValor();
                condicaoValor.setId(rs.getInt("id"));
                condicaoValor.setDescricao(rs.getString("descricao"));
                condicaoValor.setPreco(rs.getFloat("preco"));
                condicaoValor.setDataInicio(rs.getString("dataInicio"));
                condicaoValor.setDataTermino(rs.getString("dataTermino"));
                condicaoValor.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
                condicoesValores.add(condicaoValor);
            }
            rs.close();
            stmt.close();
            connection.close();
            return condicoesValores;
        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
}
