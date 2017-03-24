package com.algaworks.pedidovenda.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.algaworks.pedidovenda.model.Disciplina;
import com.algaworks.pedidovenda.model.Pedido;

public class Disciplinas implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private EntityManager manager;

    public Disciplina porId(Long id) {
        return manager.find(Disciplina.class, id);
    }

    public Disciplina salvar(Disciplina disciplina) {
        return this.manager.merge(disciplina);
    }

    public List<Disciplina> todas(Boolean idativo) {
        if (idativo == null) {
            return manager.createQuery("from Disciplina",
                    Disciplina.class).getResultList();
        } else {
            return manager.createQuery("from Disciplina where idativo = :idativo",
                    Disciplina.class).setParameter("idativo", idativo).getResultList();
        }
    }

}
