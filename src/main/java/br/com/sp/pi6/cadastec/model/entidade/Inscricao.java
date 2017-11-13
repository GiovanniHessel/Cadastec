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
    private Pessoa pessoa;
    private Empresa empresa;
    private Evento evento;
    private int inativo;

    public Inscricao() {
        this.id = 0;
        this.pessoa = new Pessoa();
        this.empresa = new Empresa();
        this.evento = new Evento();
        this.inativo = 0;
    }

    public Inscricao(int id, Pessoa pessoa, Empresa empresa, Evento evento, int inativo) {
        this.id = id;
        this.pessoa = pessoa;
        this.empresa = empresa;
        this.evento = evento;
        this.inativo = inativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public int getInativo() {
        return inativo;
    }

    public void setInativo(int inativo) {
        this.inativo = inativo;
    }

    
    
}
