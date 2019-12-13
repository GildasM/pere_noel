package fr.epsi.poec.pereNoel.bll;

import java.util.ArrayList;
import java.util.List;

import fr.epsi.poec.pereNoel.bo.Enfant;
import fr.epsi.poec.pereNoel.bo.Jouet;

public class JouetManager {

	private static List<Jouet> lstJouet = new ArrayList<Jouet>();

	/**
	 * Ajoute un jouet au catalogue
	 * 
	 * @param nom
	 * @param prix
	 * @param AgeMin
	 * @param AgeMax
	 */
	public static void addJouetCatalogue(String nom, int prix, int AgeMin, int AgeMax) {

		lstJouet.add(new Jouet(nom, prix, AgeMin, AgeMax));

	}

	public static List<Jouet> getLstJouet() {
		return lstJouet;
	}

	public static void setLstJouet(List<Jouet> lstJouet) {
		JouetManager.lstJouet = lstJouet;
	}

	public static List<Jouet> trieJouetDeAgeEnfant(Integer age) {

		List<Jouet> lstJouetFctAgeEfant = new ArrayList<Jouet>();
		for (Jouet jouet : lstJouet) {
			// System.out.println("Je sui ds trieJouetDeAgeEnfant");
			if (age <= jouet.getAgeMax() && age >= jouet.getAgeMin()) {
				lstJouetFctAgeEfant.add(jouet);
			}
		}
		return lstJouetFctAgeEfant;
	}

	/**
	 * Ajoute un jouet à la liste de jouet d'un enfant
	 * 
	 * @param nomJouet nom du jouet à ajouter à l'enfant
	 * @param enfant   enfant à qui on veut ajouter un jouet
	 * @throws JouetManagerException 
	 */
	public static String addJouetEnfant(String nomJouet, Enfant enfant) throws JouetManagerException {
		String message = "";
		List<Jouet> lstJouetFctAgeEfant = new ArrayList<Jouet>();
		lstJouetFctAgeEfant = trieJouetDeAgeEnfant(enfant.getAge());

		if (enfant.getListeJouet().size() >= 3) {
			throw new JouetManagerException();
		}
		for (Jouet jouetAjoute : lstJouetFctAgeEfant) {
			if (jouetAjoute.getNom().equals(nomJouet)) {
				enfant.getListeJouet().add(jouetAjoute);
				message = "Ton jouet a été ajouter à ta liste";
				break;
			} else {
				message = "Tu n'es pas autorisé à ajouter ce jouet !!";
			}
		}

		return message;

	}

}
