package fr.epsi.poec.pereNoel.ihm;

import fr.epsi.poec.pereNoel.bll.JouetManager;
import fr.epsi.poec.pereNoel.bll.JouetManagerException;
import fr.epsi.poec.pereNoel.bo.Enfant;

public class DemoPereNoel {

	public static void main(String[] args) {

		// Ajouter des jouets

		JouetManager.addJouetCatalogue("Poupée", 15, 2, 10);
		JouetManager.addJouetCatalogue("Camion", 15, 3, 6);
		JouetManager.addJouetCatalogue("Vélo", 50, 7, 9);
		JouetManager.addJouetCatalogue("Jeu Mario", 15, 5, 77);
		JouetManager.addJouetCatalogue("Memori", 5, 4, 77);

//		System.out.println(JouetManager.getLstJouet());
		Enfant jean = new Enfant("Jean", 5);

		// Filtrer sur les jouets de son age
//		System.out.println(JouetManager.trieJouetDeAgeEnfant(jean.getAge()).toString());*
//		System.out.println(jean.getListeJouet().size());
		try {
			System.out.println(JouetManager.addJouetEnfant("Camion", jean));;
		} catch (JouetManagerException e) {
			System.out.println("Tu as déjà 3 jouets");
		}
		try {
			System.out.println(JouetManager.addJouetEnfant("Camion", jean));
		} catch (JouetManagerException e) {
			System.out.println("Tu as déjà 3 jouets");
		}
		try {
			System.out.println(JouetManager.addJouetEnfant("Poupée", jean));
		} catch (JouetManagerException e) {
			System.out.println("Tu as déjà 3 jouets");
		}
		
		try {
			System.out.println(JouetManager.addJouetEnfant("Vélo", jean));
		} catch (JouetManagerException e) {
			System.out.println("Tu as déjà 3 jouets");
		}
		
		try {
			System.out.println(JouetManager.addJouetEnfant("Jeu Mario", jean));
		} catch (JouetManagerException e) {
			System.out.println("Tu as déjà 3 jouets");
		}
		
		try {
			System.out.println(JouetManager.addJouetEnfant("Memori", jean));
		} catch (Exception e) {
			System.out.println("Tu as déjà 3 jouets");
		}
		
		try {
			System.out.println(JouetManager.addJouetEnfant("Camion", jean));
		} catch (Exception e) {
			System.out.println("Tu as déjà 3 jouets");
		}
		
		
		System.out.println(jean.getListeJouet().size());

		// JouetManager.
		// JouetManager.addJouetListEnfant(JouetManager.)

	}


}
