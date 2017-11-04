/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.model.dao;

import br.com.sp.pi6.cadastec.control.system.Cadastec;
import br.com.sp.pi6.cadastec.model.db.contrato.DbConnection;
import br.com.sp.pi6.cadastec.model.entidade.Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author GIOVANNI
 */
public class UsuarioDao {
    private DbConnection connection;

    public UsuarioDao() {
        this.connection = Cadastec.connection;
    }
    
    public boolean insert(Usuario usuario){
        String sql = "insert into Usuarios"
                + "(usuario, chave, inativo, acesso)"
                + " values (?,?,?,?,?)";
        connection.open();
        try {
            // prepared statement para inserção
            
            PreparedStatement stmt = connection.getConnection().prepareStatement(sql);

            // seta os valores
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getChave());
            stmt.setInt(4, usuario.getInativo());
            stmt.setString(4, usuario.getAcesso());

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
    
    public Usuario getUsuario(Usuario usuario) {
        this.connection.open();
        try {
            PreparedStatement stmt = this.connection.getConnection().prepareStatement("select * from Usuarios where usuario = ? and chave = ?");
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getChave());
            
            ResultSet rs = stmt.executeQuery();
            usuario = new Usuario();
            // criando o objeto Contato
            if (rs.next()){
                

                usuario.setId(rs.getInt("id"));
                usuario.setUsuario(rs.getString("usuario"));
                usuario.setChave(rs.getString("chave"));
                usuario.setAcesso(rs.getString("acesso"));
                usuario.setInativo(rs.getInt("inativo"));
                // adicionando o objeto à lista
            }
                
            rs.close();
            stmt.close();
            connection.close();
            return usuario;

        } catch (SQLException e) {
            connection.close();
            throw new RuntimeException(e);
        }
    }
}
