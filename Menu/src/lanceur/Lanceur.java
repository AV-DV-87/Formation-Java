package lanceur;

import java.util.Scanner;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Afficher le Menu
		System.out.println("---------MENU PRINCIPAL---------");
		System.out.println("--Taper 1 pour gérer les comptes");
		System.out.println("--Taper 2 pour gérer les personnes");
		System.out.println("--Taper 0 pour sortir");
		
		
		Scanner sc = new Scanner(System.in);
		
		int choix = sc.nextInt();
		
		while(choix!=0) {
			
			//CHOIX MENU PRINCIPAL 1
			if(choix==1) {
				//MENU COMPTES
				System.out.println("---------GESTION DES COMPTES---------");
				System.out.println("--Taper 1 pour ajouter un compte");
				System.out.println("--Taper 2 pour modifier un compte");
				System.out.println("--Taper 3 pour lister les comptes");
				System.out.println("--Taper 4 pour supprimer un compte");
				System.out.println("3. Taper 0 pour sortir");
				int choix2 = sc.nextInt();
				
				if(choix2!=0) {
					if(choix2 == 1) {
						System.out.println("---ajouter un compte :");
					}else if(choix2 == 2){
						System.out.println("---modifier un compte :");
					}else if(choix2 == 3){
						System.out.println("---lister les comptes :");
					}else if(choix2 == 4){
						System.out.println("---supprimer un compte :");
					}else {
						System.out.println("--------!MAUVAIS CHOIX MERCI DE RESAISSIR!--------");
					}
				}
				
			}
			else if(choix==2) {
				System.out.println("---------GESTION DES PERSONNES---------");
			}
			else {
				System.out.println("--------!MAUVAIS CHOIX MERCI DE RESAISSIR!--------");
			}
			//Afficher le Menu
			System.out.println("---------MENU PRINCIPAL---------");
			System.out.println("1. Taper 1 pour gérer les comptes");
			System.out.println("2. Taper 2 pour gérer les personnes");
			System.out.println("3. Taper 0 pour sortir");
			choix = sc.nextInt();
		}
		System.out.println("Au revoir, merci d'avoir utiliser notre service.");
		
	}

}
