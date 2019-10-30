package cours.p2variables;

public class P2Variables {

	public static void main(String[] args) {
		// quelques variables
		int unEntier = 1; // entier
		double unReel = 0.5; // réel
		char unCaractere = 'a'; // caractère
		boolean unBooleen = true; // booléen
		
		unEntier = 2; // attention le signe = est utilisé pour faire une affectation
		unBooleen = false;
		unBooleen = unEntier == 2; // voilà le signe == utlisé pour comparer
		unReel = 2.5;
		
		// on peut faire des calculs
		unEntier = unEntier + 1; 
		// affichons l'entier
		System.out.println("unEntier vaut "+unEntier);
		unEntier++; // raccourci identique à ci-dessus
		System.out.println("unEntier vaut désormais "+unEntier);
		unEntier+=1; // encore la même chose
		System.out.println("unEntier vaut maintenant "+unEntier);
		
		// la division de deux entiers est une division entière :
		unEntier = unEntier / 3; // unEntier valait 5 et on obtiendra 1 car le quotient de la division entière vaut 1.
		System.out.println("unEntier vaut désormais le quotient "+unEntier);
		// on peut aussi obtenir le reste d'une division entière (ici de 1 par 2) et l'afficher directement :
		System.out.println("Reste de la division "+ (unEntier % 2)); // il vaut mieux paranthéser pour que ce soit plus clair
		
		unReel = unEntier; // fonctionne car un entier est aussi un réel
		System.out.println("unReel vaut "+unReel);
		
		unReel = 5.2; // une valeur avec partie fractionnaire
		
		// a = b; // ne fonctionne pas
		unEntier = (int) unReel; // on peut forcer le type
		
		System.out.println("Affichons "+unEntier+" "+unReel+" "+unCaractere+" "+unBooleen);
		
		// définition d'une constante
		final double pi = 3.14;
		
		unReel = pi * 2;
		
		// provoque une erreur : 
		// pi = 3.14159;
		
	}

}
