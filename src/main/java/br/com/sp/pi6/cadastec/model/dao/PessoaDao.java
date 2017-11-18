/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.model.dao;

import br.com.sp.pi6.cadastec.control.system.Cadastec;
import br.com.sp.pi6.cadastec.model.db.contrato.DbConnection;
import br.com.sp.pi6.cadastec.model.entidade.Pessoa;
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
public class PessoaDao {
    private DbConnection connection;

    public PessoaDao() {
        this.connection = Cadastec.connection;
    }
    
    public boolean insert(Pessoa pessoa){
        String sql = "insert into Pessoas"
                + "(nome, sobrenome, CPF, dataDeNascimento, idUsuarios, inativo)"
                + " values (?,?,?,'"+pessoa.getDataDeNascimento()+"',?,?)";
        connection.open();
        try {
            // prepared statement para inserção
            
            PreparedStatement stmt = connection.getConnection().prepareStatement(sql);

            // seta os valores
            stmt.setString(1, pessoa.getNome());
            stmt.setString(2, pessoa.getSobrenome());
            stmt.setString(3, pessoa.getCPF());
            //stmt.setString(4, pessoa.getDataDeNascimento());
            stmt.setInt(4, pessoa.getUsuario().getId());
            stmt.setInt(5, pessoa.getInativo());
            
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
    
    public Pessoa getPessoa(int id) {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, nome, sobrenome, CPF, dataDeNascimento, idUsuarios, inativo from Empresas where id = ?");
            stmt.setInt(1, id);
            UsuarioDao usuarioDao = new UsuarioDao();
            ResultSet rs = stmt.executeQuery();
            Pessoa pessoa = new Pessoa();
            // criando o objeto Contato
            if (rs.next()){
               
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setSobrenome(rs.getString("sobreNome"));
                pessoa.setCPF(rs.getString("CPF"));
                pessoa.setDataDeNascimento(rs.getString("dataDeNascimento"));
                Usuario usuario = usuarioDao.getUsuario(rs.getInt("idUsuarios"));
                pessoa.setUsuario(usuario);
                pessoa.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
            }
            rs.close();
            stmt.close();
            connection.close();
            return pessoa;

        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
    
    public Pessoa getPessoa(Pessoa pessoa) {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, nome, sobrenome, CPF, dataDeNascimento, idUsuarios, inativo from Empresas where id = ?");
            stmt.setInt(1, pessoa.getId());
            UsuarioDao usuarioDao = new UsuarioDao();
            ResultSet rs = stmt.executeQuery();
            pessoa = new Pessoa();
            // criando o objeto Contato
            if (rs.next()){
               
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setSobrenome(rs.getString("sobreNome"));
                pessoa.setCPF(rs.getString("CPF"));
                pessoa.setDataDeNascimento(rs.getString("dataDeNascimento"));
                Usuario usuario = usuarioDao.getUsuario(rs.getInt("idUsuarios"));
                pessoa.setUsuario(usuario);
                pessoa.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
            }
            rs.close();
            stmt.close();
            connection.close();
            return pessoa;

        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
    
    public List<Pessoa> getPessoas() {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, nome, sobrenome, CPF, dataDeNascimento, idUsuarios, inativo from Empresas");
            UsuarioDao usuarioDao = new UsuarioDao();
            ResultSet rs = stmt.executeQuery();
            List<Pessoa> pessoas = new ArrayList();
            // criando o objeto Contato
            while (rs.next()){
                Pessoa pessoa = new Pessoa();
                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setSobrenome(rs.getString("sobreNome"));
                pessoa.setCPF(rs.getString("CPF"));
                pessoa.setDataDeNascimento(rs.getString("dataDeNascimento"));
                Usuario usuario = usuarioDao.getUsuario(rs.getInt("idUsuarios"));
                pessoa.setUsuario(usuario);
                pessoa.setInativo(rs.getInt("inativo"));
                pessoas.add(pessoa);
            }
            rs.close();
            stmt.close();
            connection.close();
            return pessoas;
        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
}
