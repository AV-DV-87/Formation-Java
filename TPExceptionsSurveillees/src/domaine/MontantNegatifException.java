package domaine;

/**
 * Classe qui permet de gérer les exceptions de saisie de montant négatif
 * @author Adminl
 *
 */
public class MontantNegatifException extends Exception {
	
	//insetion d'un constructeur de la super classe exception
	public MontantNegatifException(String message) {
		super(message);
	}
	
	
}
