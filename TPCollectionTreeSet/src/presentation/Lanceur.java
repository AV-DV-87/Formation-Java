package presentation;

import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

import domaine.Personne;

public class Lanceur {
public static void main(String[] args) {
	
	//déclarer et initialiser la collection sans type
	SortedSet<Personne> set = new TreeSet<Personne>(
			new Comparator<Personne>() {

				@Override
				public int compare(Personne p1, Personne p2) {
					
					//attention si les noms sont les même compare le prénom
					//pour inverser l'ordre on peut mettre en négatif l'attribut comparé
					//attention bis la case change l'ordre de tri donc passage en uppercase
					
					if(p1.getNom().toUpperCase().equals(p2.getNom().toUpperCase())) {
						return p1.getPrenom().toUpperCase().compareTo(p2.getPrenom().toUpperCase());
					}
					
					//tri si p1 est avant p2 alphabétoiquement 1 sinon 0
					return p1.getNom().toUpperCase().compareTo(p2.getNom().toUpperCase());
				}
				
			});
	
	//attention on doit indiquer l'algorythme de tri à SortedSet
	
	Personne p1 = new Personne(1,"tata","Eddy");
	Personne p2 = new Personne(2,"TATA","Douglas");
	Personne p3 = new Personne(3,"Vallette","Arnaud");
	Personne p4 = new Personne(4,"Ussunet","Quentin");
	
	set.add(p1);
	set.add(p2);
	set.add(p3);
	set.add(p4);
	
	for (Personne p : set) {
		System.out.println(p);
	}
		
		

	}
}
