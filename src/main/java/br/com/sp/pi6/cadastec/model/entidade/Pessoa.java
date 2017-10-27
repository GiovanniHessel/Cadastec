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
    private int idNacionalidades;
    private int idEtinias;
    private int idOpcoesSexuais;
    private int idAreasProfissionais;
    private int idEstadosCivis;
    private int idEscolaridades;
    private String dataCriacao;
    private String dataAlteracao;
    private int inativo;
    private String operador;

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
        this.idNacionalidades = 0;
        this.idEtinias = 0;
        this.idOpcoesSexuais = 0;
        this.idAreasProfissionais = 0;
        this.idEstadosCivis = 0;
        this.idEscolaridades = 0;
        this.dataCriacao = "";
        this.dataAlteracao = "";
        this.inativo = 0;
        this.operador = "";
    }

    public Pessoa(int id, String nome, String sobrenome, String cpf, String documento, int idTiposDeDocumentos, String sexo, String dataDeNascimento, int idEnderecos, int idContatos, int idEmails, int idSites, int idNacionalidades, int idEtinias, int idOpcoesSexuais, int idAreasProfissionais, int idEstadosCivis, int idEscolaridades, String dataCriacao, String dataAlteracao, int inativo, String operador) {
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
        this.idNacionalidades = idNacionalidades;
        this.idEtinias = idEtinias;
        this.idOpcoesSexuais = idOpcoesSexuais;
        this.idAreasProfissionais = idAreasProfissionais;
        this.idEstadosCivis = idEstadosCivis;
        this.idEscolaridades = idEscolaridades;
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

    public int getIdNacionalidades() {
        return idNacionalidades;
    }

    public void setIdNacionalidades(int idNacionalidades) {
        this.idNacionalidades = idNacionalidades;
    }

    public int getIdEtinias() {
        return idEtinias;
    }

    public void setIdEtinias(int idEtinias) {
        this.idEtinias = idEtinias;
    }

    public int getIdOpcoesSexuais() {
        return idOpcoesSexuais;
    }

    public void setIdOpcoesSexuais(int idOpcoesSexuais) {
        this.idOpcoesSexuais = idOpcoesSexuais;
    }

    public int getIdAreasProfissionais() {
        return idAreasProfissionais;
    }

    public void setIdAreasProfissionais(int idAreasProfissionais) {
        this.idAreasProfissionais = idAreasProfissionais;
    }

    public int getIdEstadosCivis() {
        return idEstadosCivis;
    }

    public void setIdEstadosCivis(int idEstadosCivis) {
        this.idEstadosCivis = idEstadosCivis;
    }

    public int getIdEscolaridades() {
        return idEscolaridades;
    }

    public void setIdEscolaridades(int idEscolaridades) {
        this.idEscolaridades = idEscolaridades;
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