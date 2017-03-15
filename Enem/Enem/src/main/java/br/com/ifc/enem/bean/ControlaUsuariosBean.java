/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifc.enem.bean;

import javax.ejb.Stateless;
import br.com.ifc.enem.entidades.Usuarios;
import br.com.ifc.enem.util.JpaUtil;
import br.com.ifc.enem.bean.remote.ControlaUsuariosRemote;
import br.com.ifc.enem.entidades.UsuarioRoles;
import java.util.List;
import org.springframework.security.core.AuthenticationException;

/**
 *
 * @author fabricio
 */
@Stateless
public class ControlaUsuariosBean extends JpaUtil implements ControlaUsuariosRemote {

    @Override
    public Usuarios findByEmail(String email) throws AuthenticationException {
        return (Usuarios) em.createNamedQuery("Usuarios.findByEmail").setParameter("email", email).getSingleResult();
    }

    @Override
    public List<UsuarioRoles> findRolesUsuario(Long id) throws AuthenticationException {
        return em.createQuery("Select a from UsuarioRoles a where a.usuarioId = :id").setParameter("id", id).getResultList();
    }

}
