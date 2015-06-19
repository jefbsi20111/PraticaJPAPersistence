package sysQuestions.src.main.java.br.ufrn.ceres.bsi.pweb.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManagerFactory;

import sysQuestions.src.main.java.br.ufrn.ceres.bsi.pweb.model.Usuario;

@Stateless
public class UserService extends DataAccessService<Usuario> {

    public UserService(EntityManagerFactory emf) {
        super(Usuario.class, emf);
    }

    /**
     * Retorna um novo usuario
     * @return {@link Usuario}
     */
    public Usuario novoUsuario(){
        return new Usuario();
    }

}