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
    private Evento evento;
    private String email;
    private String site;
    private int inativo;

    public Contato() {
        this.id = 0;
        this.ddd = "";
        this.numero = "";
        this.tipoNumero = "";
        this.evento = new Evento();
        this.email = "";
        this.site = "";
        this.inativo = 0;
    }

    public Contato(int id, String ddd, String numero, String tipoNumero, Evento evento, String email, String site, int inativo) {
        this.id = id;
        this.ddd = ddd;
        this.numero = numero;
        this.tipoNumero = tipoNumero;
        this.evento = evento;
        this.email = email;
        this.site = site;
        this.inativo = inativo;
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

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public int getInativo() {
        return inativo;
    }

    public void setInativo(int inativo) {
        this.inativo = inativo;
    }
    
    
    
}
