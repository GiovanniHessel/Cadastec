/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.model.db.entidade;

/**
 *
 * @author GIOVANNI
 */
public class SqlStringConnection {
    private String descricao;
    private String porta;
    private String host;
    private String base;
    private String login;
    private String senha;
    private String drive;
    private String connectionURL;
    private int inativo;
    private int id;
  
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public SqlStringConnection(int id, String descricao, String porta, String host, String base, String login, String senha, String drive, int inativo) {
        this.id = id;
        this.porta = porta;
        this.host = host;
        this.base = base;
        this.login = login;
        this.senha = senha;
        this.drive = drive;
        this.connectionURL = this.getConnectionURL();
        this.inativo = inativo;
        this.descricao = descricao;
    }

    public SqlStringConnection() {
        this.id = 0;
        this.porta = "";
        this.host = "";
        this.base = "";
        this.login = "";
        this.senha = "";
        this.drive = "";
        this.connectionURL = this.getConnectionURL();
        this.inativo = 0;
        this.descricao = "";
        this.sqlServer();
    }

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public String getConnectionURL() {
        this.connectionURL = "jdbc:sqlserver://"+this.host+ ":"+this.porta+";databaseName="+this.base;
        return this.connectionURL;
    }
    
     private void sqlServer() {
        this.setPorta("1433");
        this.setHost("localHost");
        this.setBase("DB_EVENTOS");
        this.setLogin("sa");
        this.setSenha("121212");
        this.setDrive("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        this.connectionURL = this.getConnectionURL();
    }

    public int getInativo() {
        return inativo;
    }

    public void setInativo(int inativo) {
        this.inativo = inativo;
    }

    public void setConnectionURL(String connectionURL) {
        this.connectionURL = connectionURL;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
