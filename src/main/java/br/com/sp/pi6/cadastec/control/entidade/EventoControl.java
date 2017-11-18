/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sp.pi6.cadastec.control.entidade;

import br.com.sp.pi6.cadastec.model.dao.EventoDao;
import br.com.sp.pi6.cadastec.model.dao.PessoaDao;
import br.com.sp.pi6.cadastec.model.entidade.Evento;
import br.com.sp.pi6.cadastec.model.entidade.Pessoa;

/**
 *
 * @author GIOVANNI
 */
public class EventoControl {
    private EventoDao eventoDao;
    
    public EventoControl() {
        eventoDao = new EventoDao();
    }
    
    public boolean cadastrar(Evento evento){
        return eventoDao.insert(evento);
    }
   
}
