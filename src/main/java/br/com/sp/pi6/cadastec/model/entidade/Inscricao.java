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
    private int inativo;

    public Inscricao() {
        this.id = 0;
        this.idPessoas = 0;
        this.idStatusInteresses = 0;
        this.idEventos = 0;
        this.inativo = 0;
    }

    public Inscricao(int id, int idPessoas, int idStatusInteresses, int idEventos, int inativo) {
        this.id = id;
        this.idPessoas = idPessoas;
        this.idStatusInteresses = idStatusInteresses;
        this.idEventos = idEventos;
        this.inativo = inativo;
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

    public int getInativo() {
        return inativo;
    }

    public void setInativo(int inativo) {
        this.inativo = inativo;
    }
    
}
