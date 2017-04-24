/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifc.dao;

import br.com.ifc.entidades.Contato;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;

/**
 *
 * @author fabricio
 */
public class ContatoDaoImpl implements ContatoDao {

    @Override
    public void adicionar(HttpSession session, Contato contato) {
        List<Contato> contatos = (List<Contato>) session.getAttribute("contatos");
        if (contatos == null) {
            contatos = new ArrayList<>();
        }
        contatos.add(contato);
        session.setAttribute("contatos", contatos);
    }

    @Override
    public void excluir(HttpSession session, String email) {
        List<Contato> contatos = (List<Contato>) session.getAttribute("contatos");

        for (Contato contato : contatos) {
            if (contato.getEmail().equalsIgnoreCase(email)) {
                contatos.remove(contato);
                break;
            }
        }
        session.setAttribute("contatos", contatos);
    }

    @Override
    public void atualizar(HttpSession session, Contato contato) {
        List<Contato> contatos = (List<Contato>) session.getAttribute("contatos");

        for (Contato c : contatos) {
            if (c.getEmail().equalsIgnoreCase(contato.getEmail())) {
                contatos.remove(c);
                break;
            }
        }

        contatos.add(contato);
        session.setAttribute("contatos", contatos);
    }

    @Override
    public List<Contato> listar(HttpSession session) {
        List<Contato> contatos = (List<Contato>) session.getAttribute("contatos");

        return contatos;
    }

    @Override
    public Contato buscarPorEmail(HttpSession session, String email) {
        List<Contato> contatos = (List<Contato>) session.getAttribute("contatos");

        if (contatos != null) {
            for (Contato c : contatos) {
                if (c.getEmail().equalsIgnoreCase(email)) {
                    return c;
                }
            }
        }
        return null;
    }

}
