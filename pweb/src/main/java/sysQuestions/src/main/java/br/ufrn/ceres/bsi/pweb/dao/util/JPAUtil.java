package sysQuestions.src.main.java.br.ufrn.ceres.bsi.pweb.dao.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	public static final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("pwebPU");
}
