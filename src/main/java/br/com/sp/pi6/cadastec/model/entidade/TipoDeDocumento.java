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
public class TipoDeDocumento {
    private int id;
    private String tipoDeDocumento;
    private int inativo;

    public TipoDeDocumento() {
        this.id = 0;
        this.tipoDeDocumento = "";
        this.inativo = 0;
    }

    public TipoDeDocumento(int id, String tipoDeDocumento, int inativo) {
        this.id = id;
        this.tipoDeDocumento = tipoDeDocumento;
        this.inativo = inativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    public void setTipoDeDocumento(String tipoDeDocumento) {
        this.tipoDeDocumento = tipoDeDocumento;
    }

    public int getInativo() {
        return inativo;
    }

    public void setInativo(int inativo) {
        this.inativo = inativo;
    }
    
    
}
