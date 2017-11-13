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
    private int inativo;
    private int tipo;

    public Usuario() {
        this.id = 0;
        this.usuario = "";
        this.chave = "";
        this.inativo = 0;
        this.tipo = 0;
    }

    public Usuario(int id, String usuario, String chave, int inativo, int tipo) {
        this.id = id;
        this.usuario = usuario;
        this.chave = chave;
        this.inativo = inativo;
        this.tipo = tipo;
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

    public int getInativo() {
        return inativo;
    }

    public void setInativo(int inativo) {
        this.inativo = inativo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    
    
    
}
