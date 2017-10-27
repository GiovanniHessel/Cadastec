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
public class TipoEvento {
    private int id;
    private String tipoEvento;
    private String dataCriacao;
    private String dataAlteracao;
    private int inativo;
    private String operador;

    public TipoEvento() {
        this.id = 0;
        this.tipoEvento = "";
        this.dataCriacao = "";
        this.dataAlteracao = "";
        this.inativo = 0;
        this.operador = "";
    }
 
    public TipoEvento(int id, String tipoEvento, String dataCriacao, String dataAlteracao, int inativo, String operador) {
        this.id = id;
        this.tipoEvento = tipoEvento;
        this.dataCriacao = dataCriacao;
        this.dataAlteracao = dataAlteracao;
        this.inativo = inativo;
        this.operador = operador;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(String dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public int getInativo() {
        return inativo;
    }

    public void setInativo(int inativo) {
        this.inativo = inativo;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }
    
}
