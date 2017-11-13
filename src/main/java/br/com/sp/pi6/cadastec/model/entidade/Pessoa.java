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
    private String CPF;
    private String dataDeNascimento;
    private Usuario usuario;
    private int inativo;

    public Pessoa() {
        this.id = 0;
        this.nome = "";
        this.sobrenome = "";
        this.CPF = "";
        this.dataDeNascimento = "";
        this.usuario = new Usuario();
        this.inativo = 0;
    }

    public Pessoa(int id, String nome, String sobrenome, String CPF, String dataDeNascimento, Usuario usuario, int inativo) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.CPF = CPF;
        this.dataDeNascimento = dataDeNascimento;
        this.usuario = usuario;
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

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
        
}