package cours.p7static;

// revoilà notre classe Chat
// ici on indique qu'on pourra l'utiliser en dehors du paquetage
public class Chat {
	// nos attributs sont privés à la classe
	private String cri;
	private String nom;
	private int age;
	
	// supposons que nous voulions compter tous les chats
	// si on utilise un attribut normal, chaque chat aura un compteur différent
	// en déclarant un attribut static il sera unique pour tous les objets de la même classe
	private static int compteur = 0;
	
	// on va aussi définir une méthode static (et donc ici aussi unique pour tous les objets de la même classe)
	public static int getCompteur() {
		// this n'est pas valable car il n'y a pas d'objet courant
		// this.age = 1;
		return compteur;
	}
	
	// les constructeurs et les méthodes sont, en général, publiques
	
	// le constructeur peut prendre des paramètres
	public Chat(String parametreNom) {
		cri = "Miaou";
		nom = parametreNom;
		age = 1;
		// on modifie l'attribut static
		compteur++;
	}
	
	// le constructeur sans paramètre est aussi appelé constructeur par défaut
	public Chat() {
		cri = "Miaou";
		nom = "Minou";
		age = 1;
		// on modifie l'attribut static
		compteur++;
	}

	// notre méthode crier
	public void crier() {
		System.out.println(nom + " dit "+cri);
	}
	
	// une autre méthode avec un paramètre
	public void renommer(String autreNom) {
		nom = autreNom;
	}
	
	public void setAge(int age) {
		// on peut utiliser this pour différentier entre un paramètre et un attribut de même nom
		this.age = age;
	}
	
	// une méthode peut renvoyer un résultat
	public String getNom() {
		return nom;
	}
	
	public int getAge() {
		return age;
	}
	
	public boolean estPlusVieuxQue(Chat autreChat) {
		// on peut appeler des méthodes sur un objet passé en paramètre
		if(age > autreChat.getAge())
			return true;
		else
			return false;
	}
	
	// une méthode avec deux paramètres
	// en java le passage de paramètre est fait par valeur pour les types de base
	// et par référence pour les objets
	public void seBattre(Chat autreChat, int duree) {
		System.out.println(nom + " se bat avec "+autreChat.getNom()+" pendant "+duree+" minutes.");
		this.crier();
		autreChat.crier();
		// attention aux effets de bord
		// cf. https://fr.wikipedia.org/wiki/Effet_de_bord_(informatique)
		// ici on modifie réellement l'objet passé en paramètre
		autreChat.renommer("Hercule a mal"); 
		// ici par contre durée n'est pas un objet et donc on ne modifie pas la variable du programme principal
		duree = 0; 
		// ici aussi on ne modifie pas la variable du programme principal
		// donc il n'y a pas d'effet de bord
		autreChat = new Chat("Tom"); 
	}
}
