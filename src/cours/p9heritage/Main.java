package cours.p9heritage;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Chat tom = new Chat();
		Oiseau titi = new Oiseau();
		
		tom.crier();
		titi.crier();
		tom.ronronner();
		titi.voler();
		
		// Créons une liste d'animaux
		ArrayList<Animal> listeAnimaux = new ArrayList<Animal>();
		
		// on peut y mettre tout objet de type Animal ou de type dérivé
		listeAnimaux.add(tom);
		listeAnimaux.add(titi);
		
		// on peut tous les faire crier
		for(Animal a : listeAnimaux) {
			a.crier();
		}

	}

}
