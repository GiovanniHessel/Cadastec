/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.model.entidade;

/**
 *
 * @author GIOVANNI
 */
public class Usuario {
    private int id;
    private String usuario;
    private String chave;
    private int online; 
    private int inativo;
    private String acesso;

    public Usuario(int id, String usuario, String chave, int online, int inativo, String acesso) {
        this.id = id;
        this.usuario = usuario;
        this.chave = chave;
        this.online = online;
        this.inativo = inativo;
        this.acesso = acesso;
    }

    public Usuario() {
        this.id = 0;
        this.usuario = "";
        this.chave = "";
        this.online = 0;
        this.inativo = 0;
        this.acesso = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public int getOnline() {
        return online;
    }

    public void setOnline(int online) {
        this.online = online;
    }

    public int getInativo() {
        return inativo;
    }

    public void setInativo(int inativo) {
        this.inativo = inativo;
    }

    public String getAcesso() {
        return acesso;
    }

    public void setAcesso(String acesso) {
        this.acesso = acesso;
    }
    
    
    
    
}
