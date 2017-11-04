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
public class Cidade {
    private int id;
    private String cidade;
    private String sigla;    
    private int idEstados;
    private int idPais;
    private int inativo;

    public Cidade() {
        this.id = 0;
        this.cidade = "";
        this.sigla = "";
        this.idEstados = 0;
        this.idPais = 0;
        this.inativo = 0;
    }

    public Cidade(int id, String cidade, String sigla, int idEstados, int idPais, int inativo) {
        this.id = id;
        this.cidade = cidade;
        this.sigla = sigla;
        this.idEstados = idEstados;
        this.idPais = idPais;
        this.inativo = inativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getIdEstados() {
        return idEstados;
    }

    public void setIdEstados(int idEstados) {
        this.idEstados = idEstados;
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
