/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ifc.enem.bean;

import br.com.ifc.enem.entidades.Usuarios;
import br.com.ifc.enem.util.JpaUtil;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import br.com.ifc.enem.bean.remote.ControlaHomeRemote;

/**
 *
 * @author martin
 */
@Stateless
public class ControlaHomeBean extends JpaUtil implements ControlaHomeRemote {

    @Override
    public String olaMundo() throws Exception {
        return "Olá Mundo!";
    }

    @Override
    public List<Usuarios> getUsuarios() throws Exception {
        return (List<Usuarios>) em.createNamedQuery("Usuarios.findAll").getResultList();
    }
}
