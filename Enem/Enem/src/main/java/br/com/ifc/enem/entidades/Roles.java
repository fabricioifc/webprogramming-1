/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifc.enem.entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author fabricio
 */
@Entity
@Table(name = "roles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Roles.findAll", query = "SELECT r FROM Roles r")
    , @NamedQuery(name = "Roles.findByDescricao", query = "SELECT r FROM Roles r WHERE r.descricao = :descricao")})
public class Roles implements Serializable, GrantedAuthority {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "descricao")
    private String descricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "role")
    private Collection<UsuarioRoles> usuarioRolesCollection;

    public Roles() {
    }

    public Roles(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Collection<UsuarioRoles> getUsuarioRolesCollection() {
        return usuarioRolesCollection;
    }

    public void setUsuarioRolesCollection(Collection<UsuarioRoles> usuarioRolesCollection) {
        this.usuarioRolesCollection = usuarioRolesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (descricao != null ? descricao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Roles)) {
            return false;
        }
        Roles other = (Roles) object;
        if ((this.descricao == null && other.descricao != null) || (this.descricao != null && !this.descricao.equals(other.descricao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.ifc.enem.entidades.Roles[ descricao=" + descricao + " ]";
    }

    @Override
    public String getAuthority() {
        return this.descricao;
    }
    
}
