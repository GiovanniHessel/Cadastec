/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.model.db.entidade;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author GIOVANNI
 */
public class LerConnectionString {

    public SqlStringConnection ler(String caminho) {
        String linha = "";
        try {
            FileReader arq = new FileReader(caminho);
            BufferedReader lerArq = new BufferedReader(arq);

            linha = lerArq.readLine() + "/n";
            while (linha != null) {
                linha += lerArq.readLine()+ "/n";
            }
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
            e.getMessage());
        }
        SqlStringConnection sqlStringConnection = new SqlStringConnection();
        sqlStringConnection.getHost();
        sqlStringConnection.getBase();
        sqlStringConnection.getDrive();
        sqlStringConnection.getLogin();
        sqlStringConnection.getSenha();
        sqlStringConnection.getPorta();
        sqlStringConnection.getConnectionURL();
       
        return sqlStringConnection;
    }
}
