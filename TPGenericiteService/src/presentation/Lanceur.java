package presentation;

import domaine.Login;
import domaine.Personne;
import service.LoginImpl;
import service.PersonneImpl;

public class Lanceur {

	public static void main(String[] args) {

		Personne p = new Personne(1, "Michel", "Michel", 25);
		PersonneImpl pi = new PersonneImpl();
		
		pi.ajouter(p);
		
		pi.affiche(pi.findAll());
		
		Login g = new Login(1, "tata", "Toto");
		
		LoginImpl li = new LoginImpl();
		li.ajouter(g);
		li.affiche(li.findAll());
	}

}
