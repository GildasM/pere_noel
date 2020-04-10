package fr.epsi.poec.pereNoel.ihm;

import fr.epsi.poec.pereNoel.bll.JouetManager;
import fr.epsi.poec.pereNoel.bll.JouetManagerException;
import fr.epsi.poec.pereNoel.bo.Enfant;
import fr.epsi.poec.pereNoel.bo.Jouet;

public class DemoPereNoel {

	public static void main(String[] args) {

		// Ajouter des jouets
		//Ajoute commentaire dans éclispe
		//modif dans git pour merge

		JouetManager.addJouetCatalogue("Poupée", 15, 2, 10);
		JouetManager.addJouetCatalogue("Camion", 15, 3, 6);
		JouetManager.addJouetCatalogue("Vélo", 50, 7, 9);
		JouetManager.addJouetCatalogue("Jeu Mario", 15, 5, 77);
		JouetManager.addJouetCatalogue("Memori", 5, 4, 77);
		JouetManager.addJouetCatalogue("Strick", 4, 2, 15);
		
//		System.out.println(JouetManager.getLstJouet());
		Enfant jean = new Enfant("Jean", 5);

		// Filtrer sur les jouets de son age
//		System.out.println(JouetManager.trieJouetDeAgeEnfant(jean.getAge()).toString());*
//		System.out.println(jean.getListeJouet().size());
		addToEnfant("Camion", jean);
		addToEnfant("Camion", jean);
		addToEnfant("Poupée", jean);
		addToEnfant("Vélo", jean);
		addToEnfant("Jeu Mario", jean);
		addToEnfant("Memori", jean);
		addToEnfant("Camion", jean);

		
		System.out.println(jean.getListeJouet().size());

		// JouetManager.
		// JouetManager.addJouetListEnfant(JouetManager.)

	}

	private static void addToEnfant(String  nomJouet, Enfant enfant) {
		try {
			System.out.println(JouetManager.addJouetEnfant( nomJouet, enfant));;
		} catch (JouetManagerException e) {
			System.out.println("Tu as déjà 3 jouets");
		}
	}


}
