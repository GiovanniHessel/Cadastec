/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.model.dao;

import br.com.sp.pi6.cadastec.control.system.Cadastec;
import br.com.sp.pi6.cadastec.model.db.contrato.DbConnection;
import br.com.sp.pi6.cadastec.model.entidade.Cidade;
import br.com.sp.pi6.cadastec.model.entidade.Endereco;
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
public class EnderecoDao {
    private DbConnection connection;

    public EnderecoDao() {
        this.connection = Cadastec.connection;
    }
    
    public boolean insert(Endereco endereco){
        String sql = "insert into Enderecos"
                + "(logradouro, numero, complemento, bairro, idCidades, idEstados, idPaises, inativo)"
                + " values (?,?,?,?,?,?,?,?)";
        connection.open();
        try {
            // prepared statement para inserção
            
            PreparedStatement stmt = connection.getConnection().prepareStatement(sql);

            // seta os valores
            stmt.setString(1, endereco.getLogradouro());
            stmt.setString(2, endereco.getNumero());
            stmt.setString(3, endereco.getComplemento());
            stmt.setString(4, endereco.getBairro());
            stmt.setInt(5, endereco.getCidade().getId());
            stmt.setInt(6, endereco.getEstado().getId());
            stmt.setInt(7, endereco.getPais().getId());
            stmt.setInt(8, endereco.getInativo());
 
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
    
        public Endereco getEndereco(int id) {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, logradouro, numero, complemento, bairro, idCidades, idEstados, idPaises, inativo from Enderecos where id = ?");
            stmt.setInt(1, id);
            CidadeDao cidadeDao = new CidadeDao();
            EstadoDao estadoDao = new EstadoDao();
            PaisDao paisDao = new PaisDao();
            
            ResultSet rs = stmt.executeQuery();
            Endereco endereco = new Endereco();
            // criando o objeto Contato
            if (rs.next()){
                endereco.setId(rs.getInt("id"));
                endereco.setLogradouro(rs.getString("logradouro"));
                endereco.setNumero(rs.getString("numero"));
                endereco.setComplemento(rs.getString("complemento"));
                endereco.setBairro(rs.getString("bairro"));
                Cidade cidade= cidadeDao.getCidade(rs.getInt("idCidades"));
                endereco.setCidade(cidade);
                Estado estado = estadoDao.getEstado(rs.getInt("idEstados"));
                endereco.setEstado(estado);
                Pais pais = paisDao.getPais(rs.getInt("idPaises"));
                endereco.setPais(pais);
                endereco.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
            }
                
            rs.close();
            stmt.close();
            connection.close();
            return endereco;

        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
        
    public Endereco getEndereco(Endereco endereco) {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, logradouro, numero, complemento, bairro, idCidades, idEstados, idPaises, inativo from Enderecos where id = ?");
            stmt.setInt(1, endereco.getId());
            CidadeDao cidadeDao = new CidadeDao();
            EstadoDao estadoDao = new EstadoDao();
            PaisDao paisDao = new PaisDao();
            
            ResultSet rs = stmt.executeQuery();
            endereco = new Endereco();
            // criando o objeto Contato
            if (rs.next()){
                endereco.setId(rs.getInt("id"));
                endereco.setLogradouro(rs.getString("logradouro"));
                endereco.setNumero(rs.getString("numero"));
                endereco.setComplemento(rs.getString("complemento"));
                endereco.setBairro(rs.getString("bairro"));
                Cidade cidade= cidadeDao.getCidade(rs.getInt("idCidades"));
                endereco.setCidade(cidade);
                Estado estado = estadoDao.getEstado(rs.getInt("idEstados"));
                endereco.setEstado(estado);
                Pais pais = paisDao.getPais(rs.getInt("idPaises"));
                endereco.setPais(pais);
                endereco.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
            }
                
            rs.close();
            stmt.close();
            connection.close();
            return endereco;

        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
    
    public List<Endereco> getEnderecos() {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, logradouro, numero, complemento, bairro, idCidades, idEstados, idPaises, inativo from Enderecos");
            CidadeDao cidadeDao = new CidadeDao();
            EstadoDao estadoDao = new EstadoDao();
            PaisDao paisDao = new PaisDao();
            
            ResultSet rs = stmt.executeQuery();
            List<Endereco> enderecos = new ArrayList();
            // criando o objeto Contato
            while (rs.next()){
                Endereco endereco = new Endereco();
                endereco.setId(rs.getInt("id"));
                endereco.setLogradouro(rs.getString("logradouro"));
                endereco.setNumero(rs.getString("numero"));
                endereco.setComplemento(rs.getString("complemento"));
                endereco.setBairro(rs.getString("bairro"));
                Cidade cidade= cidadeDao.getCidade(rs.getInt("idCidades"));
                endereco.setCidade(cidade);
                Estado estado = estadoDao.getEstado(rs.getInt("idEstados"));
                endereco.setEstado(estado);
                Pais pais = paisDao.getPais(rs.getInt("idPaises"));
                endereco.setPais(pais);
                endereco.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
                enderecos.add(endereco);
            }
            rs.close();
            stmt.close();
            connection.close();
            return enderecos;
        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
}
