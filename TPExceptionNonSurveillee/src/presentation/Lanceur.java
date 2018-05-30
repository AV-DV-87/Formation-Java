package presentation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lanceur {
	
	//Cas d'une calculatrice
	public static int calcul(int a, int b) {
		return a/b;
	}

	public static void main(String[] args) {
		// Initialiser un scanner
		Scanner clavier = new Scanner(System.in);
		
		int resultat = 0;
		
		//BLOCK TRY CATCH
		//on peut surveiller plusieurs conditions dans un seul try
		try {
			System.out.println("Saisir A : ");
			int a = clavier.nextInt();
			
			System.out.println("Saisir B : ");
			int b = clavier.nextInt();
			
			resultat = calcul(a, b);
			
		} catch (ArithmeticException ae) {
			
			//ae.printStackTrace(); est remplacé par :
			System.out.println("ERREUR : attention division par 0, veuillez saisir un entier.");
			
		}catch(InputMismatchException ime) {
			
			System.out.println("ERREUR : on ne peut pas faire d'opération sur des chaîne de caractère merci de saisir des entiers.");
		}finally {
			//cas de cloture qui s'execute exception ou non
			clavier.close();
		}
		
		System.out.println("Resultat : "+resultat);
		
		
		
		
	}

}
