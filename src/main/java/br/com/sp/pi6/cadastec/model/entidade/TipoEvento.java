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
public class TipoEvento {
    private int id;
    private String tipoEvento;
    private int inativo;

    public TipoEvento() {
        this.id = 0;
        this.tipoEvento = "";
        this.inativo = 0;
    }

    public TipoEvento(int id, String tipoEvento, int inativo) {
        this.id = id;
        this.tipoEvento = tipoEvento;
        this.inativo = inativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getInativo() {
        return inativo;
    }

    public void setInativo(int inativo) {
        this.inativo = inativo;
    }
    
    
}
