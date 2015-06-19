package sysQuestions.src.main.java.br.ufrn.ceres.bsi.pweb.dao.exceptions;

public class PreexistingEntityException extends Exception {
	private static final long serialVersionUID = 1L;
	public PreexistingEntityException(String message, Throwable cause) {
        super(message, cause);
    }
    public PreexistingEntityException(String message) {
        super(message);
    }
}