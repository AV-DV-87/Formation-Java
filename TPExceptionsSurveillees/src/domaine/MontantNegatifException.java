package domaine;

/**
 * Classe qui permet de g�rer les exceptions de saisie de montant n�gatif
 * @author Adminl
 *
 */
public class MontantNegatifException extends Exception {
	
	//insetion d'un constructeur de la super classe exception
	public MontantNegatifException(String message) {
		super(message);
	}
	
	
}
