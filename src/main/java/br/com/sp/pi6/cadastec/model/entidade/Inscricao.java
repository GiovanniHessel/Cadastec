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
public class Inscricao {
    private int id;
    private int idPessoas;
    private int idStatusInteresses;
    private int idEventos;
    private String dataCriacao;
    private String dataAlteracao;
    private int inativo;
    private String operador;

    public Inscricao() {
    }

    public Inscricao(int id, int idPessoas, int idStatusInteresses, int idEventos, String dataCriacao, String dataAlteracao, int inativo, String operador) {
        this.id = id;
        this.idPessoas = idPessoas;
        this.idStatusInteresses = idStatusInteresses;
        this.idEventos = idEventos;
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

    public int getIdPessoas() {
        return idPessoas;
    }

    public void setIdPessoas(int idPessoas) {
        this.idPessoas = idPessoas;
    }

    public int getIdStatusInteresses() {
        return idStatusInteresses;
    }

    public void setIdStatusInteresses(int idStatusInteresses) {
        this.idStatusInteresses = idStatusInteresses;
    }

    public int getIdEventos() {
        return idEventos;
    }

    public void setIdEventos(int idEventos) {
        this.idEventos = idEventos;
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
