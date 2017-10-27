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
public class Contato {
    private int id;
    private String ddd;
    private String numero;
    private String tipoNumero;
    private String dataCriacao;
    private String dataAlteracao;
    private int inativo;
    private String operador;

    public Contato() {
        this.id = 0;
        this.ddd = "";
        this.numero = "";
        this.tipoNumero = "";
        this.dataCriacao = "";
        this.dataAlteracao = "";
        this.inativo = 0;
        this.operador = "";
    }

    public Contato(int id, String ddd, String numero, String tipoNumero, String dataCriacao, String dataAlteracao, int inativo, String operador) {
        this.id = id;
        this.ddd = ddd;
        this.numero = numero;
        this.tipoNumero = tipoNumero;
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

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipoNumero() {
        return tipoNumero;
    }

    public void setTipoNumero(String tipoNumero) {
        this.tipoNumero = tipoNumero;
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
