package gestionBeneficiaires;

class Contact {
	short numeroVoie;
	String voie;
	String nomVoie;
	short codePoslale;
	String nomVille;
	String nomPays;
	String email;
	String telephone;
	
	public Contact(short numeroVoie, String voie, String nomVoie, short codePoslale, String nomVille,  String nomPays,
			String email, String telephone) {
		super();
		this.numeroVoie = numeroVoie;
		this.voie = voie;
		this.nomVoie = nomVoie;
		this.nomVille = nomVille;
		this.codePoslale = codePoslale;
		this.nomPays = nomPays;
		this.email = email;
		this.telephone = telephone;
	}

	public short getNumeroVoie() {
		return numeroVoie;
	}

	public void setNumeroVoie(short numeroVoie) {
		this.numeroVoie = numeroVoie;
	}

	public String getVoie() {
		return voie;
	}

	public void setVoie(String voie) {
		this.voie = voie;
	}

	public String getNomVoie() {
		return nomVoie;
	}

	public void setNomVoie(String nomVoie) {
		this.nomVoie = nomVoie;
	}

	public String getNomVille() {
		return nomVille;
	}

	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}

	public short getCodePoslale() {
		return codePoslale;
	}

	public void setCodePoslale(short codePoslale) {
		this.codePoslale = codePoslale;
	}

	public String getNomPays() {
		return nomPays;
	}

	public void setNomPays(String nomPays) {
		this.nomPays = nomPays;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	



	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Contact [numeroVoie=" + numeroVoie + ", voie=" + voie + ", nomVoie=" + nomVoie+ ", codePoslale=" + codePoslale + ", nomVille="
				+ nomVille  + ", nomPays=" + nomPays + ", email=" + email
				+ ", telephone=" + telephone + "]";
	}
	
	
}
