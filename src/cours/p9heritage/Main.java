package cours.p9heritage;

public class Main {

	public static void main(String[] args) {
		Chat tom = new Chat();
		Oiseau titi = new Oiseau();
		
		tom.crier();
		titi.crier();
		tom.ronronner();
		titi.voler();
		
		// Créons une liste d'animaux
		Animal [] tableauDAnimaux = new Animal[2];
		
		// on peut y mettre tout objet de type Animal ou de type dérivé
		tableauDAnimaux[0] = tom;
		tableauDAnimaux[1] = titi;
		
		// on peut tous les faire crier
		for(Animal a : tableauDAnimaux) {
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
		for(Animal a : tableauDAnimaux) {
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
