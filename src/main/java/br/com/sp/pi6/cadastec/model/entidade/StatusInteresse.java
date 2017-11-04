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
public class StatusInteresse {
    private int id;
    private String statusInteresse;
    private int inativo;

    public StatusInteresse() {
        this.id = 0;
        this.statusInteresse = "";
        this.inativo = 0;
    }

    public StatusInteresse(int id, String statusInteresse, int inativo) {
        this.id = id;
        this.statusInteresse = statusInteresse;
        this.inativo = inativo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatusInteresse() {
        return statusInteresse;
    }

    public void setStatusInteresse(String statusInteresse) {
        this.statusInteresse = statusInteresse;
    }

    public int getInativo() {
        return inativo;
    }

    public void setInativo(int inativo) {
        this.inativo = inativo;
    }
    
    
    
}
