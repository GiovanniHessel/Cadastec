/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.model.dao;

import br.com.sp.pi6.cadastec.control.system.Cadastec;
import br.com.sp.pi6.cadastec.model.db.contrato.DbConnection;
import br.com.sp.pi6.cadastec.model.entidade.Empresa;
import br.com.sp.pi6.cadastec.model.entidade.Endereco;
import br.com.sp.pi6.cadastec.model.entidade.Evento;
import br.com.sp.pi6.cadastec.model.entidade.Pessoa;
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
public class EventoDao {
    private DbConnection connection;

    public EventoDao() {
        this.connection = Cadastec.connection;
    }
    
    public boolean insert(Evento evento){
        String sql = "insert into Eventos"
                + "(titulo, descricao, dataHoraInicial, dataHoraFinal, idEnderecos, idPessoas, idEmpresas, idTiposEventos, inativo)"
                + " values (?,?,?,?,?,?,?,?)";
        connection.open();
        try {
            // prepared statement para inserção
            
            PreparedStatement stmt = connection.getConnection().prepareStatement(sql);

            // seta os valores
            stmt.setString(1, evento.getTitulo());
            stmt.setString(2, evento.getDescricao());
            stmt.setString(3, evento.getDataHoraInicial());
            stmt.setString(4, evento.getDataHoraFinal());
            stmt.setInt(5, evento.getPessoa().getId());
            stmt.setInt(6, evento.getEmpresa().getId());
            stmt.setInt(7, evento.getTipoEvento().getId());
            stmt.setInt(8, evento.getInativo());
 
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
    
    public Evento getEvento(int id) {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, titulo, descricao, dataHoraInicial, dataHoraFinal, idEnderecos, idPessoas, idEmpresas, idTiposEventos, inativo from Eventos where id = ?");
            stmt.setInt(1, id);
            
            EnderecoDao enderecoDao = new EnderecoDao();
            PessoaDao pessoaDao = new PessoaDao();
            EmpresaDao empresaDao = new EmpresaDao();
            TipoEventoDao tipoEventoDao = new TipoEventoDao();
            
            ResultSet rs = stmt.executeQuery();
            Evento evento = new Evento();
            // criando o objeto Contato
            if (rs.next()){
                evento.setId(rs.getInt("id"));
                evento.setTitulo(rs.getString("titulo"));
                evento.setDescricao(rs.getString("descricao"));
                evento.setDataHoraInicial(rs.getString("dataHoraInicial"));
                evento.setDataHoraFinal(rs.getString("dataHoraFinal"));
                Endereco endereco = enderecoDao.getEndereco(rs.getInt("idEnderecos"));
                evento.setEndereco(endereco);
                Pessoa pessoa = pessoaDao.getPessoa(rs.getInt("idPessoas"));
                evento.setPessoa(pessoa);
                Empresa empresa = empresaDao.getEmpresa(rs.getInt("idEmpresas"));
                evento.setEmpresa(empresa);
                TipoEvento tipoEvento = tipoEventoDao.getTipoEvento(rs.getInt("idTiposEventos"));
                evento.setTipoEvento(tipoEvento);
                evento.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
            }
                
            rs.close();
            stmt.close();
            connection.close();
            return evento;

        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
    
    public Evento getEvento(Evento evento) {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, titulo, descricao, dataHoraInicial, dataHoraFinal, idEnderecos, idPessoas, idEmpresas, idTiposEventos, inativo from Eventos where id = ?");
            stmt.setInt(1, evento.getId());
            
            EnderecoDao enderecoDao = new EnderecoDao();
            PessoaDao pessoaDao = new PessoaDao();
            EmpresaDao empresaDao = new EmpresaDao();
            TipoEventoDao tipoEventoDao = new TipoEventoDao();
            
            ResultSet rs = stmt.executeQuery();
            evento = new Evento();
            // criando o objeto Contato
            if (rs.next()){
                evento.setId(rs.getInt("id"));
                evento.setTitulo(rs.getString("titulo"));
                evento.setDescricao(rs.getString("descricao"));
                evento.setDataHoraInicial(rs.getString("dataHoraInicial"));
                evento.setDataHoraFinal(rs.getString("dataHoraFinal"));
                Endereco endereco = enderecoDao.getEndereco(rs.getInt("idEnderecos"));
                evento.setEndereco(endereco);
                Pessoa pessoa = pessoaDao.getPessoa(rs.getInt("idPessoas"));
                evento.setPessoa(pessoa);
                Empresa empresa = empresaDao.getEmpresa(rs.getInt("idEmpresas"));
                evento.setEmpresa(empresa);
                TipoEvento tipoEvento = tipoEventoDao.getTipoEvento(rs.getInt("idTiposEventos"));
                evento.setTipoEvento(tipoEvento);
                evento.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
            }
                
            rs.close();
            stmt.close();
            connection.close();
            return evento;

        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
    
    public List<Evento> getEventos() {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, titulo, descricao, dataHoraInicial, dataHoraFinal, idEnderecos, idPessoas, idEmpresas, idTiposEventos, inativo from Eventos");
            EnderecoDao enderecoDao = new EnderecoDao();
            PessoaDao pessoaDao = new PessoaDao();
            EmpresaDao empresaDao = new EmpresaDao();
            TipoEventoDao tipoEventoDao = new TipoEventoDao();
            
            ResultSet rs = stmt.executeQuery();
            List<Evento> eventos = new ArrayList();
            // criando o objeto Contato
            while (rs.next()){
                Evento evento = new Evento();
                evento.setId(rs.getInt("id"));
                evento.setTitulo(rs.getString("titulo"));
                evento.setDescricao(rs.getString("descricao"));
                evento.setDataHoraInicial(rs.getString("dataHoraInicial"));
                evento.setDataHoraFinal(rs.getString("dataHoraFinal"));
                Endereco endereco = enderecoDao.getEndereco(rs.getInt("idEnderecos"));
                evento.setEndereco(endereco);
                Pessoa pessoa = pessoaDao.getPessoa(rs.getInt("idPessoas"));
                evento.setPessoa(pessoa);
                Empresa empresa = empresaDao.getEmpresa(rs.getInt("idEmpresas"));
                evento.setEmpresa(empresa);
                TipoEvento tipoEvento = tipoEventoDao.getTipoEvento(rs.getInt("idTiposEventos"));
                evento.setTipoEvento(tipoEvento);
                evento.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
                eventos.add(evento);
            }
            rs.close();
            stmt.close();
            connection.close();
            return eventos;
        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
    public List<Evento> getEventos(String DataPeriodo1, String DataPeriodo2 ) {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select id, titulo, descricao, dataHoraInicial, dataHoraFinal, idEnderecos, idPessoas, idEmpresas, idTiposEventos, inativo from Eventos" 
                                                                                        +"where dataHoraInicial >= '" + DataPeriodo1 + "' and dataHoraInicial <= '" + DataPeriodo2 + "'");
            EnderecoDao enderecoDao = new EnderecoDao();
            PessoaDao pessoaDao = new PessoaDao();
            EmpresaDao empresaDao = new EmpresaDao();
            TipoEventoDao tipoEventoDao = new TipoEventoDao();
            
            ResultSet rs = stmt.executeQuery();
            List<Evento> eventos = new ArrayList();
            // criando o objeto Contato
            while (rs.next()){
                Evento evento = new Evento();
                evento.setId(rs.getInt("id"));
                evento.setTitulo(rs.getString("titulo"));
                evento.setDescricao(rs.getString("descricao"));
                evento.setDataHoraInicial(rs.getString("dataHoraInicial"));
                evento.setDataHoraFinal(rs.getString("dataHoraFinal"));
                Endereco endereco = enderecoDao.getEndereco(rs.getInt("idEnderecos"));
                evento.setEndereco(endereco);
                Pessoa pessoa = pessoaDao.getPessoa(rs.getInt("idPessoas"));
                evento.setPessoa(pessoa);
                Empresa empresa = empresaDao.getEmpresa(rs.getInt("idEmpresas"));
                evento.setEmpresa(empresa);
                TipoEvento tipoEvento = tipoEventoDao.getTipoEvento(rs.getInt("idTiposEventos"));
                evento.setTipoEvento(tipoEvento);
                evento.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
                eventos.add(evento);
            }
            rs.close();
            stmt.close();
            connection.close();
            return eventos;
        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
}
