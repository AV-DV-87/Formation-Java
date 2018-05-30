package presentation;

import domaine.Paire;

public class Lanceur {

	public static void main(String[] args) {

		Paire<String> p = new Paire("ZEC", "UNION");
		String x = p.getPremier();
		String y = p.getSecond();
		
		Paire<Integer> p2 = new Paire<Integer>(12,15);
		int a = p2.getPremier();
		int b = p2.getSecond();
		
	}

}
