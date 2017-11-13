/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.model.dao;

import br.com.sp.pi6.cadastec.control.system.Cadastec;
import br.com.sp.pi6.cadastec.model.db.contrato.DbConnection;
import br.com.sp.pi6.cadastec.model.entidade.Contato;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GIOVANNI
 */
public class ContatoDao {

    private DbConnection connection;

    public ContatoDao() {
        this.connection = Cadastec.connection;
    }

    public boolean insert(Contato contato) {
        String sql = "insert into Inscricoes"
                + "(ddd, numero, tipoNumero, email, site, idEventos, inativo)"
                + " values (?,?,?,?)";
        connection.open();
        try {
            // prepared statement para inserção

            PreparedStatement stmt = connection.getConnection().prepareStatement(sql);

            // seta os valores
            stmt.setString(1, contato.getDdd());
            stmt.setString(2, contato.getNumero());
            stmt.setString(3, contato.getTipoNumero());
            stmt.setString(4, contato.getEmail());
            stmt.setString(5, contato.getSite());
            stmt.setInt(6, contato.getEvento().getId());
            stmt.setInt(7, contato.getInativo());
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

    public Contato getContato(Contato contato) {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, ddd, numero, tipoNumero, email, site, idEventos, inativo from Inscricoes where id = ?");
            stmt.setInt(1, contato.getId());
            
            //EventoDao eventoDao = new EventoDao();
            ResultSet rs = stmt.executeQuery();
            contato = new Contato();
            // criando o objeto Contato
            if (rs.next()) {
                contato.setId(rs.getInt("id"));
                contato.setDdd(rs.getString("ddd"));
                contato.setNumero(rs.getString("numero"));
                contato.setTipoNumero(rs.getString("tipoNumero"));
                contato.setEmail(rs.getString("email"));
                contato.setSite(rs.getString("site"));
                //Evento evento = eventoDao.getEvento(rs.getInt("idEventos"));
                //contato.setEventos(evento);
                contato.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
            }
            rs.close();
            stmt.close();
            connection.close();
            return contato;

        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }

    public List<Contato> getContatos() {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, ddd, numero, tipoNumero, email, site, idEventos, inativo");
                
            //EventoDao eventoDao = new EventoDao();
            ResultSet rs = stmt.executeQuery();
            List<Contato> contatos = new ArrayList();
            // criando o objeto Contato
            while (rs.next()) {
                Contato contato = new Contato();

                contato.setId(rs.getInt("id"));
                contato.setDdd(rs.getString("ddd"));
                contato.setNumero(rs.getString("numero"));
                contato.setTipoNumero(rs.getString("tipoNumero"));
                contato.setEmail(rs.getString("email"));
                contato.setSite(rs.getString("site"));
                //Evento evento = eventoDao.getEvento(rs.getInt("idEventos"));
                //contato.setEventos(evento);
                contato.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
                contatos.add(contato);
            }
            rs.close();
            stmt.close();
            connection.close();
            return contatos;
        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
}
