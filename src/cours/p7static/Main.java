package cours.p7static;

public class Main {

	public static void main(String[] args) {
		// créons deux chats
		Chat tom = new Chat("Tom");
		Chat hercule = new Chat("Hercule");
		
		// pour appeler une méthode static il faut indiquer le nom de la classe
		System.out.println("Il y a "+Chat.getCompteur()+" chats.");
		// remarque : System.out est un attribut static
		
		// appelons des méthodes
		tom.crier();
		hercule.crier();
		
		// appelons une méthode avec un paramètre
		tom.renommer("Tom le Chat");
		// une méthode peut modifier un objet
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
	}

}
