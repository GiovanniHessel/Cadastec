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
public class Evento {
    int id;
    String titulo;
    String descricao;
    String dataHoraInicial;
    String dataHoraFinal;
    String dataPromover;
    int idEndereco;
    int idCondicoesValores;
    int idPessoas;
    int idTiposEventos;
    int idContatos;
    int idEmails;
    int idSites;
    int inativo;

    public Evento() {
        this.id = 0;
        this.titulo = "";
        this.descricao = "";
        this.dataHoraInicial = "";
        this.dataHoraFinal = "";
        this.dataPromover = "";
        this.idEndereco = 0;
        this.idCondicoesValores = 0;
        this.idPessoas = 0;
        this.idTiposEventos = 0;
        this.idContatos = 0;
        this.idEmails = 0;
        this.idSites = 0;
        this.inativo = inativo;
    }

    public Evento(int id, String titulo, String descricao, String dataHoraInicial, String dataHoraFinal, String dataPromover, int idEndereco, int idCondicoesValores, int idPessoas, int idTiposEventos, int idContatos, int idEmails, int idSites, int inativo) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataHoraInicial = dataHoraInicial;
        this.dataHoraFinal = dataHoraFinal;
        this.dataPromover = dataPromover;
        this.idEndereco = idEndereco;
        this.idCondicoesValores = idCondicoesValores;
        this.idPessoas = idPessoas;
        this.idTiposEventos = idTiposEventos;
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataHoraInicial() {
        return dataHoraInicial;
    }

    public void setDataHoraInicial(String dataHoraInicial) {
        this.dataHoraInicial = dataHoraInicial;
    }

    public String getDataHoraFinal() {
        return dataHoraFinal;
    }

    public void setDataHoraFinal(String dataHoraFinal) {
        this.dataHoraFinal = dataHoraFinal;
    }

    public String getDataPromover() {
        return dataPromover;
    }

    public void setDataPromover(String dataPromover) {
        this.dataPromover = dataPromover;
    }

    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public int getIdCondicoesValores() {
        return idCondicoesValores;
    }

    public void setIdCondicoesValores(int idCondicoesValores) {
        this.idCondicoesValores = idCondicoesValores;
    }

    public int getIdPessoas() {
        return idPessoas;
    }

    public void setIdPessoas(int idPessoas) {
        this.idPessoas = idPessoas;
    }

    public int getIdTiposEventos() {
        return idTiposEventos;
    }

    public void setIdTiposEventos(int idTiposEventos) {
        this.idTiposEventos = idTiposEventos;
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
