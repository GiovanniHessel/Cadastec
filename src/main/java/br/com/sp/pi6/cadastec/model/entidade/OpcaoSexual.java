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
public class OpcaoSexual {

    private int id;
    private String opcaoSexual;
    private String dataCriacao;
    private String dataAlteracao;
    private int inativo;
    private String operador;

    public OpcaoSexual() {
        this.id = 0;
        this.opcaoSexual = "";
        this.dataCriacao = "";
        this.dataAlteracao = "";
        this.inativo = 0;
        this.operador = "";
    }

    public OpcaoSexual(int id, String opcaoSexual, String dataCriacao, String dataAlteracao, int inativo, String operador) {
        this.id = id;
        this.opcaoSexual = opcaoSexual;
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

    public String getOpcaoSexual() {
        return opcaoSexual;
    }

    public void setOpcaoSexual(String opcaoSexual) {
        this.opcaoSexual = opcaoSexual;
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
