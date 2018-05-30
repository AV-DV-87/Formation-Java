package presentation;

import domaine.Personne;
import service.Iadmin;
import service.Iutilisateur;
import service.ServiceImpl;

public class Lanceur {
	public static void main(String[] args) {
		
		Iadmin admin = new ServiceImpl();
		
		Iutilisateur util1 = new ServiceImpl();
		
		Personne p = new Personne(22, "Arnaud", "Vallette", 30);
		
		admin.ajouterPersonne(p);
		
		admin.findAll();
		
		util1.findAll();
		
	}
}
