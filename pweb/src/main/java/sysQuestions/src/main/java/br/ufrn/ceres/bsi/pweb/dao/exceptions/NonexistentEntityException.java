package sysQuestions.src.main.java.br.ufrn.ceres.bsi.pweb.dao.exceptions;

public class NonexistentEntityException extends Exception {
	private static final long serialVersionUID = 1L;
	public NonexistentEntityException(String message, Throwable cause) {
        super(message, cause);
    }
    public NonexistentEntityException(String message) {
        super(message);
    }
}