package dao;

import java.util.Collection;

import domaine.Personne;

public interface Idao {

	//the place to implement methods
	
	public void ajouterPersonne(Personne p);
	
	public void modifierPersonne(Personne p);
	
	public void supprimerPersonne(int id);
	
	public Collection<Personne> findAll();
	
}
