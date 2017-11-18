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
    private int id;
    private String titulo;
    private String descricao;
    private String dataHoraInicial;
    private String dataHoraFinal;
    private Endereco endereco;
    private Pessoa pessoa;
    private Empresa empresa;
    private TipoEvento tipoEvento;
    private int inativo;
    
    public Evento() {
        this.id = 0;
        this.titulo = "";
        this.descricao = "";
        this.dataHoraInicial = "";
        this.dataHoraFinal = "";
        this.endereco = new Endereco();
        this.pessoa = new Pessoa();
        this.empresa = new Empresa();
        this.tipoEvento = new TipoEvento();
        this.inativo = inativo;
    }

    public Evento(int id, String titulo, String descricao, String dataHoraInicial, String dataHoraFinal, Endereco endereco, Pessoa pessoa, Empresa empresa, TipoEvento tipoEvento, int inativo) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataHoraInicial = dataHoraInicial;
        this.dataHoraFinal = dataHoraFinal;
        this.endereco = endereco;
        this.pessoa = pessoa;
        this.empresa = empresa;
        this.tipoEvento = tipoEvento;
        this.inativo = inativo;
    }

    public int getInativo() {
        return inativo;
    }

    public void setInativo(int inativo) {
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    
    
}
