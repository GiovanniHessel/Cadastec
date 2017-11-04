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
public class Estado {
    private int id;
    private String estado;
    private String sigla;
    private int idPais;
    private int inativo;

    public Estado() {
        this.id = 0;
        this.estado = "";
        this.sigla = "";
        this.idPais = 0;
        this.inativo = 0;
    }

    public Estado(int id, String estado, String sigla, int idPais, int inativo) {
        this.id = id;
        this.estado = estado;
        this.sigla = sigla;
        this.idPais = idPais;
        this.inativo = inativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getIdPais() {
        return idPais;
    }

    public void setIdPais(int idPais) {
        this.idPais = idPais;
    }

    public int getInativo() {
        return inativo;
    }

    public void setInativo(int inativo) {
        this.inativo = inativo;
    }

    
}
