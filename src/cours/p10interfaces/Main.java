package cours.p10interfaces;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Chat tom = new Chat();
		Oiseau titi = new Oiseau();
		
		// Créons une liste d'animaux
		Animal [] listeAnimaux = new Animal[2];
		
		// on peut y mettre tout objet de type Animal ou de type dérivé
		listeAnimaux[0] = tom;
		listeAnimaux[1] = titi;
		
		// on peut tous les faire crier
		for(Animal a : listeAnimaux) {
			a.crier();
		}
		
		// Créons une liste d'objets volants
		ObjetVolant[] listeObjetsVolants
			= new ObjetVolant[2];
		
		// titi est aussi un objet volant
		listeObjetsVolants[0]=titi;
		// comme un A380
		Avion a380 = new Avion();
		listeObjetsVolants[1]=a380;
		
		// on peut tous les faire voler
		for(ObjetVolant ov : listeObjetsVolants) {
			ov.voler();
		}
	}

}
