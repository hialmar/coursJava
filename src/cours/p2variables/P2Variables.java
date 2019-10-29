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
		unReel = 2.5;
		
		// on peut faire des calculs
		unEntier = unEntier + 1; 
		unEntier++; // raccourci identique à ci-dessus
		unEntier+=1; // encore la même chose
		
		unReel = unEntier; // fonctionne car un entier est aussi un réel
		
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
