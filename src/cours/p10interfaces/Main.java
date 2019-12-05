package cours.p10interfaces;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Chat tom = new Chat();
		Oiseau titi = new Oiseau();
		
		// Créons une liste d'animaux
		ArrayList<Animal> listeAnimaux = new ArrayList<Animal>();
		
		// on peut y mettre tout objet de type Animal ou de type dérivé
		listeAnimaux.add(tom);
		listeAnimaux.add(titi);
		
		// on peut tous les faire crier
		for(Animal a : listeAnimaux) {
			a.crier();
		}
		
		// Créons une liste d'objets volants
		ArrayList<ObjetVolant> listeObjetsVolants
			= new ArrayList<ObjetVolant>();
		
		// titi est aussi un objet volant
		listeObjetsVolants.add(titi);
		// comme un A380
		Avion a380 = new Avion();
		listeObjetsVolants.add(a380);
		
		// on peut tous les faire voler
		for(ObjetVolant ov : listeObjetsVolants) {
			ov.voler();
		}
	}

}
