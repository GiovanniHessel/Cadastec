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
public class CondicaoValor {
    private int id;
    private String descricao;
    private float preco;
    private String dataInicio;
    private String dataTermino;
    private int inativo;

    public CondicaoValor() {
        this.id = 0;
        this.descricao = "";
        this.preco = 0;
        this.dataInicio = "";
        this.dataTermino = "";
        this.inativo = 0;
    }

    
    public CondicaoValor(int id, String descricao, float preco, String dataInicio, String dataTermino,int inativo) {
        this.id = id;
        this.descricao = descricao;
        this.preco = preco;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.inativo = inativo;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        this.dataTermino = dataTermino;
    }

    public int getInativo() {
        return inativo;
    }

    public void setInativo(int inativo) {
        this.inativo = inativo;
    }
    
    
    
}
