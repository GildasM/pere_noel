package fr.epsi.poec.pereNoel.bo;

/**
 * Classe Décrivant un jouet en fonction du prix, age
 * 
 * @author johan
 *
 */

public class Jouet {

	
	private String nom;
	private int prix;
	private int ageMin;
	private int ageMax;


	public Jouet() {
		//modif dans git pour conflit
		// TODO Auto-generated constructor stub
	}
	
	public Jouet(String nom, int prix, int ageMin, int ageMax) {
		this.nom= nom;
		this.prix = prix;
		this.ageMin = ageMin;
		this.ageMax = ageMax;
		
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getAgeMax() {
		return ageMax;
	}

	public void setAgeMax(int ageMax) {
		this.ageMax = ageMax;
	}

	public int getAgeMin() {
		return ageMin;
	}

	public void setAgeMin(int ageMin) {
		this.ageMin = ageMin;
	}

	@Override
	public String toString() {
		return "Jouet [nom=" + nom + ", prix=" + prix + ", ageMin=" + ageMin + ", ageMax=" + ageMax + "]";
	}


	
	

}
