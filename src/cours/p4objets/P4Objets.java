package cours.p4objets;

import java.util.Scanner;

public class P4Objets {

	public static void main(String[] args) {
		// un premier objet : System.out
		System.out.println("Test!");
		// un autre objet qui lui ressemble : System.err
		System.err.println("Test!");
		
		// Créons un objet de type String (chaîne de caractères)
		String s = new String("Hello World!");
		System.out.println("s vaut <"+s+">");
		// Déclarons une autre variable et recopions la référence de l'objet créé précédemment.
		String s2 = s; 
		// vérifions que les deux variables correspondent au même objet
		System.out.println("(s == s2) vaut <"+(s == s2)+">");
		// Créons un autre objet en l'initialisant (ici on a réalisé une copie de l'objet).
		s2 = new String(s);
		System.out.println("s2 vaut <"+s2+">");
		// ici on a bien deux objets différents
		System.out.println("<(s == s2) vaut "+(s == s2)+">");
		// Mais les chaines de caractères internes sont bien les mêmes (il n'y a pas de duplication de mémoire)
		System.out.println("<(s.intern() == s2.intern()) vaut "+(s.intern() == s2.intern())+">");
		// On peut aussi appeller la méthode equals qui compare les chaines internes de l'objet courant et
		// d'un autre objet
		System.out.println("(s.equals(s2)) vaut <"+(s.equals(s2))+">");

		// Note : pour les chaines on peut aussi écrire :
		s2 = "test";
		
		// Appelons des méthodes sur un objet
		System.out.println("s2.charAt(0) renvoie <"+s2.charAt(0)+">");
		System.out.println("s2.substring(2) renvoie <"+s2.substring(2)+">");
		System.out.println("s2.toUpperCase() renvoie <"+s2.toUpperCase()+">");
		
		// Notons qu'ici l'objet n'est pas modifié
		// En effet les chaines de type String sont toujours constantes en Java
		System.out.println("s2 vaut toujours <"+s2+">");
		
		// Créons un objet qui permet de lire du texte
		// System.in est un objet représentant le flux d'entrée d'un programme
		// Comme cet objet ne permet de lire que des octets
		// On utilise en général un objet de type Scanner pour lire des lignes,
		// des nombres entiers, des réels...
		Scanner lecteur = new Scanner(System.in); 
		
		// lisons une ligne de texte
		System.out.println("Tapez quelque chose s'il vous plait :");
		String s3 = lecteur.nextLine();
		System.out.println("Vous avez tapé : "+s3);
		// ici aussi on a bien deux objets différents
		System.out.println("(s2 == s3) vaut <"+(s2 == s3)+">");
		// si on tape 'test' on aura la même chaine interne, sinon elle sera différente
		System.out.println("(s2.intern() == s3.intern()) vaut <"+(s2.intern() == s3.intern())+">");
		
		// quand on n'en a plus besoin on peut fermer l'objet de type Scanner
		lecteur.close();
		
	}

}
