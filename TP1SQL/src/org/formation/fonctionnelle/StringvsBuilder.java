package org.formation.fonctionnelle;

public class StringvsBuilder {
	
	public static void main(String[] args) {

	String lievre = "";
	String tortue = "";
	
	double tortueLapsStart = System.currentTimeMillis();
	for(int i=0; i<10000; i++) {
		tortue += "_"+i;
	}
	double tortueLaps = System.currentTimeMillis() + tortueLapsStart;
	
	System.out.println("le tortue a mis "+ tortueLaps +".");
	
	double lievreLapsStart = System.currentTimeMillis();
	
	StringBuilder sb = new StringBuilder();
	
	for(int j=0; j<10000; j++) {
		sb.append("_"+j);
		
	}
	lievre =sb.toString();
	
	
	double lievreLaps = System.currentTimeMillis() - lievreLapsStart;
	
	System.out.println("le lievre a mis "+ lievreLaps +".");
	
	System.out.println(lievre.equals(tortue));
	
	}
}
