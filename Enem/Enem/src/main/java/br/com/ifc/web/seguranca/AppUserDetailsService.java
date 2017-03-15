/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifc.web.seguranca;

import br.com.ifc.enem.bean.remote.ControlaUsuariosRemote;
import br.com.ifc.enem.entidades.UsuarioRoles;
import br.com.ifc.enem.entidades.Usuarios;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.ejb.EJB;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 *
 * @author fabricio
 */
//@SessionScoped
//@ManagedBean
public class AppUserDetailsService implements UserDetailsService {

    @EJB
    private ControlaUsuariosRemote controlaUsuariosBeanRemote;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuarios usuario = controlaUsuariosBeanRemote.findByEmail(email);

        if (usuario == null) {
            throw new UsernameNotFoundException("Usuário ou senha inválido!");
        } else {
            return new UsuarioSistema(usuario, getPapeis(usuario));
        }

    }

    private Collection<? extends GrantedAuthority> getPapeis(Usuarios usuario) {
        List<SimpleGrantedAuthority> authorities = new ArrayList<>();

        for (UsuarioRoles role : controlaUsuariosBeanRemote.findRolesUsuario(usuario.getId())) {
            authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getRole().getDescricao().toUpperCase()));
        }

        return authorities;
    }

//    @Override
//    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//        String username = authentication.getName();
//        String password = (String) authentication.getCredentials();
//
//        Usuarios user = controlaUsuariosBeanRemote.findByEmail(username);
//
//        if (user == null || !user.getEmail().equalsIgnoreCase(username) || !password.equals(user.getSenha())) {
//            throw new BadCredentialsException("Dados inválidos.");
//        }
//        
//        user.setUsuarioRolesCollection(controlaUsuariosBeanRemote.findRolesUsuario(user.getId()));
//
//        Collection<? extends GrantedAuthority> authorities = user.getAuthorities();
//
//        return new UsernamePasswordAuthenticationToken(user, password, authorities);
//    }
//
//    @Override
//    public boolean supports(Class<? extends Object> authentication) {
//        return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
//    }
}
