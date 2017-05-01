package gestionBeneficiaires;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Acteur {
	private List<Action> actionListe = new ArrayList<Action>();
	private Contact contact;
	private String[] specialite;
	private String[] specialites;

	/**
	 * Methode d'ajout d'action	 
	 * @param action
	 */
	public void addAction(Action action) {
		actionListe.add(action);
	}

	public void ajoutContact(short numeroVoie, String voie, String nomVoie, short codePoslale, String nomVille,
			String nomPays, String email, String telephone) {
		this.contact = new Contact(numeroVoie, voie, nomVoie, codePoslale, nomVille, nomPays, email, telephone);
		System.out.println(contact);
	}

	public Contact getContact() {
		return contact;
	}

	public String[] getSpecialites() {
		return specialites;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public void setSpecialites(String[] specialites) {
		this.specialites = specialites;
	}

	@Override
	public String toString() {
		return "Acteur [actionListe=" + actionListe + ", contact=" + contact + ", specialite="
				+ Arrays.toString(specialite) + ", specialites=" + Arrays.toString(specialites) + "]";
	}

}


