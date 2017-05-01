package org.sfuture.beneficiaire;

import gestionBeneficiaires.Action;
import gestionBeneficiaires.Don;

public class ActionFactory {

	public Action creerDon(String date, double cout, String discription, double valeur, String moyenPayiement) {
	Action action = new Don(date, cout, discription,valeur,moyenPayiement);
	
		return action;
	}
	
	public Action creerService(String string, double d, String string2, int i, String string3) {
	//	Action action = new ();
		
		return null;
	}
	

}
