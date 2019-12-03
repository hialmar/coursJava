package cours.p6methodes;

public class Main {

	public static void main(String[] args) {
		// créons deux chats
		Chat tom = new Chat("Tom");
		Chat hercule = new Chat("Hercule");
		
		// appelons des méthodes
		tom.crier();
		hercule.crier();
		
		// appelons une méthode avec un paramètre
		// une méthode peut modifier un objet
		tom.renommer("Tom le Chat");
		tom.crier();	
		
		tom.setAge(4);
		hercule.setAge(3);
		
		// une méthode qui renvoie un booléen peut être utilisée dans une inscruction conditionnelle ou un tant que
		if(tom.estPlusVieuxQue(hercule))
			System.out.println("Tom est le plus vieux");
		else
			System.out.println("Tom n'est pas le plus vieux");
				
		int duree = 10;
		// testons les passages de paramètres
		// en Java les paramètres sont toujours passés par valeur pour les types de base
		// et par référence pour les objets
		tom.seBattre(hercule, duree);
		// ici hercule a été modifié
		hercule.crier();
		System.out.println("Duree n'est pas modifiée : "+duree);
	}

}
