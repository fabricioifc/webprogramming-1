package com.algaworks.pedidovenda.controller;

import java.io.Serializable;
import javax.enterprise.inject.Produces;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.algaworks.pedidovenda.model.Disciplina;
import com.algaworks.pedidovenda.model.Produto;
import com.algaworks.pedidovenda.repository.Disciplinas;
import com.algaworks.pedidovenda.repository.Usuarios;
import com.algaworks.pedidovenda.security.Seguranca;
import com.algaworks.pedidovenda.service.CadastroDisciplinaService;
import com.algaworks.pedidovenda.service.NegocioException;
import com.algaworks.pedidovenda.util.jsf.FacesUtil;
import java.util.Date;
import java.util.List;

@Named
@ViewScoped
public class CadastroDisciplinaBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<Disciplina> listaDisciplinas;

    @Inject
    private Seguranca seguranca;

    @Inject
    private Disciplinas disciplinas;

    @Inject
    private CadastroDisciplinaService cadastroPedidoService;

    @Produces
    @PedidoEdicao
    private Disciplina disciplina;

    private Disciplina disciplinaLinhaEditavel;

    public CadastroDisciplinaBean() {
        limpar();
    }

    public void inicializar() {
        if (this.disciplina == null) {
            limpar();
        }
    }

    private void limpar() {
        disciplina = new Disciplina();
    }

    public void salvar() {
        try {
            this.disciplina.setIdusuario(seguranca.getUsuarioLogado().getUsuario());
            this.disciplina.setDthrcadastro(new Date());
            this.disciplina.setIdativo(true);
            this.disciplina = this.cadastroPedidoService.salvar(this.disciplina);

            FacesUtil.addInfoMessage("Disciplina salva com sucesso!");
        } catch (NegocioException ne) {
            FacesUtil.addErrorMessage(ne.getMessage());
        } finally {
        }
    }

    public boolean isEditando() {
        return this.disciplina.getId() != null;
    }

    public List<Disciplina> getListaDisciplinas() {
        return this.disciplinas.todas(null);
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Disciplina getDisciplinaLinhaEditavel() {
        return disciplinaLinhaEditavel;
    }

    public void setDisciplinaLinhaEditavel(Disciplina disciplinaLinhaEditavel) {
        this.disciplinaLinhaEditavel = disciplinaLinhaEditavel;
    }

}
