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
		
		tom.changerCri(null);
		
		try {
			tom.miauler();
		} catch (ExceptionChatMuet e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// mais seuls les oiseaux peuvent voler
		for(Animal a : listeAnimaux) {
			// testons si l'animal est un oiseau
			if (a instanceof Oiseau) {
				// transtypons vers le type oiseau
				Oiseau unOiseau = (Oiseau) a;
				// appelons la méthode voler
				unOiseau.voler();
			}
		}

	}

}
