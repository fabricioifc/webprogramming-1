/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.algaworks.pedidovenda.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author fabricio
 */
@Entity
@Table(name = "disciplina")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Disciplina.findAll", query = "SELECT d FROM Disciplina d")
    , @NamedQuery(name = "Disciplina.findById", query = "SELECT d FROM Disciplina d WHERE d.id = :id")
    , @NamedQuery(name = "Disciplina.findByTitulo", query = "SELECT d FROM Disciplina d WHERE d.titulo = :titulo")
    , @NamedQuery(name = "Disciplina.findByDthrcadastro", query = "SELECT d FROM Disciplina d WHERE d.dthrcadastro = :dthrcadastro")
    , @NamedQuery(name = "Disciplina.findByIdativo", query = "SELECT d FROM Disciplina d WHERE d.idativo = :idativo")})
public class Disciplina implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "titulo")
    private String titulo;
    @Lob
    @Size(max = 65535)
    @Column(name = "descricao")
    private String descricao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dthrcadastro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dthrcadastro;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idativo")
    private boolean idativo;
    @JoinColumn(name = "idusuario", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Usuario idusuario;

    public Disciplina() {
    }

    public Disciplina(Long id) {
        this.id = id;
    }

    public Disciplina(Long id, String titulo, Date dthrcadastro, boolean idativo) {
        this.id = id;
        this.titulo = titulo;
        this.dthrcadastro = dthrcadastro;
        this.idativo = idativo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDthrcadastro() {
        return dthrcadastro;
    }

    public void setDthrcadastro(Date dthrcadastro) {
        this.dthrcadastro = dthrcadastro;
    }

    public boolean getIdativo() {
        return idativo;
    }

    public void setIdativo(boolean idativo) {
        this.idativo = idativo;
    }

    public Usuario getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Usuario idusuario) {
        this.idusuario = idusuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Disciplina)) {
            return false;
        }
        Disciplina other = (Disciplina) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.algaworks.pedidovenda.model.Disciplina[ id=" + id + " ]";
    }
    
}
