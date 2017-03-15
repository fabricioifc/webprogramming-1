package br.com.ifc.web.seguranca;

import br.com.ifc.enem.entidades.Usuarios;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class UsuarioSistema extends User {

    private static final long serialVersionUID = 1L;

    private Usuarios usuario;

    public UsuarioSistema(Usuarios usuario, Collection<? extends GrantedAuthority> authorities) {
        super(usuario.getEmail(), usuario.getSenha(), authorities);
        this.usuario = usuario;
    }

    public Usuarios getUsuario() {
        return usuario;
    }

}
