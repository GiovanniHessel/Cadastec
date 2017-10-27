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
public class StatusInteresse {
    private int id;
    private String statusInteresse;
    private String dataCriacao;
    private String dataAlteracao;
    private int inativo;
    private String operador;

    public StatusInteresse() {
        this.id = 0;
        this.statusInteresse = "";
        this.dataCriacao = "";
        this.dataAlteracao = "";
        this.inativo = 0;
        this.operador = "";
    }

    public StatusInteresse(int id, String statusInteresse, String dataCriacao, String dataAlteracao, int inativo, String operador) {
        this.id = id;
        this.statusInteresse = statusInteresse;
        this.dataCriacao = dataCriacao;
        this.dataAlteracao = dataAlteracao;
        this.inativo = inativo;
        this.operador = operador;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatusInteresse() {
        return statusInteresse;
    }

    public void setStatusInteresse(String statusInteresse) {
        this.statusInteresse = statusInteresse;
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
    
    
}
