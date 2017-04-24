/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifc.dao;

import br.com.ifc.entidades.Contato;
import java.util.List;
import javax.servlet.http.HttpSession;

/**
 *
 * @author fabricio
 */
public interface ContatoDao {
    
    public void adicionar(HttpSession session, Contato contato);
    public void excluir(HttpSession session, String email);
    public void atualizar(HttpSession session, Contato contato);
    public List<Contato> listar(HttpSession session);
    public Contato buscarPorEmail(HttpSession session, String email);
}
