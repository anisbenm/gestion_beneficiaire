package gestionBeneficiaires;

public abstract class Action {
	
	String date;
	double cout;
	String discription;
	public Action() {
		super();
		
	}
	public Action(String date, double cout, String discription) {
		super();
		this.date = date;
		this.cout = cout;
		this.discription = discription;
	}

	
}
