package com.algaworks.pedidovenda.service;

import com.algaworks.pedidovenda.model.Disciplina;
import java.io.Serializable;

import javax.inject.Inject;

import com.algaworks.pedidovenda.repository.Disciplinas;
import com.algaworks.pedidovenda.util.jpa.Transactional;

public class CadastroDisciplinaService implements Serializable {

    private static final long serialVersionUID = 1L;

    @Inject
    private Disciplinas disciplinas;

    @Transactional
    public Disciplina salvar(Disciplina disciplina) throws NegocioException {

        disciplina = this.disciplinas.salvar(disciplina);
        return disciplina;
    }

}
