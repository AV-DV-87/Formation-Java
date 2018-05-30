package presentation;

import java.util.List;
import java.util.Vector;

public class Lanceur {

	public static void main(String[] args) {
		
		//déclarer et initialiser la collection sans type
		List vect = new Vector();
		vect.add(12);
		vect.add("toto");
		vect.add(12.5);
		vect.add(12);
		
		//Parcours de la liste for (acces à l'index)
		
		for(int i =0; i<vect.size();i++) {
			System.out.println("Données à l'indice "+ i + " = " + vect.get(i));
		}
		
		//parcours avec un for each (nouvelle version for JAVA 10)
		
		for (Object item : vect) {
			System.out.println(item);
			System.out.println(item.toString());
		}
		

	}

}
