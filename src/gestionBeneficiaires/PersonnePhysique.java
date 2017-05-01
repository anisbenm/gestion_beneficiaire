package gestionBeneficiaires;

import java.util.Arrays;
import java.util.Date;

public class PersonnePhysique extends Acteur {
	//public static final int MAX_AGE =50;
	private String identifiant;
	private String prenom;
	private String nom;
	private Date dateNaissance;
	
	public String getIdentifiant() {
		return identifiant;
	}
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	public PersonnePhysique() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonnePhysique(String identifiant, String prenom, String nom, Date dateNaissance) {
		super();
		this.identifiant = identifiant;
		this.prenom = prenom;
		this.nom = nom;
		this.dateNaissance = dateNaissance;
	}
	@Override
	public String toString() {
		return "PersonnePhysique [identifiant=" + identifiant + ", prenom=" + prenom + ", nom=" + nom
				+ ", dateNaissance=" + dateNaissance + ", getContact()=" + getContact() + ", getSpecialites()="
				+ Arrays.toString(getSpecialites()) + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}



	
}
