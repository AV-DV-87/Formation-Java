package service;

import java.util.Collection;

import dao.DaoImpl;
import dao.Idao;
import domaine.Personne;

public class ServiceImpl implements Iadmin, Iutilisateur {
	
	//attribut de passage d'une couche � une autre
	//on l'instancie en utilisant le constructeur de la class qui impl�ment l'interface
	
	private Idao dao = new DaoImpl();
	
	@Override
	public Collection<Personne> findAll() {
		// demande � la dao le bon traitement
		return dao.findAll();
	}

	@Override
	public void ajouterPersonne(Personne p) {
		
		dao.ajouterPersonne(p);
	}

	@Override
	public void modifierPersonne(Personne p) {
		
		dao.modifierPersonne(p);
		
	}

	@Override
	public void supprimerPersonne(int id) {

		dao.supprimerPersonne(id);
		
	}
		
		
}
