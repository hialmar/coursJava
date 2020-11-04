package cours.p12enums;

public class Main {

	public static void main(String[] args) {
		// Déclaration de quelques jours
		JourSemaine jour = JourSemaine.LUNDI;
		JourSemaine lendemain = JourSemaine.MARDI;
		JourSemaine precedent = JourSemaine.DIMANCHE;
		
		jour.afficheJour();
		
		// On peut les afficher
		System.out.println("Hier : "+precedent);
		System.out.println("Aujourd'hui : "+jour);
		System.out.println("Demain : "+lendemain);
		
		System.out.println(jour.estSuiviDe(lendemain));
		System.out.println(jour.estSuiviDe(precedent));
		
		System.out.println(precedent.estSuiviDe(jour));
		
		// On peut récupérer leur numéro d'ordre
		System.out.println(jour.ordinal());
		
		// Et donc on peut les comparer :
		if(jour.ordinal()<lendemain.ordinal()) {
			System.out.println("Demain est supérieur à aujourd'hui");
		}
		// ou comme cela
		if(jour.compareTo(lendemain)<0) {
			System.out.println("Demain est supérieur à aujourd'hui");
		}

		// On peut aussi parcourir l'ensemble des jours :
		for(JourSemaine j : JourSemaine.values()) {
			System.out.println(j);
		}
		
		// On peut aussi affecter un jour à partir de la chaine correspondante
		JourSemaine nouveauJour = JourSemaine.valueOf("MARDI");
		System.out.println(nouveauJour);
		
		// ceci provoque une exception IllegalArgumentException
		JourSemaine nouveauJourFaux = JourSemaine.valueOf("JOURDI");
		System.out.println(nouveauJourFaux);
	}

}
