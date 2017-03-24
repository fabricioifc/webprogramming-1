/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifc.enem.bean.remote;

import br.com.ifc.enem.entidades.UsuarioRoles;
import br.com.ifc.enem.entidades.Usuarios;
import java.util.List;
import javax.ejb.Remote;
import org.springframework.security.core.AuthenticationException;

/**
 *
 * @author fabricio
 */
@Remote
public interface ControlaUsuariosRemote {

    Usuarios findByEmail(String email) throws AuthenticationException;
    List<UsuarioRoles> findRolesUsuario(Long id) throws AuthenticationException;
}
