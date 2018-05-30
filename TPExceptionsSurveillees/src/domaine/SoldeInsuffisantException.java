package domaine;

/**
 * Classe de génération d'exception dans le cas d'un solde insuffisant lors de
 * la manipulation de Compte
 * 
 * @author Arnaud
 *
 */

public class SoldeInsuffisantException extends Exception {
	/**
	 * Constructeur
	 * 
	 * @param message message à afficher
	 */
	public SoldeInsuffisantException(String message) {
		super(message);
	}
}
