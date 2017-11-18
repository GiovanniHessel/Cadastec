/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.model.dao;

import br.com.sp.pi6.cadastec.control.system.Cadastec;
import br.com.sp.pi6.cadastec.model.db.contrato.DbConnection;
import br.com.sp.pi6.cadastec.model.entidade.Empresa;
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
public class EmpresaDao {
    private DbConnection connection;

    public EmpresaDao() {
        this.connection = Cadastec.connection;
    }
    
    public boolean insert(Empresa empresa){
        String sql = "insert into Empresas"
                + "(nomeFantasia, razaoSocial, CNPJ, dataDeCriacao, idUsuarios, inativo)"
                + " values (?,?,?,'"+empresa.getDataDeCriacao()+"',?,?)";
        connection.open();
        try {
            // prepared statement para inserção
            
            PreparedStatement stmt = connection.getConnection().prepareStatement(sql);

            // seta os valores
            stmt.setString(1, empresa.getNomeFantasia());
            stmt.setString(2, empresa.getRazaoSocial());
            stmt.setString(3, empresa.getCNPJ());
            //stmt.setString(4, empresa.getDataDeCriacao());
            stmt.setInt(4, empresa.getUsuario().getId());
            stmt.setInt(5, empresa.getInativo());
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
    
    public Empresa getEmpresa(int id) {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, nomeFantasia, razaoSocial, CNPJ, dataDeCriacao, idUsuarios, inativo from Empresas where id = ?");
            stmt.setInt(1, id);
            UsuarioDao usuarioDao = new UsuarioDao();
            ResultSet rs = stmt.executeQuery();
            Empresa empresa = new Empresa();
            // criando o objeto Contato
            if (rs.next()){
               
                empresa.setId(rs.getInt("id"));
                empresa.setNomeFantasia(rs.getString("nomeFantasia"));
                empresa.setRazaoSocial(rs.getString("razaoSocial"));
                empresa.setCNPJ(rs.getString("CNPJ"));
                empresa.setDataDeCriacao(rs.getString("dataDeCriacao"));
                Usuario usuario = usuarioDao.getUsuario(rs.getInt("idUsuarios"));
                empresa.setUsuario(usuario);
                empresa.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
            }
            rs.close();
            stmt.close();
            connection.close();
            return empresa;

        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
    
    public Empresa getEmpresa(Empresa empresa) {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, nomeFantasia, razaoSocial, CNPJ, dataDeCriacao, idUsuarios, inativo from Empresas where id = ?");
            stmt.setInt(1, empresa.getId());
            UsuarioDao usuarioDao = new UsuarioDao();
            ResultSet rs = stmt.executeQuery();
            empresa = new Empresa();
            // criando o objeto Contato
            if (rs.next()){
               
                empresa.setId(rs.getInt("id"));
                empresa.setNomeFantasia(rs.getString("nomeFantasia"));
                empresa.setRazaoSocial(rs.getString("razaoSocial"));
                empresa.setCNPJ(rs.getString("CNPJ"));
                empresa.setDataDeCriacao(rs.getString("dataDeCriacao"));
                Usuario usuario = usuarioDao.getUsuario(rs.getInt("idUsuarios"));
                empresa.setUsuario(usuario);
                empresa.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
            }
            rs.close();
            stmt.close();
            connection.close();
            return empresa;

        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
    
    public List<Empresa> getEmpresas() {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, nomeFantasia, razaoSocial, CNPJ, dataDeCriacao, idUsuarios, inativo from Empresas");
            UsuarioDao usuarioDao = new UsuarioDao();
            ResultSet rs = stmt.executeQuery();
            List<Empresa> empresas = new ArrayList();
            // criando o objeto Contato
            while (rs.next()){
                Empresa empresa = new Empresa();
                empresa.setId(rs.getInt("id"));
                empresa.setNomeFantasia(rs.getString("nomeFantasia"));
                empresa.setRazaoSocial(rs.getString("razaoSocial"));
                empresa.setCNPJ(rs.getString("CNPJ"));
                empresa.setDataDeCriacao(rs.getString("dataDeCriacao"));
                Usuario usuario = usuarioDao.getUsuario(rs.getInt("idUsuarios"));
                empresa.setUsuario(usuario);
                empresa.setInativo(rs.getInt("inativo"));
                empresas.add(empresa);
            }
            rs.close();
            stmt.close();
            connection.close();
            return empresas;
        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
}
