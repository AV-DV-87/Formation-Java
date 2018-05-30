package presentation;

import java.util.InputMismatchException;
import java.util.Scanner;

import domaine.Compte;
import domaine.MontantNegatifException;
import domaine.SoldeInsuffisantException;

/**
 * Classe principale
 * @author Arnaud
 *
 */
public class Lanceur {
	/**
	 * Méthode main()
	 * @param args argument méthode main
	 */

	public static void main(String[] args) {
		
		Compte cpte = new Compte(1, 1000.00);
		
		System.out.println("----------VERSER----------");
		
		Scanner clavier = new Scanner(System.in);
		System.out.println("Montant à verser : ");
		
		try {
			double mt = clavier.nextDouble();
			cpte.verser(mt);
		} catch (MontantNegatifException e) {
			//Cas d'une exception surveillee
			//récupère le message de l'exception et affiche le
			System.out.println(e.getMessage());
		}catch(InputMismatchException e){
			System.out.println("SAISIE INCORRECTE");
		}
		System.out.println("ETAT COMPTE APRES VERSEMENT : " + cpte);
		
		//peut être regroupé dans le même try/catch
		System.out.println("----------RETIRER----------");
		
		
		System.out.println("Montant à retirer : ");
		
		try {
			double mt = clavier.nextDouble();
			cpte.retirer(mt);
		} catch (SoldeInsuffisantException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}catch(InputMismatchException e){
			System.out.println("SAISIE INCORRECTE");
		} catch (MontantNegatifException e) {
			System.out.println(e.getMessage());
		}finally {
			clavier.close();
		}
		System.out.println("ETAT COMPTE APRES RETRAIT : " + cpte);
	}

}
