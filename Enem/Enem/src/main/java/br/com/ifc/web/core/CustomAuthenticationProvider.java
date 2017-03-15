/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifc.web.core;

import java.util.Collection;
import java.util.logging.Logger;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import br.com.ifc.enem.bean.remote.ControlaUsuariosRemote;
import br.com.ifc.enem.entidades.Usuarios;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.springframework.security.authentication.BadCredentialsException;

/**
 *
 * @author fabricio
 */
@SessionScoped
@ManagedBean
public class CustomAuthenticationProvider implements AuthenticationProvider {

    @EJB
    private ControlaUsuariosRemote controlaUsuariosBeanRemote;

    private static final Logger LOG = Logger.getLogger(CustomAuthenticationProvider.class.getName());

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = (String) authentication.getCredentials();

        Usuarios user = controlaUsuariosBeanRemote.findByEmail(username);

        if (user == null || !user.getEmail().equalsIgnoreCase(username) || !password.equals(user.getSenha())) {
            throw new BadCredentialsException("Dados inválidos.");
        }
        
        user.setUsuarioRolesCollection(controlaUsuariosBeanRemote.findRolesUsuario(user.getId()));

        Collection<? extends GrantedAuthority> authorities = user.getAuthorities();

        return new UsernamePasswordAuthenticationToken(user, password, authorities);
    }

    @Override
    public boolean supports(Class<? extends Object> authentication) {
        return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
    }

}
