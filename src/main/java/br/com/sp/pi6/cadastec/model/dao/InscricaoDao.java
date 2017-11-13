/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.model.dao;

import br.com.sp.pi6.cadastec.control.system.Cadastec;
import br.com.sp.pi6.cadastec.model.db.contrato.DbConnection;
import br.com.sp.pi6.cadastec.model.entidade.Empresa;
import br.com.sp.pi6.cadastec.model.entidade.Evento;
import br.com.sp.pi6.cadastec.model.entidade.Inscricao;
import br.com.sp.pi6.cadastec.model.entidade.Pessoa;
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
                + "(idPessoas, idEmpresas, idEventos, inativo)"
                + " values (?,?,?,?)";
        connection.open();
        try {
            // prepared statement para inserção
            
            PreparedStatement stmt = connection.getConnection().prepareStatement(sql);

            // seta os valores
            stmt.setInt(1, inscricao.getPessoa().getId());
            stmt.setInt(2, inscricao.getEmpresa().getId());
            stmt.setInt(3, inscricao.getEvento().getId());
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
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, idPessoas, idEmpresas, idEventos, inativo from Inscricoes where id = ?");
            stmt.setInt(1, inscricao.getId());
            PessoaDao pessoaDao = new PessoaDao();
            EventoDao eventoDao = new EventoDao();
            EmpresaDao empresaDao = new EmpresaDao();
            
            ResultSet rs = stmt.executeQuery();
            inscricao = new Inscricao();
            // criando o objeto Contato
            if (rs.next()){
               
                inscricao.setId(rs.getInt("id"));
                Pessoa pessoa = pessoaDao.getPessoa(rs.getInt("idPessoas"));
                inscricao.setPessoa(pessoa);
                Empresa empresa = empresaDao.getEmpresa(rs.getInt("idEmpresas"));
                inscricao.setEmpresa(empresa);
                Evento evento = eventoDao.getEvento(rs.getInt("idEventos"));
                inscricao.setEvento(evento);
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
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, idPessoas, idEmpresas, idEventos, inativo from Inscricoes");
            PessoaDao pessoaDao = new PessoaDao();
            EventoDao eventoDao = new EventoDao();
            EmpresaDao empresaDao = new EmpresaDao();
            
            ResultSet rs = stmt.executeQuery();
            List<Inscricao> inscricoes = new ArrayList();
            // criando o objeto Contato
            while (rs.next()){
                Inscricao inscricao = new Inscricao();
                
                inscricao.setId(rs.getInt("id"));
                Pessoa pessoa = pessoaDao.getPessoa(rs.getInt("idPessoas"));
                inscricao.setPessoa(pessoa);
                Empresa empresa = empresaDao.getEmpresa(rs.getInt("idEmpresas"));
                inscricao.setEmpresa(empresa);
                Evento evento = eventoDao.getEvento(rs.getInt("idEventos"));
                inscricao.setEvento(evento);
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
