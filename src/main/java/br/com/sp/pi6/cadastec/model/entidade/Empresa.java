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
public class Empresa {
    private int id;
    private String nomeFantasia;
    private String razaoSocial;
    private String CNPJ;
    private String dataDeCriacao;
    private Usuario usuario;
    private int inativo;

    public Empresa() {
        this.id = 0;
        this.nomeFantasia = "";
        this.razaoSocial = "";
        this.CNPJ = "";
        this.dataDeCriacao = "";
        this.usuario = usuario;
        this.inativo = 0;
    }

    public Empresa(int id, String nomeFantasia, String razaoSocial, String CNPJ, String dataDeCriacao, Usuario usuario, int inativo) {
        this.id = id;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.CNPJ = CNPJ;
        this.dataDeCriacao = dataDeCriacao;
        this.usuario = usuario;
        this.inativo = inativo;
    }

    public int getInativo() {
        return inativo;
    }

    public void setInativo(int inativo) {
        this.inativo = inativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void setDataDeCriacao(String dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
   
    
}