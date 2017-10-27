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
public class Endereco {
    private int id;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private int idCidades;
    private int idEstados;
    private int idPais;
    private String dataCriacao;
    private String dataAlteracao;
    private int inativo;
    private String operador;

    public Endereco() {
        this.id = 0;
        this.logradouro = "";
        this.numero = "";
        this.complemento = "";
        this.bairro = "";
        this.idCidades = 0;
        this.idEstados = 0;
        this.idPais = 0;
        this.dataCriacao = "";
        this.dataAlteracao = "";
        this.inativo = 0;
        this.operador = "";
    }

    public Endereco(int id, String logradouro, String numero, String complemento, String bairro, int idCidades, int idEstados, int idPais, String dataCriacao, String dataAlteracao, int inativo, String operador) {
        this.id = id;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.idCidades = idCidades;
        this.idEstados = idEstados;
        this.idPais = idPais;
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

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getIdCidades() {
        return idCidades;
    }

    public void setIdCidades(int idCidades) {
        this.idCidades = idCidades;
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
