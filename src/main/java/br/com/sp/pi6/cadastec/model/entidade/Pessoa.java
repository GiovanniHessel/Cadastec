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
public class Pessoa {
    private int id;
    private String nome;
    private String sobrenome;
    private String cpf;
    private String documento;
    private int idTiposDeDocumentos;
    private String sexo;
    private String dataDeNascimento;
    private int idEnderecos;
    private int idContatos;
    private int idEmails;
    private int idSites;
    private int inativo;

    public Pessoa() {
        this.id = 0;
        this.nome = "";
        this.sobrenome = "";
        this.cpf = "";
        this.documento = "";
        this.idTiposDeDocumentos = 0;
        this.sexo = "";
        this.dataDeNascimento = "";
        this.idEnderecos = 0;
        this.idContatos = 0;
        this.idEmails = 0;
        this.idSites = 0;
        this.inativo = 0;
    }

    public Pessoa(int id, String nome, String sobrenome, String cpf, String documento, int idTiposDeDocumentos, String sexo, String dataDeNascimento, int idEnderecos, int idContatos, int idEmails, int idSites, int inativo) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.documento = documento;
        this.idTiposDeDocumentos = idTiposDeDocumentos;
        this.sexo = sexo;
        this.dataDeNascimento = dataDeNascimento;
        this.idEnderecos = idEnderecos;
        this.idContatos = idContatos;
        this.idEmails = idEmails;
        this.idSites = idSites;
        this.inativo = inativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getIdTiposDeDocumentos() {
        return idTiposDeDocumentos;
    }

    public void setIdTiposDeDocumentos(int idTiposDeDocumentos) {
        this.idTiposDeDocumentos = idTiposDeDocumentos;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public int getIdEnderecos() {
        return idEnderecos;
    }

    public void setIdEnderecos(int idEnderecos) {
        this.idEnderecos = idEnderecos;
    }

    public int getIdContatos() {
        return idContatos;
    }

    public void setIdContatos(int idContatos) {
        this.idContatos = idContatos;
    }

    public int getIdEmails() {
        return idEmails;
    }

    public void setIdEmails(int idEmails) {
        this.idEmails = idEmails;
    }

    public int getIdSites() {
        return idSites;
    }

    public void setIdSites(int idSites) {
        this.idSites = idSites;
    }

    public int getInativo() {
        return inativo;
    }

    public void setInativo(int inativo) {
        this.inativo = inativo;
    }   
}