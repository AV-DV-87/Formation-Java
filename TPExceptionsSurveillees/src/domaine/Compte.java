package domaine;

/**
 * Classe de gestion des comptes
 * 
 * @author Adminl
 * @version 1.0
 */
public class Compte {
	/**
	 * L'idenditifiant du compte.
	 */
	private double idCompte;

	/**
	 * Le solde du compte.
	 */
	private double solde;

	public double getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(double idCompte) {
		this.idCompte = idCompte;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Compte(double idCompte, double solde) {
		super();
		this.idCompte = idCompte;
		this.solde = solde;
	}

	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Méthode de versement sur le compte Peut lancer une exception de montant
	 * negatif
	 * 
	 * @param mt
	 *            le montant à verser
	 */
	public void verser(double mt) throws MontantNegatifException {
		// si le montant est négatif renvoi une exception de type MontantNegatif
		if (mt < 0)
			throw new MontantNegatifException("MONTANT VERSE NEGATIF");
		solde += mt;
	}

	/**
	 * Méthode de retrait sur le compte
	 * 
	 * @param mt le montant à retirer de type double
	 *  
	 */
	public void retirer(double mt) throws SoldeInsuffisantException, MontantNegatifException {
		// Exception conditions
		if (mt > solde)
			throw new SoldeInsuffisantException("Solde Insuffisant");
		if (mt < 0)
			throw new MontantNegatifException("Montant de retrait doit être positif.");
		// Method implement
		solde -= mt;
	}

	@Override
	public String toString() {
		return "Compte [idCompte=" + idCompte + ", solde=" + solde + "]";
	}

}
