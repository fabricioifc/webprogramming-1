package br.com.ifc.enem.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Usuarios.class)
public abstract class Usuarios_ {

	public static volatile SingularAttribute<Usuarios, String> senha;
	public static volatile CollectionAttribute<Usuarios, UsuarioRoles> usuarioRolesCollection;
	public static volatile SingularAttribute<Usuarios, Boolean> credentialsNonExpired;
	public static volatile SingularAttribute<Usuarios, String> nome;
	public static volatile SingularAttribute<Usuarios, Boolean> accountNonExpired;
	public static volatile SingularAttribute<Usuarios, Long> id;
	public static volatile SingularAttribute<Usuarios, String> email;
	public static volatile SingularAttribute<Usuarios, Boolean> enabled;
	public static volatile SingularAttribute<Usuarios, Boolean> accountNonLocked;

}

