package presentation;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class Lanceur {

public static void main(String[] args) {
		
		//déclarer et initialiser la collection sans type
		Set hash = new HashSet();
		hash.add(12);
		hash.add("toto");
		hash.add(12.5);
		hash.add(12);
		
		//parcours avec foreach
		//si doublon ajouté il remplace le premier
		
		for (Object item : hash) {
			System.out.println(item);
		}
		
		System.out.println("------PARCOURS ITERATOR-------");
		//parcours avec un iterator
		//(methode manuel)
		Iterator it = hash.iterator();
		
		//tant que tu peux parcourir
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}
}
