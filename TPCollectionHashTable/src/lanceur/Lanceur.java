package lanceur;

import java.util.Hashtable;
import java.util.Map;

public class Lanceur {

	public static void main(String[] args) {
		
		// Attention on peut préciser le type de la clé et de la valeur
		//souvent la clé est une id et la valeur un objet
		
		Map<Object, Object> ht = new Hashtable();
		
		//ajout de données
		
		ht.put(1, "printemps");
		ht.put(3, "automne");
		ht.put(2, "été");
		ht.put(4, "hiver");
		
		//parcourir avec un for each
		
		for(Map.Entry<Object, Object> entry : ht.entrySet()) {
			System.out.println(entry);
			System.out.println("----Clé----");
			System.out.println(entry.getKey());
			System.out.println("----Valeur----");
			System.out.println(entry.getValue());
		}
		
		
	}

}
