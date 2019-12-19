package fr.epsi.poec.pereNoel.bo;

import java.util.ArrayList;
import java.util.List;

public class Enfant {
	private String prenom;
	private Integer age;
	private  List<Jouet> listeJouet;
	
	public Enfant() {
		// TODO Auto-generated constructor stub
	}

	public Enfant(String prenom, Integer age) {
		super();
		this.prenom = prenom;
		this.age = age;
		this.listeJouet = new ArrayList<Jouet>();
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Enfant [Prenom=" + prenom + ", age=" + age + "]";
	}

	public List<Jouet> getListeJouet() {
		return listeJouet;
	}

	public void setListeJouet(List<Jouet> listeJouet) {
		this.listeJouet = listeJouet;
	}

 public void  name() {
	 System.out.println("Essaisgit");
}
	
	
	

}
