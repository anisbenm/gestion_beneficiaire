package org.sfuture.beneficiaire;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import gestionBeneficiaires.PersonnePhysique;

public class ActeurFactory {
	
	// ajout personne
	 PersonnePhysique creerPersonnePhysique(String id, String nom, String prenom,String dateNaissance){
		    String pattern = "dd/MM/yyyy";
		    SimpleDateFormat format = new SimpleDateFormat(pattern);
		    
		    Date date=new Date();
		   try {
				date = format.parse(dateNaissance);
			} catch (java.text.ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				System.out.println(format.format(date));

		PersonnePhysique p =new PersonnePhysique(id,nom,prenom,date);
		return p;
	}
	 
	 void affichePersonnes(List<PersonnePhysique> listPersonnes){	
			int compt=0;
			for(PersonnePhysique i:listPersonnes){
				
				System.out.println("Personne "+compt+": "+i);
				compt++;
			}	
		}
}
