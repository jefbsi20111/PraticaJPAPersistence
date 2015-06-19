package sysQuestions.src.main.java.br.ufrn.ceres.bsi.pweb.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import sysQuestions.src.main.java.br.ufrn.ceres.bsi.pweb.dao.UserService;
import sysQuestions.src.main.java.br.ufrn.ceres.bsi.pweb.dao.exceptions.NonexistentEntityException;
import sysQuestions.src.main.java.br.ufrn.ceres.bsi.pweb.dao.util.JPAUtil;
import sysQuestions.src.main.java.br.ufrn.ceres.bsi.pweb.model.Usuario;

@ManagedBean(name="usuarioBean")
@RequestScoped
public class UsuarioBean implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserService dao = new UserService(JPAUtil.EMF);
	private Usuario usuario = new Usuario();

	public UsuarioBean(){
	}
	
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public UserService getDao() {
		return dao;
	}
	
	public void inserirUsuario() throws Exception{
		dao.create(usuario);
	}
	
	public void removerUsuario(Usuario u) throws NonexistentEntityException{
		dao.delete(u.getId());
	}
	
	public List<Usuario> getUsuarios(){
		return dao.findEntities();
	}
}
