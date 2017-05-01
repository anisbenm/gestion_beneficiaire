package org.sfuture.beneficiaire;

import java.util.ArrayList;
import java.util.List;

import gestionBeneficiaires.Action;
import gestionBeneficiaires.PersonnePhysique;

public class ActeurManager {
	


	public static void main(String[] args) {
		List<PersonnePhysique> listPersonnes = new ArrayList<PersonnePhysique>();
		//ActeurManager acteurManager=new ActeurManager();// pour acceder a la methode affichPers
		ActeurFactory ajoutActeur= new ActeurFactory();
	 
		PersonnePhysique one=ajoutActeur.creerPersonnePhysique("00000002","Mancer","Hi","11/11/1950");
		PersonnePhysique ti=ajoutActeur.creerPersonnePhysique("00000003","Trois","three","11/11/1950");	
		PersonnePhysique fi=ajoutActeur.creerPersonnePhysique("00000004","Quatre","four","11/11/1950");
		listPersonnes.add(one);
		listPersonnes.add(ti);
		listPersonnes.add(fi);
		
		one.ajoutContact((short)19,"rue","pierre",(short)93160,"noisy","France","tliuj@lj","0147258369");
		ActionFactory actionFactory = new ActionFactory();
		Action action = actionFactory.creerDon("02,03,2017",452.50,"aide pour le aid alidha",450,"cheque");
		one.addAction(action); 
		((ActeurFactory) ajoutActeur).affichePersonnes(listPersonnes);//pouquoi il demande le cast
		
		
		

	}

}
