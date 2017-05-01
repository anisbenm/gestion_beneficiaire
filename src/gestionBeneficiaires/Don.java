package gestionBeneficiaires;

public class Don extends Action {
	double valeur;
	String moyenPaiement;
	
	public Don() {
		// TODO Auto-generated constructor stub
	}

	public Don(String date, double cout, String description, double valeur, String moyenPaiement) {
		super(date, cout, description);
		this.date=date;
		this.cout=cout;
		this.discription=description;
		this.valeur = valeur;
		this.moyenPaiement = moyenPaiement;
		System.out.println(this);
	}

	@Override
	public String toString() {
		return "Don [valeur=" + valeur + ", moyenPaiement=" + moyenPaiement + ", date=" + date + ", cout=" + cout
				+ ", discription=" + discription + "]";
	}



}
