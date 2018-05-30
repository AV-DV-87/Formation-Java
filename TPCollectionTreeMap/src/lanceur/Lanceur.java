package lanceur;

import java.util.Collections;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import domaine.Personne;

public class Lanceur {

public static void main(String[] args) {
	
	
	
	//personnes test	
	Personne p1 = new Personne(1,"tata","Eddy");
	Personne p2 = new Personne(2,"TATA","Douglas");
	Personne p3 = new Personne(3,"Vallette","Arnaud");
	Personne p4 = new Personne(4,"Ussunet","Quentin");
	

		
	// Attention on peut pr�ciser le type de la cl� et de la valeur
	//souvent la cl� est une id et la valeur un objet
	
	//le sortedMap a d�j� un comparateur par d�faut et va trier par cl� ascendante
	//ou ordre alphab�tique
	
	//si comparateur personnalis� on doit comparer sur le type de key
	//le comparateur peut �tre dans une classe � part qui impl�ment un comparator du bon type
	//= BONNE PRATIQUE 
	
	SortedMap<Integer, Personne> smap = Collections.synchronizedSortedMap(new TreeMap<Integer, Personne>());
	
	//ajout de donn�es
	
	smap.put(1, p1);
	smap.put(3, p3);
	smap.put(2, p2);
	smap.put(4, p4);
	
	
	
	//parcourir avec un for each
		
	for(Map.Entry<Integer, Personne> entry : smap.entrySet()) {
		
		System.out.println("----Cl�----");
		System.out.println(entry.getKey());
		System.out.println("----Valeur----");
		System.out.println(entry.getValue());
	}
	
	//test methode
	
		
	}
}
